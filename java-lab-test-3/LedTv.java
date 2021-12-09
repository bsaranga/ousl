public class LedTv extends Product {
   
    private String brand;
    private String technology;

    public void setProductDetails(String pID, String name, float price, String brand, String technology)
    {
        super.setProductDetails(pID, name, price);
        this.brand = brand;
        this.technology = technology;
    }

    @Override
    public void printProductDetails()
    {
        StringBuilder ledTvDetails = new StringBuilder();
        
        ledTvDetails
            .append(String.format("Brand: %s\n", this.brand))
            .append(String.format("Technology: %s\n", this.technology));

        super.printProductDetails();
        System.out.println(ledTvDetails);
    }
}
