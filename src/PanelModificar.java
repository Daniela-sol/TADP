package src;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import javax.swing.table.DefaultTableModel;
import static src.MPersona.Arrpersona;

public class PanelModificar extends JPanel implements ActionListener {

    JTable tabla;
    JScrollPane scroll = new JScrollPane();
    JButton salir, btnEliminar, btnModificar;
    JTextField txtFila, txtColumna, txtnuevodato;

    MPersona mp = new MPersona();
    ArrayList<Persona> datosPer = new ArrayList<Persona>();

    public PanelModificar () {
        datosPer = mp.Datos();
        String titulos[] = {"Nombre",  "Telefono", "Correo Electronico", "Fecha de cumpleaños" };
        String info[][] = obtenerDatos();
        setLayout(new GridLayout(2, 2));
        tabla = new JTable(info, titulos);
        tabla.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        scroll.setViewportView(tabla);
        add(scroll);
        JLabel lblFila = new JLabel("Nuevo dato: ", JLabel.CENTER);
        txtFila = new JTextField(15);
        add(lblFila);
        add(txtFila);
        btnModificar = new JButton("Modificar");
        btnModificar.addActionListener(this);
        add(btnModificar);
    }

    private String[][] obtenerDatos() {
        int x = 0;
        String informacion[][] = new String[datosPer.size()][4];
        Iterator<Persona> itrPersona = datosPer.iterator();
        while (itrPersona.hasNext()) {
            Persona persona = itrPersona.next();
            informacion[x][0] = persona.getNombre();
            informacion[x][1] = persona.getTelefono();
            informacion[x][2] = persona.getCorreoe();
            informacion[x][3] = persona.getFecha();
            x++;
            
            
        }
        return informacion;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnModificar) {
            try {
                int fila = tabla.getSelectedRow();
                int columna = tabla.getSelectedColumn();
                Persona persona = new Persona();
                persona = Arrpersona.get(fila);
                //DefaultTableModel modelo = new DefaultTableModel();
                switch (columna) {
                    case 0:
                        String nuevoNombre = txtFila.getText();
                        persona.setNombre(nuevoNombre);
                        JOptionPane.showMessageDialog(this, "Actualice la ventana");
                        break;
                    case 1:
                        String nuevoTelefono = txtFila.getText();
                        persona.setTelefono(nuevoTelefono);
                        JOptionPane.showMessageDialog(this, "Actualice la ventana");
                        break;
                    case 2:
                        String nuevoCorreo = txtFila.getText();
                        persona.setCorreoe(nuevoCorreo);
                        JOptionPane.showMessageDialog(this, "Actualice la ventana");
                        break;
                    case 3:
                        String nuevofecha = txtFila.getText();
                        persona.setFecha(nuevofecha);
                        JOptionPane.showMessageDialog(this, "Actualice la ventana");
                        break;
                }
                Arrpersona.set(fila, persona);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Seleccione la columna y la fila que desea modificar, y agregue el nuevo dato");
            }

        }

    }

}