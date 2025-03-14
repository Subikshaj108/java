public class renames
{
    public static void main(String[] args)
    {
      String[] fruits={"apple","mango","orange","pineapple","strawberry"}; 
      fruits[0]="banana"; 
      for(int i=0;i<fruits.length;i++)
      System.out.println(fruits[i]);
    }
}