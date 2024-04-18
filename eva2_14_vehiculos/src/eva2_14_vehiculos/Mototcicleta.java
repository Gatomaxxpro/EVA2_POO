/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_14_vehiculos;

/**
 *
 * @author MAX
 */
public class Mototcicleta extends Vehiculo{
    private int capacidad;
    public Mototcicleta(){
        
    }
    public Mototcicleta(int capacidad, int Velocidad){
        super(Velocidad);
        this.capacidad=capacidad;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public Mototcicleta(int capacidad) {
        this.capacidad = capacidad;
    }
}
