import java.util.Arrays;

public class binarySearch {

	private static boolean recursiveBinarySearch(int[] pData, int pKey) {
		if(pData.length == 1) {
			return pData[0] == pKey;
		} else {
			int left = 0;
			int right = pData.length;
			int mid = (left+right)/2;
			if(pKey > pData[mid-1]) {
				return recursiveBinarySearch(Arrays.copyOfRange(pData, mid, pData.length), pKey);
			}
			else {
				return recursiveBinarySearch(Arrays.copyOfRange(pData,  0,  mid), pKey);
			}
		}
	}
	
	private static boolean iterativeBinarySearch(int[] a, int n, int pKey) {
		int left = 0;
		int right = n;
		
		while(right>left+1) {
			int mid = (left + right)/2;
			
			if(a[mid]>pKey){
				right = mid;
			} else {
				left = mid;
			}
			if(a[left] == pKey) {
				return true;
			} else {
				return false;
			}
		}
		return false; 
	}
}
