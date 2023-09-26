package ex5;

import java.util.Random;
import java.util.Scanner;

public class mainn {
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        Random random=new Random();
        int n=random.nextInt(21);
        System.out.println(n);
        if(n==1)
            System.out.println("Apartine");
        else
        {
            int a=1,b=1,c;
            int ok=0;
            do {
                c=a+b;
                a=b;
                b=c;
                if(n==c)
                {
                    ok=1;
                    System.out.println("Apartine");
                    break;
                }
            }while(c<=n);
            if(ok==0)
                System.out.println("Nu apartine");
        }

    }
}
