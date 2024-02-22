
package com.mycompany.controldecelular;

import java.util.Scanner;


public class ControldeCelular {

    public static void main(String[] args) {
        //Se llama a Scanner para que usuario ingrese datos
        Scanner L = new Scanner(System.in);
        //Se declaran los atributos
        String marca;
        String dueno;
        double precio;
        boolean estado;
        
        //Se inicializa una variable en nulo
        Celular cel = null;
        //Se crea un ciclo para la creacion del menu
        do{ //Se inicia el ciclo do while
            //Instrucciones
            System.out.println("--- Control de celular ---");
            System.out.println("1. Construir un celular");
            System.out.println("2. Habilitar celular");
            System.out.println("3. Mostrar datos del celular");
            System.out.println("4. Salir");
            System.out.print("Selecciona una opción: ");
            int opcion = L.nextInt(); //Se crea la variable opcion
            L.nextLine();//Limpiar el buffer
            
            /*Menu, lo creamos con la sentencia switch que nos permite elegir entre las opciones */
            switch (opcion) {
                /*Se marca el primer caso donde dejamos los pasos que se deben 
                realizar en caso el usuario elija esta opcion */
                case 1:
                    // Crear un celular
                    System.out.println("Introduce la marca del celular: "); //Para que el usuario introduzca los datos
                    marca = L.next(); //Se lee los datos
                    System.out.println("Introduce el dueño del celular: ");
                    dueno = L.next();
                    System.out.println("Introduce el precio del celular: ");
                    precio = L.nextDouble();
                    cel = new Celular(marca, dueno, precio); //Se crea un nuevo objeto dentro de Celular
                    System.out.println("Celular creado exitosamente.");
                    break;
                case 2:
                    // Habilitar el celular
                    if (cel != null) { //Es una condicional que comprueba si la variable tiene un valor nulo o no
                        cel.marcarComoHabilitado(); //llama al metodo marcarComoHabilitado de la clase Celular
                        System.out.println("Celular habilitado correctamente."); //True
                    } else {
                        System.out.println("Celular deshabilitado... Debes de crear un celular primero."); //False
                    }
                    break;
                case 3:
                    // Mostrar los datos del celular
                    if (cel != null) { //Es una condicional que comprueba si la variable tiene un valor nulo o no
                        System.out.println(cel); //True
                    }/*False */else {  //Si la condicion no se cumple se imprimira lo siguiente
                        System.out.println("Celular deshabilitado... Debes de crear un celular primero."); 
                    }
                    break;
                case 4:
                    // Salir del programa
                    System.out.println("Nos vemos pronto ;)");
                    System.exit(0); //Se sale del programa
                    break; 
                default:
                    System.out.println("La opcion no es valida."); 
                    /*Indica que si la opcion elegida no se encuentra en el menu 
                    entonces aparecera la opcion no es valida*/
            }
        }while(true); //Se cierra el ciclo do while
    }
}
     