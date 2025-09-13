public class Main {
  public static void main(String[] args) {
  
    Car car = new Car();
    Car car2 = new Car();
    Car car3 = new Car();

    car.setCompany_name("Chevrolet");
    car.setModel_name("Cruze");
    car.setYear(2009);
    car.setMileage(200);

    car2.setCompany_name("Toyota");
    car2.setModel_name("Corolla");
    car2.setYear(2015);
    car2.setMileage(50000);

    car3.setCompany_name("Ford");
    car3.setModel_name("Focus");
    car3.setYear(2018);
    car3.setMileage(30000);

    System.out.println("Carro 1:");
    System.out.println("Company Name: " + car.getCompany_name());
    System.out.println("Model Name: " + car.getModel_name());
    System.out.println("Year: " + car.getYear());
    System.out.println("Mileage: " + car.getMileage());
    System.out.println();

    System.out.println("Carro 2:");
    System.out.println("Company Name: " + car2.getCompany_name());
    System.out.println("Model Name: " + car2.getModel_name());
    System.out.println("Year: " + car2.getYear());
    System.out.println("Mileage: " + car2.getMileage());
    System.out.println();

    System.out.println("Carro 3:");
    System.out.println("Company Name: " + car3.getCompany_name());
    System.out.println("Model Name: " + car3.getModel_name());
    System.out.println("Year: " + car3.getYear());
    System.out.println("Mileage: " + car3.getMileage());
  }
}
