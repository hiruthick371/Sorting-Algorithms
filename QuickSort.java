public class QuickSort {
	private static void quickSort(int[]nums,int low,int high) {
		if(low<high) {
			int partition = Partition(nums,low,high);
			quickSort(nums,low,partition-1);
			quickSort(nums,partition+1,high);
		}
	}
	private static int Partition(int[]nums,int low,int high) {
		int i=low;
		int j = high;
		int pivot = nums[low];
		while(i<j) {
	while(nums[i]<=pivot && i<=high) {
			i++;
		}
		while(nums[j]>pivot && j>=low) {
			j--;
		}
		if(i<j) {
			int temp = nums[i];
			nums[i] = nums[j];
			nums[j] = temp;
		}
	}
		int temp = nums[low];
		nums[low] = nums[j];
		nums[j] = temp;
		return pivot;
		
	}

	public static void main(String[] args) {
		int[] nums = new int[] {4,2,1,5,3};
		quickSort(nums,0,nums.length-1);
		for(int i=0;i<nums.length;++i) {
			System.out.println(nums[i]+" ");
		}
	}

}
