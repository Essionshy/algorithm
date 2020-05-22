package com.tingyu.algorithm.test;

import java.util.Arrays;

import com.tingyu.algorithm.sort.BubbleSort;
import com.tingyu.algorithm.sort.InsertSort;
import com.tingyu.algorithm.sort.SelectSort;
import com.tingyu.algorithm.sort.ShellSort;
import com.tingyu.algorithm.utils.ArrayUtils;

public class SortTest {

	public static void main(String[] args) {

		int[] arr_bubble = { -129, 500, 300, 20000, -3000 };
		System.out.println("排序前：" + Arrays.toString(arr_bubble));
		ArrayUtils.sort(arr_bubble, new BubbleSort());
		System.out.println("冒泡排序后：" + Arrays.toString(arr_bubble));
		
		int[] arr_select = { -129, 500, 300, 20000, -3000 };
		System.out.println("排序前：" + Arrays.toString(arr_select));
		ArrayUtils.sort(arr_select, new SelectSort());
		System.out.println("选择排序后：" + Arrays.toString(arr_select));
		
		int[] arr_insert = { -129, 500, 300, 20000, -3000 };
		System.out.println("排序前：" + Arrays.toString(arr_insert));
		ArrayUtils.sort(arr_insert, new InsertSort());
		System.out.println("插入排序后：" + Arrays.toString(arr_insert));
		
		int[] arr_shell = { -129, 500, 300, 20000, -3000 };
		System.out.println("排序前：" + Arrays.toString(arr_shell));
		ArrayUtils.sort(arr_shell, new ShellSort());
		System.out.println("希尔交换排序后：" + Arrays.toString(arr_shell));

		int[] random_bubble = ArrayUtils.createArray(80000);//
		System.out.printf("冒泡排序总共耗时【%d】ms \n", ArrayUtils.time(random_bubble, new BubbleSort()));
		
		int[] random_select = ArrayUtils.createArray(80000);//
		System.out.printf("选择排序总共耗时【%d】ms \n", ArrayUtils.time(random_select, new SelectSort()));
		
		int[] random_insert = ArrayUtils.createArray(80000);//
		System.out.printf("插入排序总共耗时【%d】ms \n", ArrayUtils.time(random_insert, new InsertSort()));

		int[] random_shell = ArrayUtils.createArray(80000);//
		System.out.printf("希尔交换排序总共耗时【%d】ms \n", ArrayUtils.time(random_shell, new ShellSort()));

	}

}
