import java.util.Scanner;
public class Session_6_Assignment_3_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input1 = new Scanner(System.in);
		int length , searchElement; 
		
		System.out.println("Enter the Length of the array ");
		length = input1.nextInt();
		
		BinarySearch out = new BinarySearch(length);
		
		out.getArray();
		out.sortArray();
		
		System.out.println("");
		System.out.println("Enter the Search Element");
		searchElement = input1.nextInt();
		
		out.binarySearchTree(searchElement);
		
		input1.close();
	}

}

class BinarySearch 
{
	
	int[] arr;
	
	BinarySearch(int i)
	{
		arr = new int[i];
	}
	
	Scanner input = new Scanner(System.in);
	
	void getArray()
	{
		System.out.println("Enter Value for the Array");
		
		for(int k = 0 ; k < arr.length ; k++)
		{
			arr[k] = input.nextInt();
		}
	}
	//Before Doing Binary Search sort the given array...
	void sortArray()
	{
		System.out.println("The sorted array is given Below");
		int temp ; 
		
		for (int j = 0 ; j < arr.length -1  ; j++ )
		{
			for(int k = 0 ; k < arr.length-1 ; k++)
			{
				if(arr[k] > arr[k+1])
				{
					temp = arr[k] ; 
					arr[k] = arr[k+1] ; 
					arr[k+1] = temp ;
				}
				
			}
		}
		
		for(int k = 0 ; k < arr.length ; k++)
		{
			System.out.print(+arr[k]+"\t");
		}	
	}
	//Search the element in the array using Binary search Algorithm
	void binarySearchTree(int searchElement)
	{
		int first = 0 ; 
		int last = arr.length - 1 ; 
		int middle = (first + last)/2;
		
		
		while(first <= last )
		{
			if(searchElement > arr[middle])
			{
				first = middle+1 ; 
				
				
			}
			else if (searchElement < arr[middle])
			{
				last = middle-1 ; 
				
			}
			else if(searchElement == arr[middle])
			{
				System.out.println("The SearchElement " +searchElement + " is Located at position " +middle);
				break ; 
			}
			
			middle = (first + last)/2;
			
			
		}
		
		if(first > last )
		{
			System.out.println("The SearchElement " +searchElement + " is not found ");
		}
		
	
	}
	
}

/*
 
OUTPUT : 

Enter the Length of the array 
6
Enter Value for the Array
45
24
56
13
34
12
The sorted array is given Below
12	13	24	34	45	56	
Enter the Search Element
24
The SearchElement 24 is Located at position 2

*/
