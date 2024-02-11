import java.util.Scanner;
class condition_challenge_radix{
    public static void main(String args[]){
        String num;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        num=sc.next();
        if(num.matches("[01]+")){
            System.out.println("Binary Radix=2");
        }
        else {
            if(num.matches("[0-7]+")){
                System.out.println("Octal radix");
            }
            else if(num.matches("[0-9]")){
                System.out.println("decimal radix=10");
            }
            else if(num.matches("[0-9A-F]")){
                System.out.println("Hexa radix=16");
            }
        }

    }
}