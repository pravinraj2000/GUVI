import java.util.*;
class b2
{
	public static void main (String[] args)
	{
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		if(num>0)
	{
			if(num%2==0)
			{
			System.out.println("Even");
			}
			else
			{
			System.out.println("Odd");
			}
		}
		else
		{
			System.out.println("Invalid");
		}
		
}

}
