package src;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PanelDatos extends JPanel implements ActionListener
{
  private JButton btnGuardar, btnMenu;
  private JTextField txtNombre, txtTelefono, txtCorreoe, txtFecha;
  
  MPersona mpa = new MPersona();
  
  public PanelDatos()
  {
    setLayout(new GridLayout(5,2));
    JLabel lblNombre = new JLabel("Nombre: ", JLabel.RIGHT);
    txtNombre = new JTextField(40);
    add(lblNombre);
    add(txtNombre);

    JLabel lblTelefono = new JLabel("Tel?fono: ", JLabel.RIGHT);
    txtTelefono = new JTextField(15);
    add(lblTelefono);
    add(txtTelefono);
    
    JLabel lblCorreoe = new JLabel("Correo electronico: ", JLabel.RIGHT);
    txtCorreoe = new JTextField(30);
    add(lblCorreoe);
    add(txtCorreoe);
    
    JLabel lblFecha = new JLabel("Fecha de cumplea?os: ", JLabel.RIGHT);
    txtFecha = new JTextField(30);
    add(lblFecha);
    add(txtFecha);

    btnGuardar = new JButton("Guardar");
    btnGuardar.addActionListener(this);
    
    JLabel lblNada = new JLabel("", JLabel.RIGHT);
    add(lblNada);
    add(btnGuardar);
    
  }
  
  public void actionPerformed(ActionEvent e) {
     if(e.getSource()==btnGuardar){
       if(txtNombre.getText()==null || txtNombre.getText().isEmpty())
        { JOptionPane.showMessageDialog(null, "Debes colocar al menos el nombre",
            "Aviso", JOptionPane.INFORMATION_MESSAGE);
            txtNombre.requestFocus();
        }
       else
        if(txtTelefono.getText()==null || txtTelefono.getText().isEmpty())
        { JOptionPane.showMessageDialog(null, "Debes capturar su telefono",
            "Aviso", JOptionPane.INFORMATION_MESSAGE);
            txtTelefono.requestFocus();
        }
        else
        {
          mpa.agregar(txtNombre.getText(),  txtTelefono.getText(),
          txtCorreoe.getText(), txtFecha.getText());
          JOptionPane.showMessageDialog(null, "Se guardaran los datos",
            "Aviso", JOptionPane.INFORMATION_MESSAGE);
            txtNombre.setText(null);
            txtTelefono.setText(null);
            txtCorreoe.setText(null);
            txtFecha.setText(null);
            txtNombre.requestFocus();
        }

     }
      if(e.getSource()==btnMenu){
      JFrameMostrarMenu jft = new JFrameMostrarMenu();
      }
  }
}