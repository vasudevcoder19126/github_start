

import java.util.Arrays;
import java.util.Scanner;
class Scratch {
    public static void main(String[] args) {
        //System.out.print("Hello World!");
        //System.out.print("\n");
        //System.out.print("Hello");
        /*Scanner a=new Scanner(System.in);
        Double n=a.nextDouble();
        System.out.println(n);*/
        /*float n=2;
        System.out.print(n);*/
        /*byte b= 10;
        short s=20;
        int i=30;
        long lo=40;
        float x= 123.31F;
        i=(int)lo;
        System.out.println(x);
        System.out.println(s);
        System.out.println(i);
        System.out.println(lo);
        char ch='a';
        int n=99;
        System.out.println(ch);
        ch=99;
        System.out.println(ch);
        ch=(char)(ch + 2);
        System.out.println(ch);
        ch+=2;
        System.out.println(ch);
        int f=0;
        System.out.println(f+" "+ (int)((5.0/9)*(f-32)));*/
        /*int sum=vasu(30,40);
        System.out.println(sum);
        System.out.println(vasu(20,12 ));*/
        int[] arr=null;
        System.out.println(Arrays.toString(arr));
        arr=new int[4];
        System.out.println(Arrays.toString(arr));
        //arr=new int[5];
        arr[1]='d';
        arr[3]=21;
        System.out.println(Arrays.toString(arr));
        for (int value : arr) {
            System.out.println(value);
        }


    }
    /*public static int vasu(int a,int b){
        int sum;
        sum = a+b;
        return sum;
    }*/
}
