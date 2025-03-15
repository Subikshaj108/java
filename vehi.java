class vehicle
{
    String brand;
}
class car extends vehicle
{
    String model;
    String color;
}
public class vehi
{
    public static void main(String[] args)
    {
        car mycar1=new car();
        mycar1.brand="generic vehicle";
        mycar1.model="sedan";
        mycar1.color="black";
        System.out.println("Brand:"+mycar1.brand);
         System.out.println("Mode:"+mycar1.model);
        System.out.println( "Color:"+mycar1.color);
    }
}
