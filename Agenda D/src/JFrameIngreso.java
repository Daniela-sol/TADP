package src;
import javax.swing.*;
import java.awt.*;

public class JFrameIngreso extends JFrame
{
   PanelIngreso mostrar = new PanelIngreso();
   
    public JFrameIngreso()
   { 
     initComponents();
     
   }
   
   private void initComponents()
   {
      this.setEnabled(true);
      setSize(350, 200);
      setTitle("Usuario y Contraseņa");
      setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
      setResizable(false);
      setContentPane(mostrar);
      setVisible(true);
   }   
}