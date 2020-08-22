package assg4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main 
{
    public static ArrayList<Product> productList = new ArrayList<>();
    public static ArrayList<User> userList = new ArrayList<>();
    public static ArrayList<Order> orderList = new ArrayList<>();
    public static String currentUser;
    
    public static void main(String[] args) throws IOException, FileNotFoundException
    {
        Scanner read1 = new Scanner(new File("products.txt"));
        
        while(read1.hasNextLine())
        {
            String productName = read1.nextLine();
            if(productName.equals("Mask"))
            {
                Product product = new Mask(productName, read1.next(), Integer.parseInt(read1.next()), 
                        Double.parseDouble(read1.next()), read1.next(), Integer.parseInt(read1.next()));
                productList.add(product);
            }
            else if(productName.equals("Hand Sanitizer"))
            {
                Product product = new HandSanitizer(productName, read1.next(), Integer.parseInt(read1.next()), 
                        Double.parseDouble(read1.next()), read1.next(), Double.parseDouble(read1.next()));
                productList.add(product);
            }
        }
        
        Scanner read2 = new Scanner(new File("users.txt"));
        
        while(read2.hasNext())
        {
            User user = new User(read2.next(), read2.next(), read2.next());
            userList.add(user);
        }
        
        Scanner read3 = new Scanner(new File("orders.txt"));
        
        while(read3.hasNext())
        {
            Order order = new Order(Integer.parseInt(read3.nextLine()), read3.nextLine(), read3.nextLine(), Integer.parseInt(read3.nextLine()), Double.parseDouble(read3.nextLine()), 
                    Double.parseDouble(read3.nextLine()), read3.nextLine(), read3.nextLine(), read3.nextLine(), read3.nextLine());
            orderList.add(order);
        }
        
        /* Testing for txt files inputs
        for(int i=0; i<productList.size(); i++)
        {
            System.out.println(productList.get(i).showDetails());
        }
        
        for(int i=0; i<userList.size(); i++)
        {
            System.out.println(userList.get(i));
        }
        
        for(int i=0; i<orderList.size(); i++)
        {
            System.out.println(orderList.get(i));
        }*/
        
        WelcomeFrame frame = new WelcomeFrame();
        frame.setVisible(true);
    }
}
