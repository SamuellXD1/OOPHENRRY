package javaloops;

public class BreakWhile {
    
    public void prueba(){
        
        int i=1;
        
        while(i <=10){
            
            if(i == 5)
                break;//detiene el loop
            
            System.out.println(i+"breakwhile");
            i++;
        }
    }
}
