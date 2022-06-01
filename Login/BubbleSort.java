import java.util.Scanner;
class BubbleSort {
	void bubbleSort(int arr[])
	{
		int n = arr.length;
		for (int i = 0; i < n - 1; i++)
			for (int j = 0; j < n - i - 1; j++)
				if (arr[j] < arr[j + 1]) {
					
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
	}




	
	public static void main(String args[])
	{
		Scanner in =new Scanner(System.in);
		BubbleSort ob = new BubbleSort();
		int arr[] = { 64, 34, 25, 12, 22, 11, 90 };
		System.out.print("Enter a nth number = ");
		int k = in.nextInt();
		ob.bubbleSort(arr);
		System.out.println(arr[k-1]);
		in.close();
		
	}
}

