/*

//...................greater number using method..........


public class methodprac {
    static int max(int x, int y){
        if(x>y)
            return x ;
        else
            return y;
    }
    public static void main(String args[]){
        int a=10, b=5,c;
        c=max(a,b);
        System.out.println(c);
    }
    
}

 

//........greater using method.........

import java.util.Scanner;
 public class methodprac {
    static int check(int x,int y){
        int z;
        z=x+y;
        return z;
        
    }
    public static void main(String args[]){
        int a=10,b=5,c;

         
         System.out.println(check(a,b));

    }
    
 }

 

 //...........checking prime or not using method........


 public class methodprac {
 
    static boolean isprime(int n){
        for(int i=2;i<n/2;i++){
            if(n%i==0){
                return false;
            }

        }
        return true;
    }
    public static void main(String args[]){
        System.out.println(isprime(1));
    }
 }

 
import java.util.Scanner;
public class methodprac {
    static boolean prime(int n){
        for(int i=2;i<n/2;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number:");
        int n=sc.nextInt();
        System.out.println(prime(n));
    }
    
}

*/
import java.util.Scanner;
/**
 * methodprac
 */
public class methodprac {
    static boolean prime(int n){
        for(int i=2;i<n/2;i++){
          if(n%i==0)
                return false;
        }
        return true;
    }
    public static void main(String args[]){
        
        System.out.println(prime(10));
       
        
               
    }
}