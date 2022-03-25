import javax.swing.*;
import java.awt.*;

public class JFrameDatos extends JFrame
{
   PanelDatos datos = new PanelDatos();
   
    public JFrameDatos()
   { 
     initComponents();
   }
   
   private void initComponents()
   {
      this.setEnabled(true);
      setSize(350, 200);
      setTitle("AGREGAR");
      setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
      setResizable(false);
      setContentPane(datos);
      setVisible(true);
       
   }   
}