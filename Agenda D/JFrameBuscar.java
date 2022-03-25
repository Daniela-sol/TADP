import javax.swing.*;
import java.awt.*;

public class JFrameBuscar extends JFrame
{
   PanelBuscar buscar = new PanelBuscar();
   
    public JFrameBuscar()
   { 
     initComponents();
     
   }
   
   private void initComponents()
   {
      this.setEnabled(true);
      setSize(350, 200);
      setTitle("BUSCAR");
      setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
      setResizable(false);
      setContentPane(buscar);
      setVisible(true);
   }   
}