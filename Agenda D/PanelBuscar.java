import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PanelBuscar extends JPanel implements ActionListener
{
  private JButton btnGuardar, btnBuscar;
  private JTextField txtNombre, txtTelefono, txtCorreoe, txtFecha;
  

  public PanelBuscar()
  {
    setLayout(new GridLayout(5,2));
    JLabel lblNombre = new JLabel("Nombre: ", JLabel.RIGHT);
    txtNombre = new JTextField(40);
    add(lblNombre);
    add(txtNombre);
    
    JLabel lblNada = new JLabel("", JLabel.RIGHT);
    add(lblNada);
    
    btnBuscar = new JButton("Buscar");
    btnBuscar.addActionListener(this);
    add(btnBuscar);

    JLabel lblTelefono = new JLabel("Teléfono: ", JLabel.RIGHT);
    txtTelefono = new JTextField(15);
    add(lblTelefono);
    add(txtTelefono);
    
    JLabel lblCorreoe = new JLabel("Correo electronico: ", JLabel.RIGHT);
    txtCorreoe = new JTextField(30);
    add(lblCorreoe);
    add(txtCorreoe);
    
    JLabel lblFecha = new JLabel("Fecha de cumpleaños: ", JLabel.RIGHT);
    txtFecha = new JTextField(30);
    add(lblFecha);
    add(txtFecha);

  }
  
  
   public void actionPerformed(ActionEvent e) {
      if(e.getSource()==btnBuscar){
        
     }
  }
}