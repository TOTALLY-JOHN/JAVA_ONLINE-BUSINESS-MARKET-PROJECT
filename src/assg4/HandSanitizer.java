package assg4;

public class HandSanitizer extends Product
{
    private String handSanitizerBrand;
    private double handSanitizerAmount;
    
    public HandSanitizer()
    {
        super();
        handSanitizerBrand = null;
        handSanitizerAmount = 0.0;
    }
    
    public HandSanitizer(String productName, String productOrigin, int productQuantity, double productPrice,
            String handSanitizerBrand, double handSanitizerAmount)
    {
        super(productName, productOrigin, productQuantity, productPrice);
        this.handSanitizerBrand = handSanitizerBrand;
        this.handSanitizerAmount = handSanitizerAmount;
    }
    
    public void setHandSanitizerBrand(String handSanitizerBrand)
    {
        this.handSanitizerBrand = handSanitizerBrand;
    }
    
    public void setHandSanitizerAmount(double handSanitizerAmount)
    {
        this.handSanitizerAmount = handSanitizerAmount;
    }
    
    public String getHandSanitizerBrand()
    {
        return handSanitizerBrand;
    }
    
    public double getHandSanitizerAmount()
    {
        return handSanitizerAmount;
    }
    
    @Override
    public String showDetails()
    {
        return "Product Name: " + getProductName() + 
                " / Product Origin: " + getProductOrigin() + 
                " / Product Quantity: " + getProductQuantity() +
                " / Product Price: RM" + getProductPrice() +
                " / Hand Sanitizer Brand: " + handSanitizerBrand +
                " / Hand Sanitizer Amount " + handSanitizerAmount + "\n";
    }
}
