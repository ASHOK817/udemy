
class student {
    public int roll; 
    public String  name;
    public int m1,m2,m3;
    public int total(){
        return m1+m2+m3;
    }    
    public class StudentTest{
        public static void main(String args[]){
          total s=new total();
            s.m1= 5;
            s.m2= 5;
            s.m3= 5;
            System.out.prinln(s.total());
        }
    }
}
