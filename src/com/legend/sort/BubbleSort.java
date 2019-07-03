package com.legend.sort;

/**
 * 冒泡排序
 * @author Create By legend
 * @date 2019/7/3 15:58
 */
public class BubbleSort {

    /**
     * 自己理解
     * @param arr
     * @return
     */
    public static int[] bubbleSort1(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[i]<arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    /**
     * 规范写法
     * @param arr
     * @return
     */
    public static int[] bubbleSort2(int[] arr){
        if (arr == null || arr.length<2){
            return arr;
        }

        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (arr[j+1]<arr[j]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args){
        int[] arr = {3,1,4,6,0,10};
        //int[] bubbleSort = bubbleSort1(arr);
        int[] bubbleSort = bubbleSort2(arr);
        for (int i = 0; i < bubbleSort.length; i++) {
            System.out.print(bubbleSort[i]+" ");
        }
    }
}
