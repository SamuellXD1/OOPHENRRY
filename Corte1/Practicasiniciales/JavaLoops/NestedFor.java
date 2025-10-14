package javaloops;

public class NestedFor {
    //limites ciclos
    private int limInt;
    private int limExt;
    //constructor
    public NestedFor(int limInt, int limExt) {
        this.limInt = limInt;
        this.limExt = limExt;
    }
    //prueba
    public void prueba(){
        //ciclo exterior
        for(int i=1; i <= this.limExt; i++){
            //ciclo interior
            for(int j=1; j <= this.limInt; j++){
                System.out.println(i+" "+j);
            }//fin ciclo interior
        }//fin ciclo exterior
        
    }//fin prueba
    //piramide 1
    public void piramide1(){
        
        for(int i=1; i <= 10;i++){
            for(int j=1; j<i;j++){
                System.out.print("+");//imprimirá el caracter el número del primer indice
            }
            System.out.println("");//Nuevalinea
        }
    }//fin piramide
    
    //piramide2
    public void piramide2(){
        
        int lim =10;
        for(int i=1; i <= 10;i++){
            for(int j=lim; j>=i;j--){
                System.out.print("+");//imprimirá el caracter el número del límite menos el primer indice
            }
            System.out.println("");//nuevalinea
        }
    }
}//fin clase
