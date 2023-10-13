/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author vina
 */
public class Menu {
    
    public static void main(String[] args) {
        
        libroInfantil librito = new libroInfantil(12, "El principito", 100, 9990);
        libroTecnicos librote = new libroTecnicos(true, false, false, "Aprenda java en 21 dias", 350, 21990);
        
        
        //LIBRO 1
        System.out.println("--------------------------------------------------");
        System.out.println(" El titulo del libro : "+ librito.Titulo );
        System.out.println(" la cantidad de hojas : " + librito.cantidadHojas);
        System.out.println(  " Edad maxima para el libro : " + librito.getEdadRango());
        System.out.println("--------------------------------------------------");
        System.out.println(  " precio sin descuento " + librito.getPrecio()); 
        System.out.println("--------------------------------------------------");
        System.out.println(" El precio total es : ");
        System.out.println("--------------------------------------------------");
        
        //LIBRO 2
        
        System.out.println("--------------------------------------------------");
        System.out.println(  " El titulo del libro : " + librote.Titulo);
        System.out.println(  " la cantidad de hojas : " +librote.cantidadHojas);
        System.out.println(" Trae un cd : " + librote.cd() + ", Trae un DVD : " + librote.dvd() );
        System.out.println(" Trae material extra : " + librote.materialExtra());
        System.out.println("--------------------------------------------------");
        System.out.println(  " precio sin descuento " + librote.getPrecio()); 
        System.out.println("--------------------------------------------------");
        System.out.println(" El precio total es : ");
        System.out.println("--------------------------------------------------");
        
    }
    
}
