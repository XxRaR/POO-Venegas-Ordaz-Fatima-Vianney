
package com.mycompany.controldecelular;

public class Celular {
    String marca;
    String dueno;
    double precio;
    boolean estado;

    // Constructor
    public Celular(String marca, String dueno, double precio) {
        this.marca = marca;
        this.dueno = dueno;
        this.precio = precio;
        this.estado = false; // Inicialmente deshabilitado
    }

    // Métodos get y set
    /*Metodo para obtener o regresar el valor dado a la variable Marca */
    public String getMarca() {
        return marca;
    }
    //Metodo para modificar o establecer la variable Marca
    public void setMarca(String marca) {
        this.marca = marca;
    }
    /*Metodo para obtener o regresar el valor dado a la variable duenio = dueño */
    public String getDueno() {
        return dueno;
    }
    //Metodo para modificar o establecer la variable duenio = dueño
    public void setDueno(String duenio) {
        this.dueno = dueno;
    }
    /*Metodo para obtener o regresar el valor dado a la variable Precio */
    public double getPrecio() {
        return precio;
    }
    //Metodo para modificar o establecer la variable Precio
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    // Método toString para imprimir los datos del celular
    @Override
    public String toString() {
       //Se regresan los datos y se imprimen
        return "Celular [marca= " + marca + ", dueno= " + dueno + ", precio= " + precio + ", estado= " + (estaHabilitado()? "Si esta habilitado":"No esta habilitado") + '}';
    }
    // Método para marcar el celular como habilitado de la variable estado
    public void marcarComoHabilitado() {
        this.estado = true;
    }

    // Método para verificar si el celular está habilitado con la variable estado
    public boolean estaHabilitado() {
        return estado;
    }

   
}


