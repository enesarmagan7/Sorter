package Letcode;

import java.util.Scanner;

public class Sorter {
    public static void main(String[] args) {
        int a,b,c;
        Scanner sc=new Scanner(System.in);
        System.out.println("1. Sayıyı giriniz");
        a=sc.nextInt();
        System.out.println("2. Sayıyı giriniz");
        b=sc.nextInt();
        System.out.println("3. Sayıyı giriniz");
        c=sc.nextInt();
        if(a>b && a>c && b>a){
            System.out.println(a+","+b+","+c);
        }else if(b>a && b>c && a>c ){
            System.out.println(b+","+a+","+c);
        }else if(a>b && a>c && c>b){
            System.out.println(a+","+c+","+b);
        }else if(b>a && b>c && c>a ){
            System.out.println(b+","+c+","+a);
        }
        else if(c>a && c>b && b>a ){
            System.out.println(c+","+b+","+a);
        }else{
            System.out.println(c+","+a+","+b);
        }
    }
}
