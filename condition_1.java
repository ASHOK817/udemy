import java.util.Scanner;
class condition_1{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a;
        System.out.println("enter the mark");
        a=sc.nextInt();
        if(a>90&&a<100){
            System.out.println("your grade is A+");
        }
        else if(a>100){
            System.out.println("marks are in between 0 - 100");
        }
        else if(a>80&&a<=90){
            System.out.println("your grade is A");
        }
        else if(a>70&&a<=80){
            System.out.println("your grade is B");
        }
        else{
            System.out.println("you are failed");
        }
        
    }    
}