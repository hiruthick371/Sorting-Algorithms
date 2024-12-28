import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MergeSort {
	private static void mergeSort(List<Integer>list,int low, int high) {
		if(low==high) return ;
		
		int mid = (low+high)/2;
		
		mergeSort(list,low,mid);
		mergeSort(list,mid+1,high);
		merge(list,low,mid,high);
		
	}
	private static void merge(List<Integer>list,int low,int mid,int high) {
		List<Integer>temp = new ArrayList<>();
		int left = low;
		int right = mid+1;
		while(left<=mid && right<=high) {
			if(list.get(left)<=list.get(right)) {
				temp.add(list.get(left));
				left++;
			}
			else {
				temp.add(list.get(right));
				right++;
			}
		}
		while(left<=mid) {
			temp.add(list.get(left++));
		}
		while(right<=high) {
			temp.add(list.get(right++));
		}
		
		//shift temp to list
		for(int i=low;i<=high;++i) {
			list.set(i, temp.get(i-low));
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer>list = new ArrayList<>();
		list.addAll(Arrays.asList(4,4,5,3,5,3,5,3,3,4,54,3,5,1,54,32));
		mergeSort(list,0,list.size()-1);
		System.out.println(list);
	}

}
