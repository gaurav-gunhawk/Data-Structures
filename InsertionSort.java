import java.util.Scanner;

public class InsertionSort {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num = sc.nextInt();
		int []ar = new int[num];
		
		for(int i=0 ; i<num ; i++)
		{
			ar[i] = sc.nextInt();
		}
		
		for(int j=1 ; j<ar.length ; j++)
		{
			int key = ar[j];
			for(int h=j-1 ; h>=0 ; h--)
			{
				if(key < ar[h])
				{
					int temp = key;
					key = ar[h];
					ar[h] = temp;
				}
				for(int k=0 ; k<ar.length ; k++)
				{
					System.out.print(ar[k] + " ");
				}
				System.out.println("");
			}
		}
	}
}
