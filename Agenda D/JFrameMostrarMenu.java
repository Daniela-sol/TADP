import javax.swing.*;
import java.awt.*;

public class JFrameMostrarMenu extends JFrame
{
   PanelMenu menu = new PanelMenu();
   
    public JFrameMostrarMenu()
   {  
      initComponents();
   }
   
   private void initComponents()
   {
      setSize(350, 200);
      setTitle("MENÚ AGENDA");
      setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
      setResizable(false);
      setContentPane(menu);
      setVisible(true);
       
   }   
}