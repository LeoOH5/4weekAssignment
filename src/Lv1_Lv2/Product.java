package Lv1_Lv2;

public class Product {
    private String productName;
    private int productPrice;
    private String productIntroduction;
    private int productStock;

    public Product(String productName, int productPrice, String productIntroduction, int productStock) {
        this.productName = productName;
        this.productPrice = productPrice;
        this.productIntroduction = productIntroduction;
        this.productStock = productStock;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setProductPrice(int productPrice) {
        this.productPrice = productPrice;
    }

    public void setProductIntroduction(String productIntroduction) {
        this.productIntroduction = productIntroduction;
    }

    public void setProductStock(int productStock) {
        this.productStock = productStock;
    }

    @Override
    public String toString() {
        return productName + "\t| " + productPrice + "\t| " + productIntroduction;
    }
}
