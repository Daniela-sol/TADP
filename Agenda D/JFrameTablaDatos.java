import javax.swing.*;
import java.awt.*;

public class JFrameTablaDatos extends JFrame
{
  TablaDatos md = new TablaDatos();
  
  public JFrameTablaDatos()
  {
   initComponents();
  }
  
  private void initComponents()
  {
     setSize(350,300);
     setTitle("CONTACTOS REGISTRADOS");
     setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
     setResizable(false);
     setContentPane(md);
     setVisible(true);
  }
}