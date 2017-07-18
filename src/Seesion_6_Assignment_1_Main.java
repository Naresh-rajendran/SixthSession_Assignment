import java.util.*;
public class Seesion_6_Assignment_1_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Array_class in = new Array_class(); 
		in.setInputValues();
		in.getDisplayArrays();
		in.displayEvenNumber();

	}

}
class Array_class
{
	
	int[] arr ;
	
	Scanner input = new Scanner(System.in);
	Array_class()
	{
		arr = new int[10];
	}

	void setInputValues()
	{
		System.out.println("Enter the 10 values for the array");
		for(int i = 0 ; i < arr.length ; i++)
		{
			arr[i] = input.nextInt();
		}
	}
	
	void getDisplayArrays()
	{
		System.out.println("Display Number of Elements in Array");
		for(int i = 0 ; i < arr.length ; i++)
		{
			System.out.print(" "+arr[i]);
		}
		System.out.println(" ");
	}
	
	void displayEvenNumber()
	{
		System.out.println("Enter even Numbers to be displayed");
		for(int i = 0 ; i < arr.length ; i++)
		{
			if(arr[i] % 2 == 0)
			{
				System.out.println(" "+arr[i]);
			}
		}
	}
}


/*

OUTPUT:
Enter the 10 values for the array
12
35
57
13
16
10
7
2
6
1
Display Number of Elements in Array
 12 35 57 13 16 10 7 2 6 1 
Enter even Numbers to be displayed
 12
 16
 10
 2
 6












*/