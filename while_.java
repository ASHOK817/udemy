import java.util.Scanner;
class while_{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int i,n;
        System.out.println("enter the intialization:");
        i=sc.nextInt();
        System.out.println("Enter the range:");
        n=sc.nextInt();
        
        while(i<n){
            System.out.println(i);
            i=i*2;
        }
    }
}