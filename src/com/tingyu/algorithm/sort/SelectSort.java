package com.tingyu.algorithm.sort;

/**
 * 选择排序：
 * 
 * @author admin
 *
 */
public class SelectSort implements Sort {

	

	/**
	 * 默认升序排列
	 * 
	 * @param arr
	 */
	public  void sort(int[] arr) {
		// 1、从数组中选择出最小的元素，假设第一个元素为最小，
		// 依次与后面元素进行比较，如果存在比当前元素小的值，则重置最小值

		for (int i = 0; i < arr.length - 1; i++) {

			int minIndex = i;// 最小元素下标索引
			int minValue = arr[minIndex];// 最小元素值

			for (int j = i + 1; j < arr.length; j++) {
				if (minValue > arr[j]) {
					minIndex = j;
					minValue = arr[j];
				}
			}

			// 交换元素
			if (minIndex != i) {
				arr[minIndex] = arr[i];
				arr[i] = minValue;
			}
		}
	}
}
