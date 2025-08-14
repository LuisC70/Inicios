import java.util.Scanner;

public class aaaaaaaa {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        double MontoCompra;
        
        System.out.println("Ingrese mondo de compra: ");
        MontoCompra = lector.nextDouble();
        
        if (MontoCompra >= 2500) {
            
            System.out.println("Felicidades, tiene descuento!");
        }
        else {
            System.out.println("No tiene descuento, siga con su compra");
        }

        lector.close();
    
    }

}
    

