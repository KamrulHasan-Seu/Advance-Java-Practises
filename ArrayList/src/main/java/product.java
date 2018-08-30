public class product {
    private String productName;
    private int price;

    public product(String productName, int price) {
        this.productName = productName;
        this.price = price;
    }

    public String getProductName() {
        return productName;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return ("Name: "+ getProductName() + " price= " + getPrice());
    }

}
