package assg4;

public abstract class Product 
{
    private String productName;
    private String productOrigin;
    private int productQuantity;
    private double productPrice;
    
    public Product()
    {
        productName = null;
        productOrigin = null;
        productQuantity = 0;
        productPrice = 0.0;
    }
    
    public Product(String productName, String productOrigin, int productQuantity, double productPrice)
    {
        this.productName = productName;
        this.productOrigin = productOrigin;
        this.productQuantity = productQuantity;
        this.productPrice = productPrice;
    }
    
    public void setProductName(String productName)
    {
        this.productName = productName;
    }
    
    public void setProductOrigin(String productOrigin)
    {
        this.productOrigin = productOrigin;
    }
    
    public void setProductQuantity(int productQuantity)
    {
        this.productQuantity = productQuantity;
    }
    
    public void setProductPrice(double productPrice)
    {
        this.productPrice = productPrice;
    }
    
    public String getProductName()
    {
        return productName;
    }
    
    public String getProductOrigin()
    {
        return productOrigin;
    }
    
    public int getProductQuantity()
    {
        return productQuantity;
    }
    
    public double getProductPrice()
    {
        return productPrice;
    }
    
    public abstract String showDetails();
}
