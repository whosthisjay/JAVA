package OOP.Encapsulation.Practical1;
//Write a Java program to create a class called Car with private instance variables company_name, model_name, year, and mileage.
// Provide public getter and setter methods to access and modify the company_name, model_name, and year variables.
// However, only provide a getter method for the mileage variable.

public class Main {
    public static void main(String[] args) {
        Car car1=new Car();
        car1.setCompanyName("Royce Royal");
        car1.setModelName("R1");
        car1.setYear(24);
       String modelName= car1.getModelName();
        String companyName=car1.getCompanyName();
        int year =car1.getYear();
        int mileage = car1.getMileage();
        System.out.println("Model : "+modelName+ "\nCompany : "+companyName+ "\nYear : "+year+" \nMileage :"+mileage);
    }
}

class Car{
    private String companyName;
    private String modelName;
    private int year;
    private int mileage;
    Car(){
        this.mileage=0;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getModelName(){
        return modelName;
    }
    public void setModelName(String modelName){
        this.modelName=modelName;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }
    public int getMileage(){
        return mileage;
    }
}