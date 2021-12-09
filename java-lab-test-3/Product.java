public abstract class Product {
    
    private String pID;
    private String name;
    private float price;

    public void setProductDetails(String pID, String name, float price)
    {
        this.pID = pID;
        this.name = name;
        this.price = price;
    }

    public void printProductDetails()
    {
        StringBuilder productDetails = new StringBuilder();
        
        productDetails
            .append(String.format("Product Id: %s\n", this.pID))
            .append(String.format("Name: %s\n", this.name))
            .append(String.format("Price: %s", this.price));

        System.out.println(productDetails);
    }
}
