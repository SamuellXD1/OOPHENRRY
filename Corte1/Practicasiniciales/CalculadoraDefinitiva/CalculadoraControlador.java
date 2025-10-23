package calculadora3;

public class CalculadoraControlador {
    private CalculadoraModelo modelo;
    private Calculadora vista;

    
    
    
    public CalculadoraControlador(CalculadoraModelo modelo, Calculadora vista) {
        this.modelo = modelo;
        this.vista = vista;
    }
    
    public void calcularRaiz() {
        try {
            float num = Float.parseFloat(vista.getTextoVista());
            modelo.calcularRaiz(num);
            vista.setTextoVista(modelo.getResultado());
        } catch (NumberFormatException e) {
            vista.setTextoVista("Error");
        }
    }
    public void calcularPotencia() {
        try {
            float num = Float.parseFloat(vista.getTextoVista());
            modelo.calcularPotencia(num);
            vista.setTextoVista(modelo.getResultado());
        } catch (NumberFormatException e) {
            vista.setTextoVista("Error");
        }
    }
    public void calcularFactorial() {
        try {
            // Se usa Float.parseFloat, pero se verifica en el Modelo que sea un entero no negativo
            float num = Float.parseFloat(vista.getTextoVista()); 
            modelo.ejecutarFactorial(num);
            vista.setTextoVista(modelo.getResultado());
        } catch (NumberFormatException e) {
            vista.setTextoVista("Error");
        }
    }
    
    
    
    
    
    //P Numeros 
    public void agregarDigito(String digito) {
        vista.setTextoVista(vista.getTextoVista() + digito);
    }

    public void agregarPunto() {
        String textoActual = vista.getTextoVista();
        if (!textoActual.contains(".")) {
            vista.setTextoVista(textoActual + ".");
        }
    }
    
    //Borar
    public void limpiarVista() {
        vista.setTextoVista("");
    }
    
    
    public void manejarMenos() {
        String textoActual = vista.getTextoVista();

        //inserta el signo negativo.
        if (textoActual.isEmpty() || textoActual.equals("Error")) {
            vista.setTextoVista("-");
        } 
        //interpreta como operador de resta.
        else if (!textoActual.equals("-")) {
            establecerOperacion("-");
        }
    }
    //P Operadores
    public void establecerOperacion(String operador) {
        try {
            String textoActual = vista.getTextoVista();
            
            // Si solo hay un signo negativo, no lo guarda como N1 y espera el número.
            if (textoActual.equals("-") || textoActual.isEmpty() || textoActual.equals("Error")) {
                return;
            }
            // Guarda N1
            modelo.setN1(Float.parseFloat(textoActual));
            modelo.setOperador(operador);
            
            // Limpia 
            vista.setTextoVista("");
        } catch (NumberFormatException e) {
            
             // error si no hay numero
            vista.setTextoVista("Error");
        }
    }

    public void calcularResultado() {
        try {
            if (vista.getTextoVista().equals("-") || vista.getTextoVista().isEmpty()) {
                return;
            }
            
            //P Igual
            modelo.setN2(Float.parseFloat(vista.getTextoVista()));
            
            // Llama 
            modelo.calcular();
            
            // Actualiza 
            vista.setTextoVista(modelo.getResultado());
        } catch (NumberFormatException e) {
            vista.setTextoVista("Error");
        }
    }
}
