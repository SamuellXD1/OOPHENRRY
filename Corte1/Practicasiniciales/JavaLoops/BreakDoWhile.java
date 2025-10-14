package javaloops;

public class BreakDoWhile {
    
    public void prueba(){
        
        int a=1;
        
        do{
            if(a == 5)
                break;//rompe ciclo
            
            System.out.println(a+"Breakdowhile");
            a++;
        }while(a <= 10);
    }
}
