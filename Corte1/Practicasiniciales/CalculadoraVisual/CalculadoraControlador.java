package calculadora3;

public class CalculadoraControlador {
    private CalculadoraModelo modelo;
    private Calculadora vista;

    
    
    
    public CalculadoraControlador(CalculadoraModelo modelo, Calculadora vista) {
        this.modelo = modelo;
        this.vista = vista;
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
    
    //P Operadores
    public void establecerOperacion(String operador) {
        try {
            // Guarda N1
            modelo.setN1(Float.parseFloat(vista.getTextoVista()));
            modelo.setOperador(operador);
            
            // Limpia 
            vista.setTextoVista("");
        } catch (NumberFormatException e) {
            // error si no hay numero
            vista.setTextoVista("Error");
        }
    }
    
    //P Igual
    public void calcularResultado() {
        try {
            // Guarda 
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