
package com.mycompany.redsocialbasica;

import java.util.Scanner;
import java.util.Date;

public class RedSocialBasica {

    public static void main(String[] args) {
        
        Scanner L = new Scanner(System.in); //Se llama a Scanner para el ingreso de datos por usuario
        //Declaracion de los atributos
        String autor;
        String contenido;
        Date fechaPublicacion = new Date();
        int likes = 0;
        Publicacion publi = null; //Se inicializa una variable en nulo
        
        int opcion; //Declaramos la variable opcion
        do{ //Se inicia el ciclo do while
            System.out.println("---Gestor de Publicaciones---"); //Impresion de pantalla
            System.out.println("1. Crear una nueva publicación");
            System.out.println("2. Dar like a la publicación");
            System.out.println("3. Mostrar la publicación");
            System.out.println("4. Salir");
            System.out.print("Selecciona una opción: ");
            opcion = L.nextInt();
            L.nextLine();//Limpiar el buffer
            //Menu
            switch (opcion) {
                case 1:
                    //Creacion de una publicacion
                    System.out.println("Ingresa el autor de la publicación: "); //Se piden los datos
                    autor = L.next(); //Se leen los datos ingresados por el usuario
                    System.out.println("Ingresa el contenido de la publicación: ");
                    contenido = L.next();
                    
                    publi = new Publicacion(autor, contenido, fechaPublicacion, likes);
                    //Se crea un nuevo objeto dentro de publicacion
                    
                    System.out.println("Publicación creada con exito."); //Impresion
                    break;
                case 2:
                    //Se da like a la publicacion
                    
                    if (publi != null) { //Condicional 
                        publi.incrementarLike(); //llamamos al metodo incrementalLike de la clase publicacion
                        System.out.println("Has dado me gusta a la publicación."); //True 
                    } else {
                        System.out.println("Debes crear una publicacion primero"); //False
                    }
                    break;
                case 3:
                    //Mostrar la publicacion
                    //True
                    if (publi != null) { //Condicional que nos dice que si la condicion se cumple pues entonces
                        System.out.println("Autor: " + publi.getAutor());//llamamos al metodo get
                        //Se obtendran los datos de la variable Autor
                        System.out.println("Contenido: " + publi.getContenido()); //llamamos al metodo get
                        //Se obtendran los datos de la variable Contenido
                        System.out.println("Fecha de publicación: " + publi.getFechaPublicacion()); //llamamos al metodo get
                        //Se obtendran los datos de la variable FechaPublicacion
                        System.out.println("Likes: " + publi.getLikes()); //llamamos al metodo get
                        //Se obtendran los datos de la variable Likes
                    
                    }/*False */ else { //Sino se cumple se imprimira lo siguiente
                        System.out.println("Primero debes crear una publicación.");
                    }
                    break;
                case 4: 
                    //Salir del programa
                    System.out.println("Nos vemos luego... ;) "); 
                    break; //Sale del programa
                default:
                    System.out.println("La opcion no es valida."); //Si la opcion elegida no es ninguna se imprimira esto
            }
        }while(opcion != 4); //Se cierra el ciclo do while
    }

}
