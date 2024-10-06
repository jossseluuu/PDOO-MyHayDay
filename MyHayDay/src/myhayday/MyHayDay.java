/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package myhayday;
import java.util.HashSet;
import modelos.Trigo;

/*
 *
 * @author josel
 *
*/
public class MyHayDay {

    /*
     * @param args the command line arguments
    */
    
    public static void main(String[] args){
        // TODO code application logic here
        
        Trigo Objeto_Trigo1 = new Trigo("Imagen Trigo", 5, 3, 4, 7);
        Trigo Objeto_Trigo2 = new Trigo();
        Trigo Objeto_Trigo3 = new Trigo(Objeto_Trigo1);
        
        System.out.println("Primer Trigo:");
        System.out.print(Objeto_Trigo1.getIcono()+ " ");
        System.out.print(Objeto_Trigo1.getDuracionProduccion()+ " ");
        System.out.print(Objeto_Trigo1.getExperienciaRecolecta()+ " ");
        System.out.print(Objeto_Trigo1.getPrecioVenta()+ " ");
        System.out.println(Objeto_Trigo1.getRiego()+ " ");
        
        System.out.println("Segundo Trigo:");
        System.out.print(Objeto_Trigo2.getIcono()+ " ");
        System.out.print(Objeto_Trigo2.getDuracionProduccion()+ " ");
        System.out.print(Objeto_Trigo2.getExperienciaRecolecta()+ " ");
        System.out.print(Objeto_Trigo2.getPrecioVenta()+ " ");
        System.out.println(Objeto_Trigo2.getRiego()+ " ");
        
        System.out.println("Tercer Trigo:");
        System.out.print(Objeto_Trigo3.getIcono()+ " ");
        System.out.print(Objeto_Trigo3.getDuracionProduccion()+ " ");
        System.out.print(Objeto_Trigo3.getExperienciaRecolecta()+ " ");
        System.out.print(Objeto_Trigo3.getPrecioVenta()+ " ");
        System.out.println(Objeto_Trigo3.getRiego()+ " ");
        
        Objeto_Trigo1.setIcono("Imagen del Trigo");
        Objeto_Trigo1.setDuracionProduccion(70);
        Objeto_Trigo1.setExperienciaRecolecta(50);
        Objeto_Trigo1.setPrecioVenta(90);
        Objeto_Trigo1.setRiego(100);
        
        System.out.println("Primer Trigo ya modificado:");
        System.out.print(Objeto_Trigo1.getIcono()+ " ");
        System.out.print(Objeto_Trigo1.getDuracionProduccion()+ " ");
        System.out.print(Objeto_Trigo1.getExperienciaRecolecta()+ " ");
        System.out.print(Objeto_Trigo1.getPrecioVenta()+ " ");
        System.out.println(Objeto_Trigo1.getRiego()+ " ");
    }
    
}
