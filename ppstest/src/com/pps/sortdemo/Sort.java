package com.pps.sortdemo;

public class Sort {

    public static int[] bubbleSort(int[] arr){

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }

    public static int[] selectSort(int[] arr){

        int minIndex = 0;
        int temp = 0;
        for(int i = 0;i < arr.length;i++){
            minIndex = i;                  //先假设最开始的元素为最小的元素
            for( int j = i + 1;j < arr.length;j++ ){
                if( arr[j] < arr[minIndex] ){  // 寻找最小的数
                    minIndex = j;                 // 将最小数的索引保存
                }
            }
            temp = arr[minIndex];    //将此轮的最小元素和最开始的元素交换
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }

    public static int[] insertSort(int[] arr){

        int index = 0;
        int current = 0;

        for (int i = 1; i < arr.length; i++) {
            index = i - 1;        //左边的排是排好序的
            current = arr[i];   //表示当前取到的扑克牌
            while (index >= 0 && arr[index] > current) {   //如果左边的排比取到的排大则右移
                arr[index + 1] = arr[index];
                index--;
            }
            arr[index + 1] = current;  //直到该手牌比抓到的牌小(或二者相等)，将抓到的牌插入到该手牌右边
        }

        return arr;
    }
}

























