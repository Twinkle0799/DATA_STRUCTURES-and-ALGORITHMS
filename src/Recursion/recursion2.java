package Recursion;

import java.util.ArrayList;

public class recursion2 {
	public static void main(String[] args) {

		int[] arr = { 10, 20, 30, 40, 50, 60, 70 };
		int item = 20;
//		ArrayList<Integer> ans = new ArrayList<Integer>();

//		System.out.println(first_index(arr, item, 0));
//		System.out.println(last_index(arr, item, arr.length - 1));
//		System.out.println(all_indices(arr, item, 0, ans));

//		System.out.println(isPalindrome(arr, 0, arr.length - 1));

		int[] ans = reverseArray(arr, 0, arr.length - 1);

		for (int val : ans) {
			System.out.print(" " + val + " ");
		}

	}
	
//	first index of an element in array
	public static int first_index(int[] arr, int item, int i) {

		if (i == arr.length) {
			return -1;
		}

		if (arr[i] == item) {
			return i;
		}

		return first_index(arr, item, i + 1);

	}

//	last index of an element in array
	public static int last_index(int[] arr, int item, int i) {

		if (i == -1)
			return -1;

		if (arr[i] == item)
			return i;

		return last_index(arr, item, i - 1);

	}

//	print all the indices of the element appeared 
	public static ArrayList<Integer> all_indices(int[] arr, int item, int i, ArrayList<Integer> ans) {

		if (i == arr.length) {
			return ans;
		}

		if (arr[i] == item) {
			ans.add(i);
		}

		return all_indices(arr, item, i + 1, ans);

	}

//	check if the array is palindromic or not
	public static boolean isPalindrome(int[] arr, int l, int r) {
		if (l > r) {
			return true;
		}

		if (arr[l] != arr[r]) {
			return false;
		}

		return isPalindrome(arr, l + 1, r - 1);

	}

//	reverse an array
	public static int[] reverseArray(int[] arr, int l, int r) {

		if (l > r) {
			return arr;
		}

		int temp = arr[l];

		arr[l] = arr[r];

		arr[r] = temp;

		return reverseArray(arr, l + 1, r - 1);

	}

	
}
