public class Product {

    private String  productName;
    private int  productId;
    private int unitPrice;

    public Product(int id, String name, int price)
    {

        this.productId = id;
        this.productName = name;
        this.unitPrice = price;
    }
    public String getproductName(){
        return productName;
    }
    public int getproductId(){
        return productId;
    }
    public int getunitPrice(){
        return unitPrice;
    }
}
