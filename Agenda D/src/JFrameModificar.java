package src;
import javax.swing.*;
import java.awt.*;

public class JFrameModificar extends JFrame
{
   PanelModificar datos = new PanelModificar();
   
    public JFrameModificar()
   { 
     initComponents();
   }
   
   private void initComponents()
   {
      setSize(350, 300);
      setTitle("MODIFICAR");
      setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
      setResizable(false);
      setContentPane(datos);
      setVisible(true);
       
   }   
}