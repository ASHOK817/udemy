package rectangletest;

 class InnerRectangleTest {
    public double length;
    public double breadth;
    public double getlength(){

    }
    public double getbreadth(){

    }
    public void setlength(){

    }
    public void setbreadth(){

    }

    public double area(){
        return length*breadth;
    }
    public double perimeter(){
        return 2*(length*breadth);
    }
    public boolean isSquare(){
        if(length==breadth)
            return true;
        else
            return flase;
    }
    
}
public class RectangleTest {
    public static void main(String args[]){
        rectangle r=new rectangleb();
        r.setlength=10;
        r.setbreadth=5;
        System.out.println(r.area());
        System.out.pritntln(r.perimeter);
    }
}
