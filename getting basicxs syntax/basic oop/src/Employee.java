public class Employee {
    private String name;
    private int age;
    private double salary;
    private double tax;


    //ctor
    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    //setters
    public void setName(String value){
        this.name = value;
    }
    public void setAge(int value){
        this.age = value;
    }
    public void setSalary(double value){
        this.salary = value;
    }
    public void calcTax(double salary){
        if (salary != 0)
            this.tax = salary * 0.09;
    }

    //getters
    public String getName() { return this.name; }
    public int getAge() { return this.age; }
    public double getSalary() { return this.salary; }
    public double getTax() { return this.tax; }
}
