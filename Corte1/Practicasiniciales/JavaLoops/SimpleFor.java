package javaloops;

public class SimpleFor {
    private int limFor;

    public SimpleFor(int limFor ) {
        this.limFor = limFor;
    }
    
    public void prueba(){
        
        //inicio ciclo
        for(int i= 1; i <= this.limFor; i++ ){
            System.out.println(i);
        }
    } 
    
}
