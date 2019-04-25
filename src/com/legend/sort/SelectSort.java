package com.legend.sort;

/**
 * 选择排序
 * @author Create By legend
 * @date 2019/4/25 16:11
 */
public class SelectSort {

    public static int[] selectSort(int[] arr){
        int n = arr.length;
        for (int i=0;i<n;i++){
            int min = i;
            for (int j = i; j < n; j++) {
                if (arr[min]>arr[j]){
                    min = j;
                }
            }

            //交换位置
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
        return arr;
    }

    public static void main(String[] args){
        int[] arr = {3,1,4,6,0,10};
        int[] newArr = selectSort(arr);
        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i]+" ");
        }

    }

}
