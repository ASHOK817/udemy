import java.util.Scanner;
class do_while{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int i,n;
        System.out.println("Enter the initialization value:");
        i=sc.nextInt();
        System.out.println("ENter the range value:");
        n=sc.nextInt();
        do{
            System.out.println(i);
            i=i*2;
        }
        while(i<=n);

        

    }
}