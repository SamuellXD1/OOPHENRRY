package javaloops;

public class BreakInnerLoops {
    
    public void prueba(){
        
        //ext
        for(int i= 1;i<=3;i++){
            //interior
            for(int j= 1;j <=3;j++){
                
                if(i==2 && j ==2)
                    break;
                
                System.out.println(i+""+j);
            }
        }
    }
}
