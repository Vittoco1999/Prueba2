/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author vina
 */
public class valorTotal extends Libros {
    
    private double valorTotal;

    public valorTotal(double valorTotal, String Titulo, int cantidadHojas, double precio) {
        super(Titulo, cantidadHojas, precio);
        this.valorTotal = valorTotal();
    }

    private double valorTotal(){
    return valorTotal;
    }
    
   public void valorTotal(double valorTotal){
   this.valorTotal = valorTotal;
   }
    
   public void valorTotal(int precio, double IVA){
   this.valorTotal = precio * IVA;
   } 
   
}
