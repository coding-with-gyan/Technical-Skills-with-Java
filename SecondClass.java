import java.util.Scanner;
public class SecondClass{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int size=sc.nextInt();
        System.out.println("Enter array element: ");
        int[] arr=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        int[] prefixSum=new int[size];
        prefixSum[0]=arr[0];
        for(int i=1;i<size;i++){
            prefixSum[i]=prefixSum[i-1]+arr[i];
        }System.out.println("Prefix sum of array elements: ");
        for(int i=0;i<size;i++){
            System.out.print(prefixSum[i]+" ");
        }int ls=0;
        int rs=0;
        int count=0;
        int i;
        for(i=0;i<size;i++){
            if(i==0){
                ls=0;
            }else{
                ls=prefixSum[i-1];
            }
        rs=prefixSum[size-1]-prefixSum[i];
        if(ls==rs){
            count++;
        }
}
System.out.println("Total number of equilibrium indices: "+count);
sc.close();
}
}





















