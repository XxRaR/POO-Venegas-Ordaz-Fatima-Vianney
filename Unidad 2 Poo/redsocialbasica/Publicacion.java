
package com.mycompany.redsocialbasica;
import java.util.Date;

public class Publicacion {
    //Declaracion de los atributos
    String autor;
    String contenido;
    Date fechaPublicacion;
    int likes;
    //Constructor
    public Publicacion(String autor, String contenido, Date fechaPublicacio, int likes) {
        this.autor = autor;
        this.contenido = contenido;
        this.fechaPublicacion = new Date(); //El constructor se inicia en la fecha de creacion de la publicacion
        this.likes = 0; //Se inicializa en cero
    }
    //Metodo get
    /*Metodo para obtener o regresar el valor dado a la variable Autor */
    public String getAutor() {
        return autor;
    }
    /*Metodo para obtener o regresar el valor dado a la variable Contenido */
    public String getContenido() {
        return contenido;
    }
    /*Metodo para obtener o regresar el valor dado a la variable FechaPublicacion */
    public Date getFechaPublicacion() {
        return fechaPublicacion;
    }
    /*Metodo para obtener o regresar el valor dado a la variable Likes */
    public int getLikes() {
        return likes;
    }
    //Metodo para incrementar likes
    public void incrementarLike(){
        likes ++; //Se incrementa en 1 la variable likes
    }
 
    
}
