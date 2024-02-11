import java.util.Scanner;
public class apseriess {
    public static void main(String args[]){
        int a,d,n;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the first term:");
        a=sc.nextInt();
        System.out.println("enter the difference:");
        d=sc.nextInt();
        System.out.println("enter the number of terms");
        n=sc.nextInt();
        
        for(int i=0;i<n;i++){
            System.out.print(a+",");
            a=a*d;
        }
    }
}
