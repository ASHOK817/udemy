/*import java.util.Scanner;
class amstrong{
    public static void main(String args[]){
        int i,n,m,sum;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        n=sc.nextInt();
        m=n;
        sum=0;
        int r;
        while(n>0){
            r=n%10;
            n=n/10;
            sum=sum+r*r*r;

        }
        if(sum==m){
            System.out.println("it is a amstrong");
        }
        else{n=n/10;
            System.out.println("as");
        }
    }
}


import java.util.Scanner;
class amstrong{
    public static void main(String args[]){
        int i,n,m,sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        n=sc.nextInt();
        m=n;
        int r;
        while(n>0){
            r=n%10;
            n=n/10;
            sum=sum+r*r*r;
        }
        if(sum==m){
            System.out.println("it is a amstrong number");
        }
        else{
            n=n/10;
            System.out.println("this is not a amstrong");
        }
    }
}
import java.util.Scanner;
class amstrong{
    public static void main(String args[]){
        int i,n,m,r,sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        n=sc.nextInt();
        m=n;
        while(n>0){
            r=n%10;
            n=n/10;
            sum=sum+r*r*r;

        }
        if(sum==m){
            System.out.println("this is a amstrong");
        }
        else{
            n=n/10;
            System.out.println("not a amstrong");
        }
    }
}*/
import java.util.Scanner;
class amstrong{
    public static void main(String args[]){
        int i,n,r,m,sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        n=sc.nextInt();
        m=n;
        while(n>0){
            r=n%10;
            n=n/10;
            sum=sum+r*r;
        }
        if(sum==m){
            System.out.println("this is amstrong");
        }
        else{
            n=n/10;
            System.out.println("this is not a amstrong");
        }
    }
}