package com.legend.sort;

/**
 * 希尔排序
 * @author Create By legend
 * @date 2019/7/3 16:21
 */
public class ShellSort {

    public static int[] shellSort(int[] arr) {
        if (arr == null ||arr.length<2){
            return arr;
        }

        int n = arr.length;
        //对每组间隔为h的分组进行排序,刚开始 h =n/2
        for (int h = n/2; h>0; h/=2) {
            //对各组局部分组进行插入排序
            for (int i = h; i < n; i++) {
                //将arr[i]插入到所在分组的正确位置
                insertSort(arr,h,i);
            }
        }
        return arr;
    }

    /**
     * 将arr[i] 插入到所在分组的正确位置上
     * arr[i] 所在的分组为 ..arr[i-2*h],arr[i-h],arr[i+h]....
     * @param arr
     * @param h
     * @param i
     */
    private static void insertSort(int[] arr, int h, int i) {
        int temp = arr[i];
        int k;
        for (k = i - h; k >0 && temp<arr[k]; k-=h) {
            arr[k+h] = arr[k];
        }
        arr[k+h] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {3,1,4,6,0,10};
        int[] shellSort = shellSort(arr);
        for (int i = 0; i < shellSort.length; i++) {
            System.out.print(shellSort[i]+" ");
        }
    }
}
