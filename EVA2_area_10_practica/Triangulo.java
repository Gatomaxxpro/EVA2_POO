
package area_10_practica;


public class Triangulo {
    private double altura ;
    private double base;
   public Triangulo(){
       double base =-1;
       double altura=-1;
   }
   public void setaltura(double valor){
       valor=altura;
   }
   public double getaltura(){
       return altura;
       
   }
   public double getbase(){
       return base;
       
   }
   public void setbase(double valor){
       base=valor;
   }
   private double calcularArea(){
       return (base*altura)/2;
   }
   private double perimetro(){
       return (base+base+base);
       
       
   }

    public void imprimirDatos(){
        System.out.println("el area de un triangulo es:"+calcularArea());
        System.out.println("el pereimetro de triangulo es"+perimetro());
        System.out.println("gracias por usar ");
    }
    
}
