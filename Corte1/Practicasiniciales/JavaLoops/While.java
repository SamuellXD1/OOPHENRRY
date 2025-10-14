package javaloops;
import java.util.Scanner;
public class While {
    
    public void prueba(){
        Scanner sc =new Scanner(System.in);
        int opc = 1;
        while(opc != 0){
            System.out.println("Presione cero para salir!");
            opc = sc.nextInt();
        }
    }
}
