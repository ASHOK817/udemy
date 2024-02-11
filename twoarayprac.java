/*
public class twoarayprac {
    public static void main(String args[]){
    int b[][]={{1,2,3},{4,5,6},{7,8,9}};
    for(int i=0;i<b.length;i++){
        for(int j=0;j<b.length;j++){
            System.out.print(b[i][j]);
        }
        System.out.println("");
    }
    }
    
}


//............matrix Addition.......

public class twoarayprac {

    public static void main(String args[]){
        int a[][]={{1,2,3},{4,5,6},{7,8,9}};
        int b[][]={{10,11,12},{13,14,15},{16,17,18}};
        int c[][]=new int [3][3];
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[0].length;j++){
                c[i][j]=a[i][j]+b[i][j];
            }
        }
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(c[i][j]+",");
            }
            System.out.println("");
        }

    }
}



//...................Matrix Multiplication............

public class twoarayprac {

    public static void main(String args[]){
        int a[][]={{3,5,9},{7,6,2},{4,3,5}};
        int b[][]={{1,0,0},{0,1,0},{0,0,1}};
        int c[][]=new int [3][3];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                c[i][j]=0;
                for(int k=0;k<3;k++){
                    c[i][j]=c[i][j]+a[i][k]*b[k][j];
                }
            }
        }
        for(int i =0;i<c.length;i++){
            for(int j=0;j<c.length;j++){
                System.out.println(c[i][j]);
            }
        }   
        System.out.print("");
    }
}




public class twoarayprac {
    public static void main(String args[]){
        int a[][]={{1,2,3},{1,2,3},{1,2,3}};
        int b[][]={{1,0,0},{0,1,0},{0,0,1}};
        int c[][]=new int[3][3];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                c[i][j]=0;
                for(int k=0;k<3;k++){
                    c[i][j]=c[i][j]+a[i][k]*b[k][j];
                }
            }    
        }
        for(int i=0;i<c.length;i++){
            for(int j=0;j<c.length;j++){
                System.out.print(c[i][j]);
            }
        }
        System.out.println("");
    }
    
}

*/

//..............Sorting of  array of strings... .....

/**
 * twoarayprac
 */
public class twoarayprac {

    public static void main(String args[]){
        String arr[]={"man","king","a","aa","abce","water","ashok","what"};
        java.util.Arrays.sort(arr);

        for(String x:arr){
            System.out.println(x);
        }
    }
}