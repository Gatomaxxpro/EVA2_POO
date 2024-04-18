/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_13_polimorfismo;

/**
 *
 * @author MAX
 */
public class Estudiante extends persona {

    private String nmc;

    public Estudiante() {
        super();
        nmc = "";

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

    public String toString() {
        return " " + nmc;
    }
}
