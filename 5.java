
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	int g=78;
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Ideone obj=new Ideone();
		int g=4;
		System.out.println("Local Variable g :"+g);
		System.out.println("Global Variable g :"+obj.g);
	}
}
