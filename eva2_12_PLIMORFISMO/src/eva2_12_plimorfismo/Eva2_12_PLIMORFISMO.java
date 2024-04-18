/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_12_plimorfismo;

/**
 *
 * @author MAX
 */
public class Eva2_12_PLIMORFISMO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Estudiante es=new Estudiante("max");
        System.out.println(es);
        //podemos CONVERTIR UN OBJETO DE UNA SUBCLASE A UNO SUPERCLASE 
        //persona per=Estudiante();
       // System.out.println("nombre:"+persona.getNombre());
       //  System.out.println("nombre:"+persona.getApellido());
         
        // persona perso=new persona("max", "bernal", 21);
        // Estudiante es=persona;
    }
    
}
class persona {
    private String nombre;
    private String apellido;
    private int edad;
    public persona(){
        edad=0;
        nombre="---";
        apellido ="----";
    }

    public persona(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString(){
        return nombre+" "+apellido;
    }
}
class Estudiante extends persona{
    private String nmc;
    public Estudiante (){
    super();
    nmc="";
       
    }

    public String getNmc() {
        return nmc;
    }

    public void setNmc(String nmc) {
        this.nmc = nmc;
    }

    public Estudiante(String nmc) {
        this.nmc = nmc;
    }
    @Override
    public String toString(){
            return super.toString()+""+nmc;
}
}
