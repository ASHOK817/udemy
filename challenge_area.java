/*import java.util.Scanner;
class challenge_area{
    public static void main(String args[]){
        float base,height,area;
        System.out.println("ENter the base and height");
        Scanner sc=new Scanner(System.in);
        base =sc.nextFloat();
        height=sc.nextFloat();
        area =base*height/2;
        System.out.println("Area of the triangle is:"+area);

    }
}
import  java.util.Scanner;
class challenge_area{
    public static void main(String args[]){
        float base,height,area;
        System.out.println("enter the base:");
        Scanner sc=new Scanner(System.in);
        base=sc.nextFloat();
        System.out.println("enter the height");
        height=sc.nextFloat();
        area=(base*height)/2;
        System.out.println("this is the area "+area);
    }
}




import java.util.Scanner;
class challenge_area{
    public static void  main(String args[]){
        float base,height,area,depth;
        System.out.println("enter the base");
        Scanner sc=new Scanner(System.in);
        base= sc.nextFloat();
        System.out.println("enter the height");
        height=sc.nextFloat();
        System.out.println("enter the depth");
        depth=sc.nextFloat();
        area=(base*height*depth)/2;
        System.out.println("this is your area :"+area);
    }
}


import java.util.Scanner;
class challenge_area{
    public static void main(String args[]){
        float a,b,c;
        double r1,r2;
        System.out.println("enter the a");
        Scanner sc=new Scanner(System.in);
        a=sc.nextFloat();
        System.out.println("enter the b");
        b=sc.nextFloat();
        System.out.println("enter the c");
        c=sc.nextFloat();
        r1=(-b+Math.sqrt(b*b-4*a*c))/(2*a);
        r2=(-b-Math.sqrt(b*b-4*a*c))/(2*a);
        System.out.println("root 1 is: "+r1);
        System.out.println("root 2 is: "+r2);

    }
}
*/
import java.util.Scanner;
class challenge_area{
    public static void main(String args[]){
        int length,breadth,height,area;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the length");
        length =sc.nextInt();
        System.out.println("enter the breadth");
        breadth=sc.nextInt();
        System.out.println("enter the height");
        height=sc.nextInt();
        area=length*breadth*height;
        System.out.println("this is the area:"+area);

    }
}