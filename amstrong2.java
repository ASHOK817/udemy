import java.util.Scanner;
class amstrong2 {
    public static void main(string args[]){
        int i,n,r,m,sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("ENter the number");
        n=sc.nextInt();
        m=n;
        while(n>0){
            r=n%10;
            n=n/10;
            sum=sum+r*r;
        }
        if(sum==m){
            System.out.println("this is a palindrome");
        }
        else {
            System.out.println("this is not a palindrome");
        }
    }
    
}
