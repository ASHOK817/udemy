import java.util.Scanner;
class condition {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a,b,c;
        System.out.println("enter the a");
        a=sc.nextInt();
        System.out.println("enter the b");
        b=sc.nextInt();
        System.out.println("enter the c");
        c=sc.nextInt();
         if(a==b&&a==c&&b==c){
            System.out.println("the three numbers are equal");
        }
        else if(a==b){
            System.out.println("the a and b  numbers are equal");

        }
        else if(a==c){
            System.out.println("the a and c  numbers are equal");

        }
        else if(b==c){
            System.out.println("the b and c  numbers are equal");

        }
        else if(a>=b&&a>c){
            System.out.println("the biggest among three is:"+a);
        }
        else if (b>c){
            
                System.out.println("the biggest among three is:"+b);
            
        }
        
        
        
        else {
            System.out.println("the biggest among three is:"+c);

        }

    }
}