/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author vina
 */
public class libroInfantil extends Libros {
    
    private int edadRango;

    public libroInfantil(int edadRango, String Titulo, int cantidadHojas, double precio) {
        super(Titulo, cantidadHojas, precio);
        this.edadRango = edadRango;
    }

    public int getEdadRango() {
        return edadRango;
    }

    public void setEdadRango(int edadRango) {
        this.edadRango = edadRango;
    }

    @Override
    public String toString() {
        return "libroInfantil{" + "edadRango=" + edadRango + '}';
    }
    
    

   

    
}
