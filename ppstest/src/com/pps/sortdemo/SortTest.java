package com.pps.sortdemo;

public class SortTest {
    public static void main(String[] args) {
        int arr[] = {1,5,9,2,4,6,3,8,7};
//        int[] bubbleSort = Sort.bubbleSort(arr);
//        for (int i = 0; i < bubbleSort.length; i++) {
//            System.out.print(bubbleSort[i]);
//        }
//        int[] selectSort = Sort.selectSort(arr);
//        for (int i = 0; i < selectSort.length; i++) {
//            System.out.println(selectSort[i]);
//        }
        int[] insertSort = Sort.insertSort(arr);
        for (int i = 0; i < insertSort.length; i++) {
            System.out.println(insertSort[i]);
        }
    }
}
