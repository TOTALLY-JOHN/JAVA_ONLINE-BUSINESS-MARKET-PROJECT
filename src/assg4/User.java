package assg4;

public class User 
{
    private String username;
    private String userPassword;
    private String userType;
    
    public User()
    {
        username = null;
        userPassword = null;
        userType = null;
    }
    
    public User(String username, String userPassword, String userType)
    {
        this.username = username;
        this.userPassword = userPassword;
        this.userType = userType;
    }
    
    public void setUsername(String username)
    {
        this.username = username;
    }
    
    public void setUserPassword(String userPassword)
    {
        this.userPassword = userPassword;
    }
    
    public void setUserType(String userType)
    {
        this.userType = userType;
    }
    
    public String getUsername()
    {
        return username;
    }
    
    public String getUserPassword()
    {
        return userPassword;
    }
    
    public String getUserType()
    {
        return userType;
    }
    
    @Override
    public String toString()
    {
        return "Username: " + username + ", Password: " + userPassword + ", User Type: " + userType + "\n";
    }
}
