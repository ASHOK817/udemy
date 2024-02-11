import java.util.Scanner;
public class scanner_1{
    public static void  main(String args[]){
        Scanner sc=new Scanner(System.in);
        String first_name,second_name ,c;
        System.out.println("enter the first name ");
        first_name=sc.next();
        System.out.println("enter the second name ");
        second_name=sc.next();
        c=first_name+" "+second_name;

        System.out.println("This is your name:"+c);
       


    }

}