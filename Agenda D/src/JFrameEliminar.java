package src;
import javax.swing.*;
import java.awt.*;

public class JFrameEliminar extends JFrame
{
   PanelEliminar datos = new PanelEliminar();
   
    public JFrameEliminar()
   { 
     initComponents();
   }
   
   private void initComponents()
   {
      setSize(350, 300);
      setTitle("ELIMINAR");
      setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
      setResizable(false);
      setContentPane(datos);
      setVisible(true);
       
   }   
}