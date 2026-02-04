//Given an integer array A of size N In 1 sec you can increase the value of 1 element by 1.
// find the minimum time in sec to make all the elements of the array equal

import java.util.Scanner;
public class ThirdClass{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int size=sc.nextInt();
        System.out.println("Enter array element: ");
        int[] arr=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        int max=arr[0];
        for(int i=1;i<size;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        int time=0;
        for(int i=0;i<size;i++){
            time+=max-arr[i];
        }
        System.out.println("Minimum time in sec to make all elements equal: "+time);
        sc.close();
    }
}




















