
public class SelectionSort {
	public static void Selectionsort(int[]arr) {	
		for(int i=0;i<arr.length;++i) {
			int minIndex = i;
			for(int j=i+1;j<arr.length;++j) {
				if(arr[minIndex]>arr[j]) {
					minIndex = j;
				}
			}
				int temp = arr[i];
				arr[i] = arr[minIndex];
				arr[minIndex] = temp;
		}
	}

}
