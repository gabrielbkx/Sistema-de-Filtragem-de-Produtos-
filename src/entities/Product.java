package entities;

public class Product implements Comparable<Product>{
    @Override
    public int compareTo(Product o) {
        return o.getNamne().compareTo(this.namne);
    }

    private String namne;
    private Double price;

    public Product(String namne, Double price) {
        this.namne = namne;
        this.price = price;
    }

    public String getNamne() {
        return namne;
    }

    public void setNamne(String namne) {
        this.namne = namne;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return getNamne() + ", " + String.format("%.2f",getPrice());
    }

}
