/*public class overload {
    static int max(int x,int y){
        return x>y?x:y;
    }
    static float max(float x,float y){
        if(x>y){
            return x ;
        }
        else 
            return y;
    }
    public static void main(String args[]){
        System.out.println(max(1f,4f));
    }
}


import java.util.Scanner;
public class overload {
    static int area(int a){
        int b;
       b=6*a*a;
       return b;
  }
    static double area(double a){
        double b;
        b=4*a*a;
        return b;
    }
    static double area(double length,double breadth){
        return length*breadth;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int a=sc.nextInt();
        
        
        System.out.println(area(10,10));

    }
    
}



public class overload {
    static int reverse(int n){
        int rev=0;
        while(n>0){
            rev=rev*10+n%10;
            n=n/10;
        }
        return rev;
    
    }
    static double area(int length,int breadth,int height){
        return length*breadth*height;
    }
    public static void main(String args[]){
        System.out.println(reverse(123));
    }
    
}

*/

/**
 * overload
 */
public class overload {

    static boolean validate(String name){
        return name.matches("[a-zA-Z\\s]+");
    }
    static boolean validate(int age){
        return age>=3&&age<=15;
    }
    public static void main(String args[]){
        System.out.println(validate("ashok"));
    }

}