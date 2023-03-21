import java.util.Scanner;
public class swapPrimeNo {
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Array Size:");
        n=sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter Array elements: ");
        for(int i=0; i<n; i++)
        {
            a[i]=sc.nextInt();
        }
        for (int i = 0; i <= n; i++) {
            int b;
            b = a[a.length - 1];
            if (b % 2 != 0) {
                int temp = 0;
                temp = a[i];
                a[i] = a[a.length - 1];
                a[a.length - 1] = temp;

            }
        }
            for(int i=0;i<n;i++)
                System.out.print(a[i]+" ");


        //System.out.print(b);

    }
}



