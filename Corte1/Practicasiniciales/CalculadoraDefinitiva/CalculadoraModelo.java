package calculadora3;

public class CalculadoraModelo {
    private float n1;
    private float n2;
    private String operador;
    private String resultado;

    
    public float getN1() { return n1; }
    public void setN1(float n1) { this.n1 = n1; }
    public String getResultado() { return resultado; }
    public void setN2(float n2) { this.n2 = n2; }
    public void setOperador(String operador) { this.operador = operador; }
    
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
    
    //Lógica para Factorial 
    private long factorial(int n) {
        if (n < 0) return -1; // Error para números negativos
        if (n == 0 || n == 1) return 1;
        return n * factorial(n - 1);
    }

    //Lógica para Raíz Cuadrada
    public void calcularRaiz(float num) {
        if (num < 0) {
            resultado = "Error"; // No se puede sacar la raíz de un negativo
        } else {
           
            resultado = Float.toString((float) Math.sqrt(num));
        }
    }

    //Lógica para Potenciación al cuadrado
    public void calcularPotencia(float num) {
        resultado = Float.toString(num * num);
    }
    
    //Lógica para ejecutar Factorial
    public void ejecutarFactorial(float num) {
        // El factorial solo aplica a enteros no negativos
        if (num < 0 || num != (int) num) {
             resultado = "Error";
        } else {
            long fact = factorial((int) num);
            if (fact == -1) {
                resultado = "Error";
            } else {
                resultado = Long.toString(fact);
            }
        }
    }
}