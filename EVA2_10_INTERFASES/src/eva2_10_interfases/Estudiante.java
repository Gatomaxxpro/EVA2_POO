/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_10_interfases;

/**
 *
 * @author MAX
 */
public class Estudiante extends Persona implements Datos{
    private int noControl;
    public Estudiante(){
        super();
        this.noControl=0;
    }

    public Estudiante(int noControl, String nombre, String apellido, int edad) {
        super(nombre, apellido, edad);
        this.noControl = noControl;
    }

    public Estudiante(int noControl) {
        this.noControl = noControl;
    }

    public int getNoControl() {
        return noControl;
    }

    public void setNoControl(int noControl) {
        this.noControl = noControl;
    }
     @Override
    public void imprimirDatos() {
        System.out.println("NOMBRE"+getNombre());
        System.out.println("APELLIDOS"+getApellido());
        System.out.println("edad "+getEdad());
       
    }

    @Override
    public String generarCompleto() {
     return getNombre()+""+getApellido();
        
        // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
