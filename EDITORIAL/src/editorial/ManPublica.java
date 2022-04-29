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
    }
    
    public void alta (String editor)
    {
         objPeriodico = new Periodico();
         objPeriodico.setTitulo(objPublicacion.getTitulo());
         objPeriodico.setPrecio(objPublicacion.getPrecio());
         objPeriodico.setNumpag(objPublicacion.getNumpag());
         objPeriodico.setEditor(editor);
         Arrpublica.add(objPeriodico);
    }
    
    public void desplegar()
  {
     System.out.println("...PUBLICACIONES REGISTRADAS...");
     
     Iterator<Publicacion> itrPublica = Arrpublica.iterator();
     while(itrPublica.hasNext()){
         Publicacion publica = itrPublica.next();
         if (publica instanceof Libro ) {
          Libro book = new Libro();
          book = (Libro)publica;
          System.out.println("Titulo del libro: " + book.getTitulo());
          System.out.println("Precio: " + book.getPrecio());
          System.out.println("Número de páginas: " + book.getNumpag());
          System.out.println("ISBN: " + book.getISBN());
          System.out.println("Autor: " + book.getAutor());
          System.out.println("Edición: " + book.getEdicion());
         }
         else if (publica instanceof Revista ) {
          Revista maga = new Revista();
          maga = (Revista)publica;
          System.out.println("Titulo de la revista: " + maga.getTitulo());
          System.out.println("Precio: " + maga.getPrecio());
          System.out.println("Número de páginas: " + maga.getNumpag());
          System.out.println("ISSN: " + maga.getISSN());
          System.out.println("Número : " + maga.getNumero());
         }
         else if (publica instanceof Periodico ) {
          Periodico paper = new Periodico();
          paper = (Periodico)publica;
          System.out.println("Titulo del periódico: " + paper.getTitulo());
          System.out.println("Precio: " + paper.getPrecio());
          System.out.println("Número de páginas: " + paper.getNumpag());
          System.out.println("Editor: " + paper.getEditor());
         }
     }
   }
}
