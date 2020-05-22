package com.tingyu.algorithm.sort;

import com.tingyu.algorithm.utils.ArrayUtils;

public class BubbleSort implements Sort {

	/**
	 * 将数据升序排列
	 * 
	 * @param arr
	 */
	public  void sort(int[] arr) {
		boolean flag = false;// 标志变量，标志数据中元素是否有交换，交换置为true
		for (int i = 0; i < arr.length - 1; i++) {

			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					// 如果相邻两个元素，前者比后者值大，则交换元素位置		
					ArrayUtils.exchange(arr, j, j + 1); 
					flag = true;
				}
			}
			//System.out.printf("第 %d趟排序后的结果：", i + 1);
			//System.out.println(Arrays.toString(arr));
			if (!flag) {
				break;
			} else {
				flag = false;
			}
		}
	}
}
