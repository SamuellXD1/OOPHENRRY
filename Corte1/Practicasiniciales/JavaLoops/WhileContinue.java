package javaloops;

public class WhileContinue {
    
    public void prueba(){
        
        int i =1;
        
        while(i <= 10){
            
            if(i==5){
                i++;
                break;
            }
                
            
            System.out.println(i+"whilecontinue");
            i++;
        }
    }
}
