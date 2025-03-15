import java.util.Scanner;
public class user
{
    public static void main(String[] args)
    {
        Scanner myuser=new Scanner(System.in);
        System.out.println("enter your username:");
        String username=myuser.next();
        System.out.println("the username is:"+username);
    }
}