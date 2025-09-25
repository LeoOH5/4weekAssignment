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

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(int productPrice) {
        this.productPrice = productPrice;
    }

    public String getProductIntroduction() {
        return productIntroduction;
    }

    public void setProductIntroduction(String productIntroduction) {
        this.productIntroduction = productIntroduction;
    }

    public int getProductStock() {
        return productStock;
    }

    public void setProductStock(int productStock) {
        this.productStock = productStock;
    }


    @Override
    public String toString() {
        return productName + "\t| " + productPrice + "\t| " + productIntroduction;
    }
}
