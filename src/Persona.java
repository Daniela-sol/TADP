package src;
public class Persona {
    private String Nombre;
    private String Telefono;
    private String correoe;
    private String Fecha;
    
    public String getNombre(){
     return Nombre;
    }
    
    public void setNombre(String nombre){
        this.Nombre = nombre;
    }

    
    public String getTelefono(){
     return Telefono;
    }
    
    public void setTelefono(String telefono){
        this.Telefono = telefono;
    }
   
   public String getFecha(){
     return Fecha;
    }
    
    public void setFecha(String Fecha){
        this.Fecha = Fecha;
    }
    
     public String getCorreoe(){
     return correoe;
    }
    
    public void setCorreoe(String correoe){
        this.correoe = correoe;
    }

   
}