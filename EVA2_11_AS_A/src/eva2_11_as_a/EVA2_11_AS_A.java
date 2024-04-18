/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_11_as_a;

/**
 *
 * @author MAX
 */
public class EVA2_11_AS_A {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Direccion dire=new Direccion("calle 66 1/2","1023", "VISTAS", "95065", "TOLUCA", "texas");
        Persona perso=new Persona("max", "bernal", 10, dire);
        System.out.println(perso);
    }
    
}
