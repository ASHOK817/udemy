import java.util.Scanner;
class leap_year{
    public static void main(String args[]){
        Scanner sc=new Scanner (System.in);
        Double a;
        System.out.println("enter the year");
        a=sc.nextDouble();
        if(a%400==0&&a%100==0){
            System.out.println("it  is a leap year");
        }
        else {
            System.out.println("it not is a leap year");
        }
    }
}