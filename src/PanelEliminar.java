package src;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import javax.swing.table.DefaultTableModel;
import static src.MPersona.Arrpersona;

public class PanelEliminar extends JPanel implements ActionListener {

    JTable tabla;
    JScrollPane scroll = new JScrollPane();
    JButton salir, btnEliminar, btnModificar;
    JTextField txtFila, txtColumna, txtnuevodato;

    MPersona mp = new MPersona();
    ArrayList<Persona> datosPer = new ArrayList<Persona>();

    public PanelEliminar() {
        datosPer = mp.Datos();
        String titulos[] = {"Nombre", "Telefono", "Correo Electronico", "Fecha de cumpleaños "};
        String info[][] = obtenerDatos();
        setLayout(new GridLayout(3, 2));
        tabla = new JTable(info, titulos);
        tabla.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        scroll.setViewportView(tabla);
        add(scroll);
        btnEliminar = new JButton("Eliminar");
        btnEliminar.addActionListener(this);
        add(btnEliminar);
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
        if (e.getSource() == btnEliminar) {
            
            int fila = tabla.getSelectedRow();
            
            if (fila >= 0) {
                
                int rpta = JOptionPane.showConfirmDialog(this, "Deseas eliminar la fila", "Sistema", JOptionPane.INFORMATION_MESSAGE);
                if (rpta == JOptionPane.YES_OPTION) {
                    Arrpersona.remove(fila);
                    JOptionPane.showMessageDialog(this, "Actualice la ventana");

                    
                }
            } else {
                JOptionPane.showMessageDialog(null, "Seleccione fila");
            }
        }
   }

}