package com.company;


import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        String list = sc.nextLine();
        int chair = 0;
        int vacant  = 0;
        for(int i=0;i<list.length();i++){
            if(list.charAt(i)=='C' && vacant==0){
                chair++;
            }
            if(list.charAt(i)=='U'){
                vacant++;
            }
            if(list.charAt(i)=='R' && vacant==0){
                chair++;
            }
            if(list.charAt(i)=='L'){
                vacant++;
            }
        }
        System.out.println("Chairs Required = " + chair);
    }
}
