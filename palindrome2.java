import java.util.Scanner;
class palindrome2{
    public static void main(String args[]){
        
        System.out.println("enter the number");
        int n=sc.nextInt();
        int m=n;
        int rev=0,r;
        while(n>0){
            r=n%10;
            rev =rev*10+r;
            n=n/10;

        }
        if(rev==m){
            System.out.println("palindrome");

        }
        else{
            System.out.println("not");
        }

    }
}
    
