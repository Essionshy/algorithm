package com.tingyu.algorithm.sort;

/**
 * 希尔排序：为了解决简单插入排序比较极端的情况（升序排序中最小的数在最后面的情况）， 降低排序效率所提出的解决方案。
 * 主要采用缩小增量法的方式来实现，通过将数组进行分组 arr.length/2=gap
 * 
 * @author admin
 *
 */
public class ShellSort implements Sort {

	/**
	 * 希尔交换法排序
	 */
	@Override
	public void sort(int[] arr) {

		int insertValue = 0; // 定义待插入的值
		int insertIndex = 0; // 定义待插入什的下标索引
		for (int gap = arr.length / 2; gap > 0; gap /= 2) {

			for (int i = gap; i < arr.length; i++) {
				int j = i;
				insertValue = arr[j];// 从下标为1的元素开始向左边有序表插入
			
				if (arr[j] < arr[j-gap]) {
					while (j-gap>= 0 && insertValue < arr[j-gap]) {
						// 待插入元素没有找到合适的位置，那么原来位置的上元素需要向后移动位置
						arr[j] = arr[j-gap];
						j -= gap;
					}
					// 经过上面的遍历，要插入的元素已经找到适当的位置
					arr[j] = insertValue;
					
				}
					
			
			}

			/*
			 * for(int i=gap;i<arr.length;i++) {
			 * 
			 * for(int j=i-gap;j>=0;j-=gap) { if(arr[j]>arr[j+gap]) {
			 * ArrayUtils.exchange(arr, j, j+gap); } } }
			 */
		}

	}

}
