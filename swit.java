import java.util.Scanner;
public class swit
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the choice");
        int choice=sc.nextInt();
        switch(choice)
        {
            case 1:
            System.out.println("blackcoffee");
            break;
            case 2:
            System.out.println("coldcoffe");
            break;
            case 3:
            System.out.println("dalcano");
            break;
            case 4:
            System.out.println("hotcoffee");
            break;
            case 5:
            System.out.println("thank you for visiting");
            break;
            default:
                System.out.println("choose the coffee");
        }
    }
}