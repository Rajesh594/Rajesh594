import java .util.*;
public class Main
{
	public static void main(String[] args) 
	{
	    Scanner S=new Scanner(System.in);
	    int y;
	    System.out.println("enter a year");
	    y=S.nextInt();
	    if(y%4==0 && (y%100!=0 || y%400==0))
	    {
	        System.out.println("leap year");
	    }
	    else
	    {
	        System.out.println("not an leap year");
	    }
	    }
}
	    
	    