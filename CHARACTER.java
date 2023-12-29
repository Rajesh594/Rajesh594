import java .util.*;
public class Main
{
	public static void main(String[] args) 
	{
	    Scanner S=new Scanner(System.in);
	    char a;
	    System.out.println("enter a character");
	    a=S.next().charAt(0);
	    if(a=='a'||a=='e'||a=='i'||a=='0'||a=='u'||a=='A'||a=='E'||a=='I'||a=='o'||a=='u')
	    {
	        System.out.println("vowel");
	    }
	    else
	    {
	        System.out.println("consonant");
	    }
	    }
}
	   