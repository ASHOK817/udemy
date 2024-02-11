/*public class summmm {
    public static void main(String args[]){
        int i,n,sum=0;
         n=10;
        for(i=0;i<=n;i++){
            sum=sum+i;
            System.out.println(sum);
        }
        System.out.println(sum);
    }
}

import java.util.Scanner;
class summmm{
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

import java.util.Scanner;

public class summmm {
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
        int i,a,n,r;
        System.out.println("enter the number");
        n=sc.nextInt();
        for(;n>0;){
            r=n%10;
            n=n/10;
            System.out.println(r);
        }
    }

}

import java.util.Scanner;
class summ{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int i,n,fact=1;
         n=10;
        for(i=1;i<=n;i++){
            fact=fact*i;
        }
        System.out.println(fact);
    }
}


import java.util.Scanner;

public class summmm {
    public static void main(String args[]){
        int i,n,fact=1;
        n=5;
        for(i=1;i<=n;i++){
            fact=fact*i;
        }
        System.out.println(fact);

    }
    
}

import java.util.Scanner;


public class summmm {

    public static void main(String args[]){
        int i,n,sum=0;
        n=10;
        for(i=0;i<=n;i++){
            sum=sum+i;
        }
        System.out.println(sum);
    }
}

class summmm{
    public static void main(String args[]){
        int i,n,fact=1;
        n=5;
        for(i=1;i<=n;i++){
            fact=fact*i;
        }
        System.out.println(fact);
    }
}

import java.util.Scanner;
class summmm{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int n=sc.nextInt();
        int m=n;
        int rev=0,r;
        while (n>0) {
            r=n%10;
            r=rev*10+r;
            n=n/10;

            
        }
        if(rev==m){
            System.out.println("palindrom");

        }
        else{
            System.out.println("not a palindrome");
        }
    }
}


import java.util.Scanner;

public class summmm {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int i,n,rev,r;
        System.out.println("enter a number");
        n=sc.nextInt();
        
        String str="";
        while (n>0) {
            r=n%10;
            n=n/10;
            str=str+r;
        }
        System.out.println(str);
        char c;
        for(i=str.length()-1;i>=0;i--){
            c=str.charAt(i);
            switch(c){
                case '0':
                    System.out.print("zero");
                    break;

                case '1':
                    System.out.print("One");
                    break;
                case '2':
                    System.out.print("two");
            }
        }
       

    }

    
}

import java.util.*;

public class summmm {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int i,n,r,rev;
        System.out.println("enter the number");
        n=sc.nextInt();
        String str="";
        while(n>0){
            r=n%10;
            n=n/10;
            str=str+r;
        }
        System.out.println(str);
        char c;
        for(i=str.length()-1;i>=0;i--){
            c=str.charAt(i);
            switch (c){
            case '0':
            System.out.println("zero");
            break;
            case '1':
            System.out.println("one");
        }

    }
    
}
}

import java.util.*;

public class summmm {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int i,n,r,rev;
        System.out.println("enter the number");
        n=sc.nextInt();
        String str="";
        while(n>0){
            r=n%10;
            n=n/10;
            str=str+r;
        }
        System.out.println(str);
        char c;
        for(i=str.length()-1;i>=0;i--){
            c=str.charAt(i);
            switch (c){
            case '0':
            System.out.println("zero");
            break;
            case '1':
            System.out.println("one");
        }

    }
    
}
}

import java.util.Scanner;

public class summmm {

    public static void main(String args[]){
       
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5;j++){
               if(i+j>5){
                System.out.print(("*"));
               }
               else{
                System.out.print("");
               }
            }
             System.out.println("");
        }
       
    }
}
*/

public class summmm {
    public static void main(String args[]){
        int a[]={1,2,3,4,5,6};
        int max=a[0];
        int smax=a[0];
        for(int i=0;i<a.length;i++){
            if(a[i]>max){
                smax=max;
                max=a[i];
                
            }
        }
        System.out.println(max);
        System.out.println(smax);
    }
    
}