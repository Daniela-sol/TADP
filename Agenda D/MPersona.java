import java.util.*;

public class MPersona
{
  static ArrayList<Persona> Arrpersona = new ArrayList<Persona>();
  private Persona objPersona;
  
  public MPersona()
  {}
  
  public void agregar(String nom, String tel, String correo, String fecha)
  {
    objPersona = new Persona();
    objPersona.setNombre(nom);
    objPersona.setTelefono(tel);
    objPersona.setCorreoe(correo);
    objPersona.setFecha(fecha);
    Arrpersona.add(objPersona);//Agrega el objeto al arrayList
  }
   
  public ArrayList Datos()
  {
     return Arrpersona;
  }
}