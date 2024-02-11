import java.util.Scanner;
class switch_challenge_marks{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the marks");
        int n=sc.nextInt();
        switch("n"){
            case "90>100":System.out.println((n>90)+"A");
        }
    }
}