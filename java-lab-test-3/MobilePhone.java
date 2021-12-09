public class MobilePhone extends Product {

    private int ram;
    private String os;
    private int sdCard;

    public void setProductDetails(String pID, String name, float price, int ram, String os, int sdCard)
    {
        super.setProductDetails(pID, name, price);
        this.ram = ram;
        this.os = os;
        this.sdCard = sdCard;
    }

    @Override
    public void printProductDetails()
    {
        StringBuilder mobilePhoneDetails = new StringBuilder();
        
        mobilePhoneDetails
            .append(String.format("Ram: %s\n", this.ram))
            .append(String.format("Operating System: %s\n", this.os))
            .append(String.format("SD Card: %s\n", this.sdCard));

        super.printProductDetails();
        System.out.println(mobilePhoneDetails);
    }
}
