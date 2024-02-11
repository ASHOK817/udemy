/*import java.util.Scanner;
public class apseries {
    public static void main(String args[]){
        
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the a number");
        int a=sc.nextInt();
        System.out.println("enter the range");
        int n=sc.nextInt();
        for(;a<n;){
            System.out.println(a);
            a=a+5;
        }
    }
}

import java.util.Scanner;
class apseries{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int a=sc.nextInt();
        for(int n=0;a<=100;){
            a=a*5;
            System.out.println(a);
        }
        
    }
}*/
class apseries{
    public static void main(String args[]){
        for(int n=1;n<=100;){
            n=n*5;
            System.out.print(n+",");
        }
    }
}