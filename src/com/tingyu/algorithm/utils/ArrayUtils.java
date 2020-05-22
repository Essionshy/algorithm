package com.tingyu.algorithm.utils;

import com.tingyu.algorithm.sort.Sort;

public class ArrayUtils {
	
	private ArrayUtils() {}
	
	/**
	 * 交换数组中的两个元素
	 * 
	 * @param arr
	 * @param x
	 * @param y
	 */
	public static void exchange(int[] arr, int x, int y) {
		int temp = 0;
		temp = arr[x];
		arr[x] = arr[y];
		arr[y] = temp;
	}

	
	/**
	 * 随机生成一个指定长度的整形数组
	 * 
	 * @param num
	 * @return
	 */
	public static int[] createArray(int num) {
		int[] arr = new int[num];

		for (int i = 0; i < num; i++) {
			arr[i] = (int) (Math.random() * num);
		}
		return arr;

	}
	
	/**
	 * 计算数组排序时长
	 * @param arr
	 * @return
	 */
	public static long time(int[] arr,Sort sort) {
		long startTime = System.currentTimeMillis();
		sort.sort(arr);		
		long endTime = System.currentTimeMillis();	
		return endTime-startTime;
	}
	
	public static void sort(int [] arr,Sort sort) {
		sort.sort(arr);
	}

	
}
