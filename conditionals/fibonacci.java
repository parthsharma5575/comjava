package conditionals;
import java.util.Scanner;
public class fibonacci {
    public static void main(String[] args) {
        //for loop
//        int first=0;
        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter a number for series till that number(>=2) :");
//        int n=sc.nextInt();
//        int second=1;
//        System.out.print(first+" "+second+" ");
//        for (int i = 2; i <n ; i++) {
//            int sum=first+second;
//            first=second;
//            second=sum;
//            System.out.print(sum+" ");
//        }

        //while loop
//        int f=0;
//        int s=1;
//        System.out.println("Enter the number ");
//        int n=sc.nextInt();
//        System.out.println();
//        System.out.print(f+" "+s+" ");
//        int i=2;
//        while (i<n){
//            int temp=f+s;
//            f=s;
//            s=temp;
//            System.out.print(temp+" ");
//            i++;


        //array effective method
        int n=5;
        int[] arr1=new int[n];
        arr1[0]=0;
        arr1[1]=1;

        for (int i = 2; i <n ; i++) {
            arr1[i]=arr1[i-1]+arr1[i-2];
        }
        for(int i:arr1){
            System.out.print(i+" ");
        }

        }
    }
