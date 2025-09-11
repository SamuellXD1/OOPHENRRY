public class Main {
  public static void main(String[] args) {
  
    Car car = new Car();

 
    car.setCompany_name("Chevrolet");
    car.setModel_name("Cruze");
    car.setYear(2009);
 
    String nombre_empresa = car.getCompany_name();
    String modelo = car.getModel_name();
    int año = car.getYear();
    double millaje = car.getMileage();

   
    System.out.println("Company Name: " + nombre_empresa);
    System.out.println("Model Name: " + modelo);
    System.out.println("Year: " + año);
    System.out.println("Mileage: " + millaje);
  }
}