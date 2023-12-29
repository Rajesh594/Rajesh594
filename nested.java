import java .util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner S=new Scanner(System.in);
	    int a,b,c;
		System.out.println("enter three no");
		a=S.nextInt();
		b=S.nextInt();
		c=S.nextInt();
		if(a>b)
		{
		    if(a>c)
		    {
		        System.out.println(a+"is biggest");
		    }
		    else
		    {
		        System.out.println(c+"is biggest");
		    }
		    }
		    else
		    if(b>c)
		    {
		        System.out.println(b+"is biggest");
		    }
		    else
		    {
		    System.out.println(c+"is biggest");
}
}
}

		    
		    
