public class Program {
    public static void main(String[] args) {
        
        LedTv myLedTv = new LedTv();
        myLedTv.setProductDetails("LGTV01", "LG Smart TV 50 Inch", 150000, "LG Technologies", "IPS Backlit/Curved");
        myLedTv.printProductDetails();

        MobilePhone myMobilePhone = new MobilePhone();
        myMobilePhone.setProductDetails("HTC01", "HTC Mobile Phone 1", 120000, 4096, "Android", 8096);
        myMobilePhone.printProductDetails();
    }
}