//A core i 7 laptop price is 85000 tk and a gaming mouse price is 2500 tk. If I buy the laptop and 1 piece mouse,
//what will be my total cost after giving 15% discount? [Extract the digits from the paragraph and calculate the price]

public class ExtractPriceAndCalculate {
    public static void main(String[] args) {
        String purchaseDescription = "A core i 7 laptop price is 85000 tk and a gaming mouse price is 2500 tk. If I buy the laptop and 1 piece mouse, what will be my total cost after giving 15% discount?";

        purchaseDescription = purchaseDescription.replaceAll("[^0-9]", " ");
        purchaseDescription = purchaseDescription.trim();
        purchaseDescription = purchaseDescription.replaceAll(" +", " ");

        String[] extract = (purchaseDescription.split(" "));

        float laptopPrice = Float.parseFloat(extract[1]);
        float mousePrice = Float.parseFloat(extract[2]);
        float discountValue = Float.parseFloat(extract[4]);
        System.out.println("Laptop Price: " + laptopPrice + ", Mouse Price: " + mousePrice + ", Discount: " + discountValue + "%");

        float finalPrice = (laptopPrice + mousePrice) * ((100 - discountValue) / 100);
        System.out.println("Your Discount Price is: " + finalPrice);
    }
}
