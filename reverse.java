/*import java.util.Scanner;
class reverse{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n,i,a;
        System.out.println("enter the number");
        n=sc.nextInt();
        for(;n>0;){
            i=n%10;
            n=n/10;
            System.out.print(i);
        }
    }
}

import java.util.Scanner;
public class reverse {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string");
        int n=sc.nextInt();
        int rev=0;
        int r;
        while(n>0){
            r=n%10;
            rev=rev*10+r;
            n/=10;
        }
        System.out.println(rev);

    }
}

import java.util.Scanner;
class reverse{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
       
        int n,r,rev=0;
        System.out.println("enter the number");
        n=sc.nextInt();
        while(n>0){
            r=n%10;
            rev=rev*10+r;
            n=n/10;

        }
        System.out.println(rev);

    }
}*/
import java.util.Scanner;
class reverse{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int i,n,r;
        System.out.println("enter the number");
        n=sc.nextInt();
        for(;n>0;){
            r=n%10;
            n=n/10;
            System.out.print(r);
        }
    }
}
