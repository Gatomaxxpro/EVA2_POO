
package eva2_9_final;


public  class Computo extends Electronica{
    private int ram;
    private String hd;
    public Computo(){
        String hd="----";
        int ram=0;
        
    }
    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getHd() {
        return hd;
    }

    public void setHd(String hd) {
        this.hd = hd;
    }

    public Computo(int ram) {
        this.ram = ram;
    }

    public Computo(int ram, String marca, boolean garantia) {
        super(marca, garantia);
        this.ram = ram;
    }

    public Computo(int ram, String marca, boolean garantia, String name, double precio) {
        super(marca, garantia, name, precio);
        this.ram = ram;
      
    }
    public String toString(){
         String cade =super.toString()+ "\n" ;
                 cade+="ram:" + ram+ "\n" +"hd:"+hd;
          return cade;
    }
    }
    

