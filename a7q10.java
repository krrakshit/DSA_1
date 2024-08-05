

import java.util.Scanner;

public class a7q10 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array:");
        int n=sc.nextInt();

        int a[]=new int[n];
        input(a);
        display(a);

        System.out.println("Array after duplicate removal :");
        removeDuplicate(a);
        display(a);
    }
    public static void display(int a[])
    {
        System.out.print("Array is: ");
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
    public static void input(int a[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Input array elements:");
        for(int i=0;i<a.length;i++)
        {
            a[i]=sc.nextInt();
        }
    }
    public static void removeDuplicate(int a[])
    {
        int i,j,n=0;
        for(i=1;i<a.length;i++)
        {
            for(j=n;j>=0;j--)
            {
                if(a[i]==a[j])
                {
                    a[i]=0;
                    break;
                }
            }
            if(j<0)
            {
                a[++n]=a[i];
                if(n!=i)
                    a[i]=0;
            }
        }
    }

}
