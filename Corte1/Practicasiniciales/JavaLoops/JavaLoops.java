package javaloops;

public class JavaLoops {

    public static void main(String[] args) {
        // crea objetos
        SimpleFor loop1 = new SimpleFor(5);
        NestedFor loop2 =new NestedFor(2,3);
        ForEach loop3 = new ForEach();
        InfiniteLoop loop4 = new InfiniteLoop();
        While loop5 = new While();
        InfiniteWhile loop6 = new InfiniteWhile();
        DoWhile loop7 =new DoWhile();
        BreakInLoops loop8 = new BreakInLoops();
        BreakInnerLoops loop9 = new BreakInnerLoops();
        BreakWhile loop10 = new BreakWhile();
        BreakDoWhile loop11 = new BreakDoWhile();
        ContinueFor loop12 = new ContinueFor();
        WhileContinue loop13 = new WhileContinue();
        ContinueDoWhile loop14 = new ContinueDoWhile();
        //ejecutable
        loop1.prueba();
        //Nestedfor
        loop2.prueba();
        loop2.piramide1();
        loop2.piramide2();
        //foreach
        loop3.prueba();
        //forinfinite
        //loop4.prueba();
        //while
        //loop5.prueba();
        //infinitewhile
        //loop6.prueba();
        //do while
        loop7.prueba();
        //break
        loop8.prueba();
        //breakinner
        loop9.prueba();
        //breakWhile
        loop10.prueba();
        //breakdowhile
        loop11.prueba();
        //continuefor
        loop12.prueba();
        //WhileContinue
        loop13.prueba();
        //coninunedowhile
        loop14.prueba();
        
        
    }
    
}
