package searching.sorting;

import java.util.ArrayList;
import java.util.Collections;

public class KClosestElement {
	
	public static ArrayList<Integer> KClosestElement(int a [] , int k, int x){
		int low = 0;
		int high = a.length - 1;
		int mid = 0 ;
		while(low <= high) {
			 mid = (low + high) / 2;
			if(a[mid] == x) {
				break;
			} else if(a[mid] < x) {
				low = mid + 1;
			} else {
				high = mid-1;
			}
		}
		int left = mid - 1;
		int right = mid;
		ArrayList<Integer> list = new ArrayList<>();
		while( left >= 0 && right < a.length && k > 0) {
			if(Math.abs(a[left] - x) <= Math.abs(a[right]) - x) { 
				list.add(a[left]);
				left--;
			} else {
				list.add(a[right]);
				right++;
			}
			k--;
		}
		while(k > 0 && left >= 0) {
			list.add(a[left]);
			left--;
			k--;
		}
		while(k > 0 && right < a.length) {
			list.add(a[right]);
			right++;
			k--;
		}
		Collections.sort(list);
		return list;
	}

	public static void main(String[] args) {
		

	}

}
