
 class cylinder {
    public double raius;
    public double heigth;
    public double area(){
        return Math.PI*radius*radius;
    }
    public class cylinder{
        public static void main(String args[]){
            cylinder c= new cylinder();
            c.radius =5;
            c.height =4;
            System.out.println(c.area());
        }
    }
}
