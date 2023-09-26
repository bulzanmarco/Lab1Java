package ex3;

import java.util.Scanner;

public class mainn {
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("n=");
        int n=scanner.nextInt();
        int ok=0;
        for(int i=2;i<n/2+1;i++)
        {
            if(n%i==0)
            {
                ok=1;
                System.out.println(i+" ");
            }
        }
        if(ok==0)
        {
            System.out.println("Numarul este prim");
        }
    }
}
