
package project;
import java.util.Hashtable;
import java.util.Scanner; 
import java.sql.*;

public class Book{
public Connection getconn()
{
    Connection con = null;
    try
    {
    String url= "jdbc:mysql://localhost:3306/suryaproject";
    String username="root";
    String pass="root";
    con = DriverManager.getConnection(url,username,pass);
    }
    catch(Exception e)
    {
    e.printStackTrace();
    }
    return con;
    }


    Scanner sc1 = new Scanner(System.in);

    public void f3bhk() throws SQLException {
            System.out.println("***Please enter your details***");
             Connection con = getconn();
             String s1 = "insert into f3bhk(name,phoneno,aadhar,noofpersons) values(?,?,?,?)";
             PreparedStatement stmt = con.prepareStatement(s1);

                         System.out.println("Enter Your Name:");
                         String name =sc1.nextLine();
                         System.out.println("Enter Your mobile number:");
                         String phoneno =sc1.nextLine();
                         System.out.println("Enter Your aadhar number");
                         String aadhar = sc1.nextLine();
                         System.out.println("Enter number of persons going to stay");
                         String nop = sc1.nextLine();
                   stmt.setString(1,name);
                   stmt.setString(2,phoneno);
                   stmt.setString(3,aadhar);
                   stmt.setString(4,nop);
                   int a = stmt.executeUpdate();
                   System.out.println("*** Cheers ***");
                   System.out.println("***Your House booking hasbeen sucessfully completed***");
                   System.out.println("***Our customercare executive will contact you shortly***");

    }

    public void sf3bhk() throws SQLException {
        System.out.println("***Please enter your details***");
         Connection con = getconn();
         String s1 = "insert into sf3bhk(name,phoneno,aadhar,noofpersons) values(?,?,?,?)";
         PreparedStatement stmt = con.prepareStatement(s1);


         System.out.println("Enter Your Name:");
         String name =sc1.nextLine();
         System.out.println("Enter Your mobile number:");
         String phoneno =sc1.nextLine();
         System.out.println("Enter Your aadhar number");
         String aadhar = sc1.nextLine();
         System.out.println("Enter number of persons going to stay");
         String nop = sc1.nextLine();
   stmt.setString(1,name);
   stmt.setString(2,phoneno);
   stmt.setString(3,aadhar);
   stmt.setString(4,nop);
   int a = stmt.executeUpdate();
   System.out.println("*** Cheers ***");
   System.out.println("***Your House booking hasbeen sucessfully completed***");
   System.out.println("***Our customercare executive will contact you shortly***");

    }

    public void o2bhk() throws SQLException {
            System.out.println("***Please enter your details***");
             Connection con = getconn();
             String s1 = "insert into o2bhk(name,phoneno,aadhar,noofpersons) values(?,?,?,?)";
             PreparedStatement stmt = con.prepareStatement(s1);


             System.out.println("Enter Your Name:");
             String name =sc1.nextLine();
             System.out.println("Enter Your mobile number:");
             String phoneno =sc1.nextLine();
             System.out.println("Enter Your aadhar number");
             String aadhar = sc1.nextLine();
             System.out.println("Enter number of persons going to stay");
             String nop = sc1.nextLine();
       stmt.setString(1,name);
       stmt.setString(2,phoneno);
       stmt.setString(3,aadhar);
       stmt.setString(4,nop);
       int a = stmt.executeUpdate();
       System.out.println("*** Cheers ***");
       System.out.println("***Your House booking hasbeen sucessfully completed***");
       System.out.println("***Our customercare executive will contact you shortly***");
    
       

        }

    }