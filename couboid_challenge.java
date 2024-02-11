import java.util.Scanner;
class couboid_challenge{
    public static void main(String args[]){
        float length,breadth,height,area,volume;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the length");
        length =sc.nextFloat();
        System.out.println("enter the breadth");
        breadth=sc.nextFloat();
        System.out.println("enter the height");
        height=sc.nextFloat();
        area=length*height;
        System.out.println(area);
        volume=length*height*breadth;
        System.out.println(volume);

    }
}