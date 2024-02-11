/*class string{
    public static void main(String args[]){
        String str1="java program";
        String str2=new String("JAVA");
        char c[]={'H','e','l','l','0'};
        String str3=new String(c);
        System.out.println(str3);
        System.out.println(str2);
        System.out.println(str1);
        byte b[]={65,66,67,68};
        String str4=new String(b);
        System.out.println(str4);
    }
}*/

class string{
    public static void main(String args[]){
        String str1="a";
        String str2="ashok";
        String str3="naik";
        System.out.println(str1.equals(str2));
        System.out.println(str1==str2);
        System.out.println(str1.equalsIgnoreCase(str3));
        System.out.println(str2.compareTo(str3));
        System.out.println(str1.matches("\\w"));
    }    
}