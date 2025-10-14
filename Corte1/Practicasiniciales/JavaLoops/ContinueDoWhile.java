package javaloops;

public class ContinueDoWhile {
    
    public void prueba(){
        
        int x=1;
        
        do{
            
            if(x ==5){
                ++x;
                continue;   
            }
            
            System.out.println(x+"continuedowhile");
            x++;
        }while(x <=10);
    }
}
