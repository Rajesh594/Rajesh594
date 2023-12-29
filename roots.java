import java .util.*;
public class Main
{
	public static void main(String[] args) 
	{
	    Scanner S=new Scanner(System.in);
	    double a,b,c;
	    System.out.println("enter value of a,b,c");
	    a=S.nextDouble();
	    b=S.nextDouble();
	    c=S.nextDouble();
	    double r1,r2,d;
	    d=b*b-4*a*c;
	    if(d<0)
	{
	        System.out.println("rots are not possible");
	    }
	    else
	    {
	        r1=(-b+Math.sqrt(d))/(2*a);
	        r2=(-b-Math.sqrt(d))/(2*a);
	        System.out.println("Root1="+r1);
	        System.out.println("Root2="+r2);
	    }
	    }
}
	    
	    
	
