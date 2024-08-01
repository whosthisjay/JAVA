package OOP.Abstraction.Practical1;

// Create a class named 'Members' having the following data members :
// 1.Name  2.Age   3.Phone Number 4.Address 5.Salary
//It also has a method named 'printSalary()' which prints the salary of the members
public class PojoMember {
    public static void main(String[] args){
        // Creating an object of the Members class
        Members member=new Members();

        //Set values using Setters
        member.setName("Jay");
        member.setAge(24);
        member.setAddress("Near Naroda");
        member.setSalary(100000);
        member.setPhoneNumber("98896576");

        //Print Details using Getters
        System.out.println("Name : "+member.getName());
        System.out.println("Age : "+member.getAge());
        System.out.println("Phone Number : "+member.getPhoneNumber());
        System.out.println("Address : "+member.getAddress());

        //Print Salary using printSalary()
        member.printSalary();
    }
}
class Members{
    private String name;
    private int age;
    private String phoneNumber;
    private String address;
    private double salary;

    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

//    public double getSalary() {
//        return salary;
//    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void printSalary(){
        System.out.println("Salary : "+this.salary);
    }
}
// This code is contributed by Parmar Jay
