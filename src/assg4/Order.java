package assg4;

public class Order 
{
    private int orderID;
    private String custName;
    private String productName;
    private int productQuantity;
    private double totalPrice;
    private double deliveryCharge;
    private String address;
    private String phoneNo;
    private String paymentMethod;
    private String deliveryStatus;
    
    public Order()
    {
        orderID = 0;
        custName = null;
        productName = null;
        productQuantity = 0;
        totalPrice = 0.0;
        deliveryCharge = 0.0;
        address = null;
        phoneNo = null;
        paymentMethod = null;
        deliveryStatus = null;
    }
    
    public Order(int orderID, String custName, String productName, int productQuantity, double totalPrice,
            double deliveryCharge, String address, String phoneNo, String paymentMethod, String deliveryStatus)
    {
        this.orderID = orderID;
        this.custName = custName;
        this.productName = productName;
        this.productQuantity = productQuantity;
        this.totalPrice = totalPrice;
        this.deliveryCharge = deliveryCharge;
        this.address = address;
        this.phoneNo = phoneNo;
        this.paymentMethod = paymentMethod;
        this.deliveryStatus = deliveryStatus;
    }
    
    public void setOrderID(int orderID)
    {
        this.orderID = orderID;
    }
    
    public void setCustName(String custName)
    {
        this.custName = custName;
    }
    
    public void setProductName(String productName)
    {
        this.productName = productName;
    }
    
    public void setProductQuantity(int productQuantity)
    {
        this.productQuantity = productQuantity;
    }
    
    public void setTotalPrice(double totalPrice)
    {
        this.totalPrice = totalPrice;
    }
    
    public void setDeliveryCharge(double deliveryCharge)
    {
        this.deliveryCharge = deliveryCharge;
    }
    
    public void setAddress(String address)
    {
        this.address = address;
    }
    
    public void setPhoneNo(String phoneNo)
    {
        this.phoneNo = phoneNo;
    }
    
    public void setPaymentMethod(String paymentMethod)
    {
        this.paymentMethod = paymentMethod;
    }
    
    public void setDeliveryStatus(String deliveryStatus)
    {
        this.deliveryStatus = deliveryStatus;
    }
    
    public int getOrderID()
    {
        return orderID;
    }
    
    public String getCustName()
    {
        return custName;
    }
    
    public String getProductName()
    {
        return productName;
    }
    
    public int getProductQuantity()
    {
        return productQuantity;
    }
    
    public double getTotalPrice()
    {
        return totalPrice;
    }
    
    public double getDeliveryCharge()
    {
        return deliveryCharge;
    }
    
    public String getAddress()
    {
        return address;
    }
    
    public String getPhoneNo()
    {
        return phoneNo;
    }
    
    public String getPaymentMethod()
    {
        return paymentMethod;
    }
    
    public String getDeliveryStatus()
    {
        return deliveryStatus;
    }
    
    @Override
    public String toString()
    {
        return "Order ID: " + orderID +
                " / Customer Name: " + custName +
                " / Product Name: " + productName +
                " / Product Quantity: " + productQuantity +
                " / Total Price: RM" + totalPrice +
                " / Delivery Charge: RM" + deliveryCharge +
                " / Address: " + address +
                " / Phone Number: " + phoneNo +
                " / Payment Method: " + paymentMethod +
                " / Delivery Status: " + deliveryStatus + "\n";
    }
}
