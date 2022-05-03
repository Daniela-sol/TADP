/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package editorial;

import java.util.ArrayList;
import java.util.Iterator;
import jerarquiaHerencia.Libro;
import jerarquiaHerencia.Publicacion;
import jerarquiaHerencia.Revista;
import jerarquiaHerencia.Periodico;
import vista.ConsultaPeriodico;
import vista.ConsultaLibro;
import vista.ConsultaRevista;
/**
 *
 * @author Daniela
 */
public class ManPublica {
    static ArrayList<Publicacion> Arrpublica = new ArrayList<Publicacion>();
    private Libro objLibro;
    private Revista objRevista;
    private Periodico objPeriodico;
    private Publicacion objPublicacion;
    
    public ManPublica(String tit, double precio, int np)
    {
       
        objPublicacion = new Publicacion();
        objPublicacion.setTitulo(tit);
        objPublicacion.setPrecio(precio);
        objPublicacion.setNumpag(np);
    }
    
    public void alta (String ISBN, String Autor, String edicion)
    {
         objLibro = new Libro();
         objLibro.setTitulo(objPublicacion.getTitulo());
         objLibro.setPrecio(objPublicacion.getPrecio());
         objLibro.setNumpag(objPublicacion.getNumpag());
         objLibro.setAutor(Autor);
         objLibro.setISBN(ISBN);
         objLibro.setEdicion(edicion);
         Arrpublica.add(objLibro);
         
         String a, b, c, d, e, f;
        ConsultaLibro tp = new ConsultaLibro();
        a = objLibro.getTitulo();
        b = String.valueOf(objLibro.getPrecio());
        c = String.valueOf(objLibro.getNumpag());
        d = objLibro.getISBN();
        e = objLibro.getAutor();
        f = objLibro.getEdicion();
        String tpi[] = {a, b, c, d, e, f,};
        tp.llenarT(tpi);
    }

   
    public void alta (String ISSN, int num)
    {
         objRevista = new Revista();
         objRevista.setTitulo(objPublicacion.getTitulo());
         objRevista.setPrecio(objPublicacion.getPrecio());
         objRevista.setNumpag(objPublicacion.getNumpag());
         objRevista.setNumero(num);
         objRevista.setISSN(ISSN);
         Arrpublica.add(objRevista);
         
        String a, b, c, d, e;
        ConsultaRevista tp = new ConsultaRevista();
        a = objRevista.getTitulo();
        b = String.valueOf(objRevista.getPrecio());
        c = String.valueOf(objRevista.getNumpag());
        d = String.valueOf(objRevista.getNumero());
        e = objRevista.getISSN();
        String tpi[] = {a, b, c, d, e};
        tp.llenarT(tpi);
    }
    
    public void alta (String editor)
    {
         objPeriodico = new Periodico();
         objPeriodico.setTitulo(objPublicacion.getTitulo());
         objPeriodico.setPrecio(objPublicacion.getPrecio());
         objPeriodico.setNumpag(objPublicacion.getNumpag());
         objPeriodico.setEditor(editor);
         Arrpublica.add(objPeriodico);
         
        String a, b, c, d;
        ConsultaPeriodico tp = new ConsultaPeriodico();
        a = objPeriodico.getTitulo();
        b = String.valueOf(objPeriodico.getPrecio());
        c = String.valueOf(objPeriodico.getNumpag());
        d = ((Periodico) objPeriodico).getEditor();
        String tpi[] = {a, b, c, d};
        tp.llenarT(tpi);
    }
    
    public ArrayList Datos(){
        return Arrpublica;
    }
    
   
}
