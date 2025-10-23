package calculadora3;

public class CalculadoraModelo {
    private float n1;
    private float n2;
    private String operador;
    private String resultado;

   
    public float getN1() { return n1; }
    public void setN1(float n1) { this.n1 = n1; }

    public float getN2() { return n2; }
    public void setN2(float n2) { this.n2 = n2; }

    public String getOperador() { return operador; }
    public void setOperador(String operador) { this.operador = operador; }

    public String getResultado() { return resultado; }
    
   //realiza la operacion
    public void calcular() {
        switch (operador) {
            case "+":
                resultado = Float.toString(n1 + n2);
                break;
            case "-":
                resultado = Float.toString(n1 - n2);
                break;
            case "*":
                resultado = Float.toString(n1 * n2);
                break;
            case "/":
                if (n2 != 0) {
                    resultado = Float.toString(n1 / n2);
                } else {
                    resultado = "Error"; 
                }
                break;
            default:
                resultado = "";
        }
    }
}