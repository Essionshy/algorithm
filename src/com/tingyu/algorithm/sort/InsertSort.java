package com.tingyu.algorithm.sort;

/**
 * 插入排序：将数组逻辑上分为两部分，左半部分为一个有序表，右半部分为一个无序表， 依次将无序表中的元素插入到有序表中，并为每个元素在有序表中找到适当的位置。
 * 
 * @author admin
 *
 */
public class InsertSort implements Sort {

	@Override
	public void sort(int[] arr) {
		int insertValue = 0; //定义待插入的值
		int insertIndex = 0; //定义待插入什的下标索引
		for (int i = 1; i < arr.length; i++) {

			insertValue = arr[i];// 从下标为1的元素开始向左边有序表插入
			insertIndex = i - 1;

			while (insertIndex >= 0 && insertValue < arr[insertIndex]) {
				// 待插入元素没有找到合适的位置，那么原来位置的上元素需要向后移动位置
				arr[insertIndex + 1] = arr[insertIndex];
				insertIndex--;
			}
			// 经过上面的遍历，要插入的元素已经找到适当的位置
			arr[insertIndex + 1] = insertValue;
		}
	}

}
