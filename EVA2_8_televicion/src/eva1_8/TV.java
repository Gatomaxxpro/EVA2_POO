/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva1_8;

/**
 *
 * @a
public class TV {
    //ATRIBUTOS
    int volumen;
    int canal;
    boolean estaEncendida;
    public void subirVolumen (){
        
    
    volumen = volumen +1;
    
    
    } 
    public void bajarVolumen (){
        volumen  = volumen -1;
        
    }
}uthor MAX
 */


public class TV {
    //ATRIBUTOS
    int volumen=30;
    int canal=5;
    boolean estaEncendida;
    
    
    
    public void subirVolumen (){
        volumen=0;
         if (estaEncendida &&(volumen <100) )
       volumen = volumen +1;
    
    
    } 
    
    public void bajarVolumen (){
         if (estaEncendida && (volumen >0) )
        
             
        
        
        volumen  = volumen -1;
         
    
}
    public void subirCanal(){
        if (estaEncendida )
        canal=canal+1;
    }
    public void bajarCanal(){
        if (estaEncendida&&(canal>0) )
        canal=canal-1;
    }
    public void cambiarCanal(int nocanal){
        if (estaEncendida && !(nocanal<0 ))
        canal = nocanal;
        
    }
    public void pawer(){
       /* if(estaEncendida==true)
           estaEncendida=false;
        else 
            estaEncendida=true;*/
        estaEncendida=!estaEncendida;
    }
    public void imprimirConfig(){
        System.out.println("volumen:"+volumen);
        System.out.println("canal:"+canal);
        System.out.println("powe:"+estaEncendida);
        
    }
}
