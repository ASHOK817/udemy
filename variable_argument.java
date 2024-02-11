/*
public class variable_argument {
    static void show(int ...a){
        for(int  x:a){
            System.out.println(x);
        }
    }
    static void showList(String ...s){
        for(int i=0;i<s.length;i++){
            System.out.println(i+1+"."+s[i]);
        }
    }
    public static void main(String args[]){
        show();
        show(10,20,30);
        showList("ashok","naik");

        
   
    }
    
}
*/
/**
 * variable_argument
 */
import java.util.Scanner;
public class variable_argument {

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
           int num= sc.nextInt();
           
           boolean flag=false;
           for(int i=2;i<num/2;++i){
                if(num%i==0){
                    flag=true;
                    break;
                }
           }
           if(!flag){
            System.out.println("It is a prime number");
           }
           else{
            System.out.println("not a prime number");
           }
           
           
           int n=num;
           int rev=0;
           for(int i=n;n>0;){
                rev=n%10;
                n=n/10;
                System.out.print(rev);
                
           }
           boolean flag1=false;
           int r=rev;
           for(int i=2;i<r/2;++i){
                if(r%i==0){
                    flag=true;
                    break;
                }
           }
           if(!flag){
            System.out.println("It is a prime number");
           }
           else{
            System.out.println(" not a prime number");
           }

    }
}