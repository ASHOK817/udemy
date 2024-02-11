/*
public class arrayparc {
    public static void main(String args[]){
        int a[]={1,2,3,4,5,6,7,8,200};
        System.out.println(a.length);
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]);
        }
        
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]++);
        }
        int sum=0;
        System.out.println("ashok");
        for(int i=0;i<a.length;i++){
            sum=sum+a[i];
            System.out.println(sum);
        }
        System.out.println(sum);
        System.out.println(a[0]);
        int i=0;
        int max=i;
        for( i=0;i<a.length;i++){
            if(max<a[i]){
                max=a[i];
                
            }
            System.out.println("max is"+max);
        }
    }
}


public class arrayparc {

    public static void main(String args[]){
        int a[]={1,2,3,4,5,6,7,8,9,10};
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]);
        }
        System.out.println(a[4]);
        int search=6;
        for(int i=0;i<a.length;i++){
            if(a[i]==search){
                System.out.println("element found"+a[i]);
                System.exit(0);

            }

        }
        System.out.println("not found");
    }
}



public class arrayparc {
    public static void main(String args[]){
        int a[]={2,4,9,55,1};
        int max=a[0];
        int smax=a[0];
        for(int i=0;i<a.length;i++){
            if(a[i]>max){
                smax=max;
                max =a[i];
            }
            else if(a[i]>smax){
                smax=a[i];
            }
            
        }
        System.out.println(max);
        System.out.println(smax);
    }
    
   
    
}


public class arrayparc {
    public static void main(String args[]){
         int b[]={1,2,3,4,5,6,7,8};
        int temp=b[0];
        for(int i=1;i<b.length;i++){
            b[i-1]=b[i];
        }
        b[b.length-1]=temp;
        for(int i=0;i<b.length;i++){
            System.out.print(b[i]);
        }
    }
    
}


      
    
public class arrayparc {

    public static void main(String args[]){
          int a[]={1,2,3,4,5,6};
        int temp=a[0];
         for(int i=0;i<a.length;i++){
            System.out.print(a[i]);
        }
        for(int i=1;i<a.length;i++){
            a[i-1]=a[i];
        }
        a[a.length-1]=temp;
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]);
        }
    }
    }


import java.util.Scanner;

public class arrayparc {

    

public static void main(String args[]){
    int a[]={1,2,3,4,5,6,7,8,9};
    //int temp=a[0];
    //for(int i=1;i<a.length;i++){
    //    a[i-1]=a[i];
    //}
    //a[a.length-1]=temp;
    //for(int i=0;i<a.length;i++){
      //  System.out.print(a[i]);
    //}
    int temp=a[a.length];
    for(int i=a.length-1;i<a.length;i--){
        a[a.length]=a[a.length-1];
    }
    a[0]=temp;
    for(int i=0;i<a.length;i++){
        System.out.print(a[i]);
    }

}
}


public class arrayparc {
    public static void main(String args[]){
        int a[]=new int[10];
        int n=6;
        int x=20;
        int index=2;
        a[0]=1;
        a[1]=2;
        a[2]=3;
        a[3]=4;
        a[4]=5;
        for(int i=n;i>index;i--){
            a[i]=a[i-1];
        }
        a[index]=x;
        for(int i=0;i<n;i++){
            System.out.print(a[i]+",");
        }
    }
    
}


public class arrayparc {
    public static void main(String args[]){
        int a[]=new int[10];
        int n=5;
        int x=20;
        int index=2;
        a[0]=1;
        a[1]=2;
        a[2]=3;
        a[3]=4;
        a[4]=5;
        for(int i=n;i>index;i--){
            a[index]=a[index+1];
            System.exit(0);
        }
        for(int i=0;i<n;i++){
            System.out.println(a[i]+",");
        }

    }
    
}



//copy from a to b

public class arrayparc {
    public static void main(String args[]){
        int  a[]={1,2,3,4,5};
        int b[]=new int[10];
        for(int i=0;i<a.length;i++){
            b[i]=a[i];
        }
        for(int i=0;i<b.length;i++){
            System.out.print(b[i]);
        }
    }
    
}

*/

public class arrayparc {

    public static void main(String args[]){
        int a[]={1,2,3,4,5,6,7,8,9,10,11,12,13};
        int b[]=new int[10];
        for(int i=a.length-1,j=0;i>=0;i++,j++){
            b[j]=a[i];
        }
        for(int x:b){
            System.out.println(x);
        }
    }
}