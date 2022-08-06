// Java program for the above approach
public class test
{

// Function to find the maximum sum of
// a subsequence whose Bitwise AND is non-zero
static int maximumSum(int arr[], int N)
{
	
	// Stores the resultant maximum
	// sum of the subsequence
	int ans = 0;

	// Iterate over all the bits
	for (int bit = 0; bit < 32; bit++) {

		int sum = 0;

		// Traverse the array elements
		for (int i = 0; i < N; i++) {

			// If the bit is set, then
			// add its value to the sum
			if ((arr[i] & (1 << bit)) == 1) {
				sum += arr[i];
			}
		}

		// Update the resultant
		// maximum sum
		ans = Math.max(ans, sum);
	}

	// Return the maximum sum
	return ans;
}

	// Driver code
	public static void main(String[] args)
	{
		// int arr[] = { 5, 4, 1, 7, 11 };
		int arr[] = { 1,2,3 };
		int N = arr.length;
	System.out.println(maximumSum(arr, N));
	}
}


