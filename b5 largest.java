import java.util.Scanner;
 
public class b5
{
  public static void main(String args[])
  {
    int x, y, z;
    Scanner in = new Scanner(System.in);
    x = in.nextInt();
    y = in.nextInt();
    z = in.nextInt();
    if (x > y && x > z)
      System.out.println(x);
    else if (y > x && y > z)
      System.out.println(y);
    else  
      System.out.println(z);
  }
}
