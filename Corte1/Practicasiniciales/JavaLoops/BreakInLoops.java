package javaloops;

public class BreakInLoops {
    
    public void prueba(){
        
        for(int i=1;i <=1000000000;i++){
            System.out.println(i);
            if(i == 5)
                break;
        }
    }
}
