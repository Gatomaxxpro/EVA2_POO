/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_14_vehiculos;

/**
 *
 * @author MAX
 */
public class Eva2_14_vehiculos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //se pueden trarar todas las clases en 1 
        //clase como objetoss ded la clase base 
        Vehiculo flota[] = new Vehiculo[10];
        Automovil auto2 = new Automovil(4, 0);
        flota[0] = new Automovil(4, 0);
        flota[1] = new Automovil(2, 0);
        flota[2] = new Automovil(6, 0);
        flota[3] = new Automovil(4, 0);
        flota[4] = new Automovil(4, 0);
        flota[5] = new Mototcicleta(125, 0);
        flota[6] = new Mototcicleta(150, 0);
        flota[7] = new Mototcicleta(600, 0);
        flota[8] = new Mototcicleta(100, 0);
        //-----------------------------------------
        Automovil auto = (Automovil) flota[0];
        System.out.println("numero de puertas" + auto.getNoPuertas());
        Mototcicleta moto = (Mototcicleta) flota[5];
        System.out.println("numero de motos" + moto.getCapacidad());
        if (flota[1] instanceof Automovil) {
            auto = (Automovil) flota[1];
            System.out.println("numero de autos o motos" + auto.getNoPuertas());
        }

        //VAMOS A MODIFICAR LA VELOCIDAD DE LOS VEHICULOS
        acelerar(auto, 50);
        acelerar(moto, 50);
        System.out.println("velocidad de auto" + auto.getVelocidad());
        acelerar(moto, 100);
        System.out.println("velocidad de moto:" + moto.getVelocidad());
        acelerar(moto, -15);
        System.out.println("velocidad de moto:" + moto.getVelocidad());
    }

    public static void acelerar(Vehiculo vehiculo, int ajuste) {
        vehiculo.acelerar(ajuste);
    }
}
