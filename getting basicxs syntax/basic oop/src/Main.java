public class Main {
    public static void main(String[] args) {

        Employee emp1 = new Employee("George", 26, 5000);

        emp1.calcTax(emp1.getSalary());

        System.out.println("Name: " + emp1.getName());
        System.out.println("Age: " + emp1.getAge());
        System.out.printf("Compensation: %.2f USD\n", emp1.getSalary());
        System.out.printf("Tax: %.2f USD\n", emp1.getTax());

        Product p1 = new Product("Laptop", 1, 599.90);

        System.out.printf("\nID: %d", p1.getId());
        System.out.printf("Product name: %s\n", p1.getName());
        System.out.printf("Price: %.2f USD", p1.getPrice());
    }
}