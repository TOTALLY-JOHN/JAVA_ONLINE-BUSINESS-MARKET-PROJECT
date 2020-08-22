package assg4;

public class Mask extends Product
{
    private String maskBrand;
    private int maskLevel;
    
    public Mask()
    {
        super();
        maskBrand = null;
        maskLevel = 0;
    }
    
    public Mask(String productName, String productOrigin, int productQuantity, double productPrice, String maskBrand, int maskLevel)
    {
        super(productName, productOrigin, productQuantity, productPrice);
        this.maskBrand = maskBrand;
        this.maskLevel = maskLevel;
    }
    
    public void setMaskBrand(String maskBrand)
    {
        this.maskBrand = maskBrand;
    }
    
    public void setMaskLevel(int maskLevel)
    {
        this.maskLevel = maskLevel;
    }
    
    public String getMaskBrand()
    {
        return maskBrand;
    }
    
    public int getMaskLevel()
    {
        return maskLevel;
    }
    
    @Override
    public String showDetails()
    {
        return "Product Name: " + getProductName() + 
                " / Product Origin: " + getProductOrigin() + 
                " / Product Quantity: " + getProductQuantity() +
                " / Product Price: RM" + getProductPrice() +
                " / Mask Brand: " + maskBrand +
                " / Mask Level: " + maskLevel + "\n";
    }
}
