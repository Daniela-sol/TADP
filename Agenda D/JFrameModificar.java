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
      this.setEnabled(true);
      setSize(350, 200);
      setTitle("MODIFICAR");
      setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
      setResizable(false);
      setContentPane(datos);
      setVisible(true);
       
   }   
}