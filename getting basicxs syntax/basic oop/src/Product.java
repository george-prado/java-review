import lombok.Getter;
import lombok.Setter;

public class Product {

    //way better with Lombok
    @Setter @Getter
    private String name;

    @Setter @Getter
    private int id;

    @Setter @Getter
    private double price;

    public Product(String name, int id, double price) {
        this.name = name;
        this.id = id;
        this.price = price;
    }
}
