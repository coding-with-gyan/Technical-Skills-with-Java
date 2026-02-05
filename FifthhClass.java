//Given an array element check if their exist a pair (i,j) such that A[i]+A[j]==k and i!=j.
//note- i and j are the index value and k is the given sum
//return true if such pair exist otherwise return false


import java.util.Scanner;
public class FifthhClass{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int size=sc.nextInt();
        System.out.println("Enter array element: ");
        int[] arr=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }System.out.println("Enter the K value: ");
        int k=sc.nextInt();
        int found=0;
        for(int i=0;i<size;i++){
            for(int j=i+1;j<size;j++){
                if(arr[i]+arr[j]==k){
                    found=1;
                    break;
                }}}
        if(found==1){
            System.out.println("True");}else{
            System.out.println("False");

        }sc.close();}}









// Given an array A. find second largest value in the array A.


import java.util.Scanner;

public class SecondLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size = sc.nextInt();
        int i;
        int[] arr = new int[size];
        System.out.println("enter" + size + "Elements");
        for (i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        int max=0;
        int secondmax=0;
        for (i=0;i<size;i++){
            if(arr[i]>max){
                secondmax=max;
                max=arr[i];
            }else if(arr[i]>secondmax && arr[i]!=max){
                secondmax=arr[i];
            }
        }
        System.out.println("secondlargest: "+secondmax);
    }
    
}












