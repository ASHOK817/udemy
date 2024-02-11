import java.util.Scanner;
class condition_challenge{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a;
        System.out.println("enter the number");
        a=sc.nextInt();
        if(a%22==0){
            System.out.println(a+" "+"is a even number");
        }
        else{
            System.out.println(a+" "+"is a odd number");
        }
    }
}