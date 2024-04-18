/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_9_final;

/**
 *
 * @author MAX
 */
public  class Electronica extends Productos{
    private String marca;
    private boolean garantia;

    public Electronica() {
        String marca="-------";
        boolean garantia =false;
    }
    
    
    public String getMarca() {
    return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public boolean isGarantia() {
        return garantia;
    }

    public void setGarantia(boolean garantia) {
        this.garantia = garantia;
    }
    
    public Electronica(String marca, boolean garantia) {
        this.marca = marca;
        this.garantia = garantia;
    }

    public Electronica(String marca, boolean garantia, String name, double precio) {
        super(name, precio);
        this.marca = marca;
        this.garantia = garantia;
    }
      public String toString(){
         String cade =super.toString();
                 cade+="marca :"+marca+"garantia: "+garantia;
          return cade;
    }

}
