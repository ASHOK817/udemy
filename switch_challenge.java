/*import java.util.Scanner;
class switch_challenge{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the two numbers");
        int x=sc.nextInt();
        int y=sc.nextInt();
        
        System.out.println("What operation do you want to perform");
        System.out.println("ADD");
        System.out.println("SUB");
        System.out.println("MUL");
        System.out.println("DIV");
        System.out.println("Enter the option:");
        String str=sc.next();
        str=str.toUpperCase();
        switch (str) {
            case "ADD":System.out.println("sum is"+(x+y));
                
                break;
            case "SUB":System.out.println("sUB is"+(x-y));
                
                break;
            case "MUL":System.out.println("MUL is"+(x*y));
                
                break;
            case "DIV":System.out.println("DIV is"+(x/y));
                
                break;
            
        
            default:System.out.println("enter the valid option");
                break;
        }

    }
}*/
import java.util.Scanner;
class switch_challenge{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number");
        int a=sc.nextInt();
        System.out.println("Enter the second number");
        int b=sc.nextInt();
        System.out.println("enter the type of operation");
        String str=sc.next();
        switch (str) {
            case "add":System.out.println("the sum is"+(a+b));
                
                break;
        
            default:System.out.println("the string is done");
                break;
        }


    }
}