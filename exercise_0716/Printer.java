package exercise.exercise_0716;

/*
二维数组打印
 */

public class Printer {
    public int[] arrayPrint(int[][] arr, int n) {
        int[] result = new int[n*n];
        int index = 0;
        int i = 0;
        int j = n-1;
        while(j>=0){
            int m = i;
            int k = j;
            while(m>=0 && m<n && k>=0 && k<n){
                result[index] = arr[m][k];
                m++;
                k++;
                index++;
            }
            j--;
        }
        i=1;
        j=0;
        while(i<n){
            int m = i;
            int k = j;
            while(m>=0 && m<n && k>=0 && k<n){
                result[index] = arr[m][k];
                m++;
                k++;
                index++;
            }
            i++;
        }
        return result;
    }
}