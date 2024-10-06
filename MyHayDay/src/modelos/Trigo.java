/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

import java.util.HashSet;
 
/*
 * @author josel
*/
public class Trigo {
    // --------------------------------------- //
    //                Atributos                //
    // --------------------------------------- //
    
    public static final String ICONO = "/img/trigo.png";
    public static final int DURACION = 2;
    public static final int EXPERIENCIA = 1;
    public static final int PRECIO_VENTA = 2;
    public static final int RIEGO = 10;
    
    private String icono;
    private int duracionProduccion;
    private int experienciaRecolecta;
    private int precioVenta;
    private int riego;
    
    // --------------------------------------- //
    //               Constructor               //
    // --------------------------------------- //
    
    //Constructor Paramétrico
    public Trigo(String icono, int duracionProduccion, int experienciaRecolecta, int precioVenta, int riego){
        this.icono = icono;
        this.duracionProduccion = duracionProduccion;
        this.experienciaRecolecta = experienciaRecolecta;
        this.precioVenta = precioVenta;
        this.riego = riego;
    }
    //Constructor Vacío
    public Trigo(){
        this(ICONO, DURACION, EXPERIENCIA, PRECIO_VENTA, RIEGO);
    }
    //Constructor Copia
    public Trigo(Trigo otro){
        this(otro.icono, otro.duracionProduccion, otro.experienciaRecolecta, otro.precioVenta, otro.riego);
    }
    
    // --------------------------------------- //
    //            Getters y Setters            //
    // --------------------------------------- //
    
    //Metodos Set
    public void setAll(){
    }
    public void setIcono(String icono){
        this.icono = icono;
    }
    public void setDuracionProduccion(int duracionProduccion){
        this.duracionProduccion = duracionProduccion;
    }
    public void setExperienciaRecolecta(int experienciaRecolecta){
        this.experienciaRecolecta = experienciaRecolecta;
    }
    public void setPrecioVenta(int precioVenta){
        this.precioVenta = precioVenta;
    }
    public void setRiego(int riego){
        this.riego = riego;
    }
    //Metodos Get
    public void getAll(){
    }
    public String getIcono(String icono){
        return icono;
    }
    public int getDuracionProduccion(int duracionProduccion){
        return duracionProduccion;
    }
    public int getExperienciaRecolecta(int experienciaRecolecta){
        return experienciaRecolecta;
    }
    public int getPrecioVenta(int precioVenta){
        return precioVenta;
    }
    public int getRiego(int riego){
        return riego;
    }
    
}
