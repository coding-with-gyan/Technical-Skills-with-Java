//Given an array count number of elements having atleast 1 element  greater than itself write answer in direct main method
/* 
import java.util.Scanner;
public class FirstClass{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int count=0;
        System.out.println("Enter the size of array: ");
        int size=sc.nextInt();
        System.out.println("Enter array elements: ");
        int[] arr=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        int max=arr[0];
        for(int num : arr){
            if(num> max){
                max=num;
            }

        }
        for(int num: arr){
            if(num<max){
                count++;
            }
        }
        System.out.println("Number of elements greater than itself ="+count);
        sc.close();
    }
}

*/


//WAP to prefix sum of array elements
/*
import java.util.Scanner;
public class FirstClass{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size=sc.nextInt();
        System.out.println("Enter array elements: ");
        int[] arr=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        int[] prefixSum=new int[size];
        prefixSum[0]=arr[0];
        for(int i=1;i<size;i++){
            prefixSum[i]=prefixSum[i-1]+arr[i];
        }
        System.out.println("Prefix sum of array elements: ");
        for(int sum : prefixSum){
            System.out.print(sum+" ");
        }
        sc.close();
    }
}
*/


//3=> Given N array elements,count no of equilibrium index in the array
//if i==0,leftsum=0
//if i==n-1,rightsum=0
// import java.util.Scanner;
// public class FirstClass{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter the size of array: ");
//         int size=sc.nextInt();
//         System.out.println("Enter array elements: ");
//         int[] arr=new int[size];
//         for(int i=0;i<size;i++){
//             arr[i]=sc.nextInt();
//         }
//         int equilibriumCount=0;
//         for(int i=0;i<size;i++){
//             int leftSum=0;
//             int rightSum=0;
//             for(int j=0;j<i;j++){
//                 leftSum+=arr[j];
//             }
//             for(int k=i+1;k<size;k++){
//                 rightSum+=arr[k];
//             }
//             if(leftSum==rightSum){
//                 equilibriumCount++;
//             }
//         }
//         System.out.println("Number of equilibrium indices ="+equilibriumCount);
//         sc.close();
//     }
// }















































