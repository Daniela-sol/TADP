import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PanelMenu extends JPanel implements ActionListener
{
   private JButton btnAgregar, btnBuscar, btnConsultar, btnEliminar, btnModificar, btnSalir;
  
   public PanelMenu()
   {
      setLayout(new GridLayout(3,2));
           
      btnAgregar = new JButton("Agregar");
      btnAgregar.addActionListener(this);
      btnBuscar = new JButton("Buscar");
      btnBuscar.addActionListener(this);
      btnConsultar = new JButton("Mostrar todos");
      btnConsultar.addActionListener(this);
      btnEliminar = new JButton("Eliminar");
      btnEliminar.addActionListener(this);
      btnModificar = new JButton("Modificar");
      btnModificar.addActionListener(this);
      btnSalir = new JButton("Salir");
      btnSalir.addActionListener(this);
    
      add(btnAgregar);
      add(btnBuscar);
      add(btnConsultar);
      add(btnEliminar);
      add(btnModificar);
      add(btnSalir);
   }
   
   public void actionPerformed(ActionEvent e){
   if(e.getSource()== btnAgregar){
      JFrameDatos datos = new JFrameDatos();
   }
   
   if(e.getSource()== btnBuscar){
      JFrameBuscar md = new JFrameBuscar();
   }
   
   if(e.getSource()== btnConsultar){
      JFrameTablaDatos md = new JFrameTablaDatos();
   }
   
   if(e.getSource()== btnEliminar){
      JFrameEliminar datos = new JFrameEliminar();
   }
   
   if(e.getSource()== btnModificar){
      JFrameModificar datos = new JFrameModificar();
   }
   
   if(e.getSource() == btnSalir){
     System.exit(0);
   }
  }
 }