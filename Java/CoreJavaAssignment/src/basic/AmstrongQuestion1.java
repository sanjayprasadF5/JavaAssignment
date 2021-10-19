package basic;
import java.util.Scanner;

public class AmstrongQuestion1
{
   public static void main(String[] args)
   {
      int x, y, z = 0, temp;
      Scanner sc = new Scanner(System.in);
      System.out.println("Please enter a number: ");
      x = sc.nextInt();
      temp = x;
      while(x > 0)
      {
         y = x % 10;
         x = x / 10;
         z = z + (y * y * y);
      }
      if(temp == z)
      {
         System.out.println(temp + " is an Armstrong Number.");
      }
      else
      {
         System.out.println(temp + " is not an Armstrong Number.");
      }
      sc.close();
   }
}
