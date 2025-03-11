
public class KLargestElements {
	public static void main(String[] args) {
		int[] arr = { 1, 4, 17, 7, 25, 3, 100 };
		int k = 3;
		findkLargestElements(arr, k);
	}

	static void findkLargestElements(int[] arr, int k) {
		int[] kLargest = new int[k];
		for (int a = 0; a < k; a++) {

			int min = arr[0];
			for (int b = 0; b < arr.length; b++) {
				if (arr[b] < min) {
					min = arr[b];
				}

			}
			int max = 0;
			for (int c = 0; c < arr.length; c++) {
				if (arr[c] > arr[c + 1]) {
					max = arr[c];
					arr[c] = min - 1;
				}

			}
			kLargest[a] = max;
		}
		System.out.print("The" + k + "largest elements is: ");
		for (int a = 0; a < kLargest.length; a++) {

		}
	}
}