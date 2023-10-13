/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author vina
 */
public class Libros {
    protected String Titulo;
    protected int cantidadHojas;
    protected double precio;

    public Libros(String Titulo, int cantidadHojas, double precio) {
        this.Titulo = Titulo;
        this.cantidadHojas = cantidadHojas;
        this.precio = precio;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public int getCantidadHojas() {
        return cantidadHojas;
    }

    public void setCantidadHojas(int cantidadHojas) {
        this.cantidadHojas = cantidadHojas;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Libros{" + "Titulo=" + Titulo + ", cantidadHojas=" + cantidadHojas + ", precio=" + precio + '}';
    }
    
    
}
