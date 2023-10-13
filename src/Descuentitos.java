/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author vina
 */
public class Descuentitos extends Libros {
    
    private double IVA ;

    
    
    public Descuentitos(double IVA, String Titulo, int cantidadHojas, double precio) {
        super(Titulo, cantidadHojas, precio);
        this.IVA = IVA;
    }

    public double getIVA() {
        return IVA;
    }

    public void setIVA(double IVA) {
        this.IVA = IVA;
    }

    @Override
    public String toString() {
        return "Descuentitos{" + "IVA=" + IVA + '}';
    }
    
    
    
    
}
