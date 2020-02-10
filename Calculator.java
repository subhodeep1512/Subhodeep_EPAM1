package com.epam.maven_oops;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choice;
        float a,b,result=0;
        
        Scanner s=new Scanner(System.in);
        
        System.out.println("Enter 1st Number=");
        a=s.nextFloat();
        System.out.println("Enter 2nd Number=");
        b=s.nextFloat();
        
        System.out.println("1:Addition");
        System.out.println("2:Subtraction");
        System.out.println("3:Multiplication");
        System.out.println("4:Division");
        System.out.println("5:Exit");
        
        System.out.println("Enter Choice=");
        choice=s.nextInt();
        
        switch(choice)
        {
            case 1:
                result=(a+b);
                break;
            
            case 2:
                result=(a-b);
                break;
            
            case 3:
                result=(a*b);
                break;
            
            case 4:
                result=(a/b);
                break;
            
            default:
                System.out.println("Invalid Choice");
        }
        if(choice>=1 && choice<=5)
        {
            System.out.println("Result is="+result);
        }
    }
}
