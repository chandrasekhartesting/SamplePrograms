import java.util.*;
import java.lang.*;
import java.io.*;

class Hello
{
	public static double pi = 3.14;
	public static void main (String[] args) throws java.lang.Exception
	{
		System.out.println("Hello "+args[0]+"!");
		int number = 2;
		add(5,6);
		add(4,7);
		System.out.println("sum :"+add(4,6).toString());
	}
	public static int add(int a,int b){
		int c = a + b;
		return c;
	}
}
