public class BubbleSort {
	public static void main(String args[])
	{
		
		int []ar1 = {68,23,54,12,45};
		int array_Length = ar1.length;
		SortwithBubblesort so = new SortwithBubblesort();
		so.sort(array_Length , ar1);	
	}
}
class SortwithBubblesort
{
	public void	 sort(int length_of_Array , int[] ar2)
	{
			int temp = 0 ;
			for(int f=0 ; f<length_of_Array ; f++)
			{			
				for(int j=0 ; j<length_of_Array ; j++)
				{
					if(j+1 == length_of_Array)
					{
						continue;
					}
					else if(ar2[j] > ar2[j+1])
					{
						temp = ar2[j];
						ar2[j] = ar2[j+1];
						ar2[j+1] = temp;
					}
					
				}
				printArray(ar2);

			}
	}
	int a=0;

	public void printArray(int array[])
	{
		System.out.print(" Pass " + a +":" );
		for(int i=0 ; i<array.length ; i++)
		{
			System.out.print(" " + array[i]);
		}
		System.out.println();
		a++;
	}
}
