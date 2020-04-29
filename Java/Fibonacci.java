public class Fibonacci {

	public static int recursiveFibonacci(int n) {
		if(n<=1) {
			return 1;
		} else {
			return recursiveFibonacci(n-1) + recursiveFibonacci(n-2);
		}
	}
	
	private static int iterativeFibonacci(int n) {
		int[] result = new int[n];
		result[0] = 1;
		result[1] = 1;
		if(n<=1)
			return 1;
		for(int i = 2; i<n ; i++) {
			result[i] = result[i-1] + result[i-2];
		}
		
		return result[n];
}
}
