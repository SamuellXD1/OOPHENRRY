public class Car {
  private String company_name;
  private String model_name;
  private int year;
  private double mileage;

  public String getCompany_name() {
    return company_name;
  }

  public void setCompany_name(String company_name) {
    this.company_name = company_name;
  }

  public String getModel_name() {
    return model_name;
  }

  public void setModel_name(String model_name) {
    this.model_name = model_name;
  }

  public int getYear() {
    return year;
  }

  public void setYear(int year) {
    this.year = year;
  }

  public int getMileage() {
    return (int) mileage;
  }

  public void setMileage(int mileage) {
    this.mileage = mileage; // ahora sí asigna correctamente
  }
}
