package kgroups;

import java.util.ArrayList;
import java.util.List;

public class KGroups {
	public static boolean separate(List<Integer> list, int k) {
		/*
		 * Base case
		 */
		if (list.size() < k)
			return false;
		
		/*
		 * Sum of elements in the list
		 */
		int sumOfElements = 0;
		for (int i : list) {
			sumOfElements += i;
		}

		/*
		 * Return false is total sum not divisible by k
		 */
		if (sumOfElements % k != 0)
			return false;
		
		/*
		 * Create k splits and initialize sum of each split to be totalsum/k
		 */
		int[] sumExpected = new int[k];
		int[] counter = new int[list.size()];
		for (int i = 0; i < k; i++) {
			sumExpected[i] = sumOfElements/k;
		}
		
		/*
		 * Check if list can be split into k groups with equal sum
		 */
		return checkSubGroupSum (list, list.size() - 1, sumExpected, k, counter);		
	}
	
	public static boolean checkSubGroupSum(List<Integer> list, int size, int[] sumExpected, int k, int[] counter) {
		/*
		 * Return true if expected group found		
		 */
		if (sumCheck(sumExpected, k))
			return true;
		
		/* 
		 * Base case
		 */
		if (size < 0)
			return false;
		
		boolean groupPossible = false;
		
		/*
		 * Check all split possibilities by backtracking
		 */
		
		for (int i = 0; i < k; i++) {
			if (!groupPossible && (sumExpected[i] - list.get(size)) >= 0) {
				counter[size] = i + 1;
				sumExpected[i] = sumExpected[i] - list.get(size);
				groupPossible = checkSubGroupSum(list, size - 1, sumExpected, k, counter);
				sumExpected[i] = sumExpected[i] + list.get(size);
			}
		}
		return groupPossible;
	}

	private static boolean sumCheck(int[] sumExpected, int k) {
		boolean result = true;
		for (int i = 0; i < k; i++) {
			if (sumExpected[i] != 0)
				result = false;
		}
		return result;
	}
}
