package zusammenfassungprozedural;

public class Sorting {

	static void bubbleSort(int[] arr) {

		int temp = 0;
		for(int i = arr.length - 1; i >= 0; i--)
			for( int j = 0; j <= i - 1; j++) {

				if (arr[j] > arr[j + 1]) {

					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
	}
	
	static void quickSort(int[] arr, int left, int right) {
		
		if (right > left) {
			int p = divideAndSort(arr, left, right);
			quickSort(arr, left, p -1);
			quickSort(arr, p + 1, right);
		}
		
	}
	
	static void insertionSort(int[] arr) {

		int temp = 0, j = 0;
		for(int i = 1; i < arr.length; i++) {

			temp = arr[i];
			j = i;
			while(j > 0 && arr[j-1] > temp) {

				arr[j] = arr[j-1];
				j--;
			}
			arr[j] = temp;
		}
	}
	
	static void shellSort(int[] arr) {
		int temp = 0, h = 1, j = 0;
		do
			h = 3 * h + 1;
		while (h < arr.length);
		do {
			h = h / 3;
			for(int i = h; i < arr.length; i++) {
				temp = arr[i];
				j = i;
				while ((j >= h) && (arr[j-h] > temp)) {
					arr[j] = arr[j - h];
					j = j - h;
				}
				arr[j] = temp;
			}			
		} while (h != 1);
	}
	
	static int divideAndSort(int[] arr, int left, int right) {
		int divider = arr[left];
		int l = left + 1;
		int r = right;
		boolean isFinished = false;
		int temp = 0;
		while (!isFinished) {
			while ((arr[l] >= divider) && (l < right))
				l++;
			while ((arr[r] >= divider) && (r > left))
				r++;
			if (l >= r)
				isFinished = true;
			else {
				temp = arr[l];
				arr[l] = arr[r];
				arr[r] = temp;
			}
		}
		temp = arr[r];
		arr[r] = arr[left];
		arr[left] = temp;
		return r;
	}
	
	
	
	
}
