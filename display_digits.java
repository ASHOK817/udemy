/*import java.util.Scanner;*/
/*import java.util.Scanner;
class display_digit{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n,i,r;
        
        System.out.println("ENter the number");
        n=sc.nextInt();
        while(n>0){
            r=n%10;
            n=n/10;
            System.out.println(r);
        }
    }
}


import java.util.Scanner;
class display_digit{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n,i,r;
        System.out.println("ENter the number");
        n=sc.nextInt();
        /*while(n>0){
            r=n%10;
            n=n/10;
            System.out.println(r);
        }*//*
        for(i=n;n>0;){
            r=n%10;
            n=n/10;
            System.out.println(r);
        }
    }
}

import java.util.Scanner;
class display_digits{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int i,n,r;
        System.out.println("ENter the number");
        n=sc.nextInt();
        for(i=n;n>0;){
            r=n%10;
            n=n/10;
            System.out.println(r);
        }
    }
}
*/
import java.util.Scanner;
class display_digits{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n,a,i,r;
        System.out.println("enter the number");
        n=sc.nextInt();
        for(;n>0;){
            r=n%10;
            n=n/10;
            System.out.println(r);
        }
    }
}
