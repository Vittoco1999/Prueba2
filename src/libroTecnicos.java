/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author vina
 */
public class libroTecnicos extends Libros {
    private boolean cd;
    private boolean dvd;
    private boolean materialExtra;

    public libroTecnicos(boolean cd, boolean dvd, boolean materialExtra, String Titulo, int cantidadHojas, double precio) {
        super(Titulo, cantidadHojas, precio);
        this.cd = cd;
        this.dvd = dvd;
        this.materialExtra = materialExtra;
    }

    public boolean isCd() {
        return cd;
    }

    public void setCd(boolean cd) {
        this.cd = cd;
    }

    public boolean isDvd() {
        return dvd;
    }

    public void setDvd(boolean dvd) {
        this.dvd = dvd;
    }

    public boolean isMaterialExtra() {
        return materialExtra;
    }

    public void setMaterialExtra(boolean materialExtra) {
        this.materialExtra = materialExtra;
    }

    boolean cd(){
    return cd;
    }
    
    boolean dvd(){
    return dvd;
    }
    
    boolean materialExtra(){
    return materialExtra;    
    }

    @Override
    public String toString() {
        return "libroTecnicos{" + "cd=" + cd + ", dvd=" + dvd + ", materialExtra=" + materialExtra + '}';
    }
    
    
    

    
    
}
