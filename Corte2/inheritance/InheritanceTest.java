package test;

import inheritance.Cliente;
import inheritance.Employee;
import inheritance.Person;
import java.util.Date;
public class InheritanceTest {
    public static void main(String[] args) {
        
        //empleados
        Employee employee1 = new Employee(1, 3000, "Alex", 'M', 18, "tabio");
        System.out.println(employee1);
        Employee employee2 = new Employee(2, 3450, "Leticia", 'F', 20, "Chia");
        System.out.println(employee2);
        
        var fecha = new Date();
        
        Cliente cliente1 = new Cliente(fecha, true, "David", 'M', 30, "Bogota");
        System.out.println(cliente1);
        
        var fecha1 = new Date();
        
        Cliente cliente2 = new Cliente(fecha1, false, "Lorena", 'F', 19, "Cota");
        System.out.println(cliente2);
        
        //personal?
        Person persona1 = new Person("Carolina", 'F', 21, "Madrid");
        imprimir(persona1);

        
        System.out.println("Detalles cliente 1: " + cliente1.obtenerDetalles());
        System.out.println("Detalles empleado 1: " + employee1.obtenerDetalles());
        

        //empleados
        Person persona2 = new Employee(3, 4567, "Samuel", 'M', 18, "Ciudad Bolivar");
        Employee empleado1 = (Employee) persona2;
        System.out.println(empleado1.obtenerDetalles());
        Person persona3 = new Employee(3, 4567, "marta", 'F', 18, "Ciudad Bolivar");
        System.out.println(persona3.obtenerDetalles());                


        
}        
    public static void imprimir(Person persona) {
        System.out.println(persona.obtenerDetalles());
   
    }

      
        
}      