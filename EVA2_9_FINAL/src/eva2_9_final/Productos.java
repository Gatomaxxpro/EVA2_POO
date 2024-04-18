/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_9_final;

/**
 *
 * @author MAX
 */
public abstract class Productos {
    private String name;
    private double precio;

    public Productos() {
     String name="-------";
     double precio=0;
    }
    
    public Productos(String name, double precio) {
        this.name = name;
        this.precio = precio;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public String toString(){
       String cade;
       cade="name:"+name+""+"precio:"+precio;
       return cade ;
    }
}

