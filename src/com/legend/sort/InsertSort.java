package com.legend.sort;

/**
 * 插入排序
 * @author Create By legend
 * @date 2019/4/25 18:58
 */
public class InsertSort {

    public static int[] insertSort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return arr;
        }

        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int temp = arr[i];
            int k = i - 1;
            while (k >= 0 && arr[k] > temp) {
                k--;
            }


            //腾出位置插进去,要插的位置是 k+1
            for (int j = i; j > k + 1; j--) {
                arr[j] = arr[j - 1];

                //插进去
                arr[k + 1] = temp;
            }
        }
        return arr;
    }




    public static void main(String[] args){
        int[] arr = {11,3,2,0,1};
        int[] newArr = insertSort(arr);
        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i]+" ");
        }
    }
}
