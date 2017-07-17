package com.company;

import java.util.Scanner;

public class Main {public static void main(String[] args) {

    System.out.println("pick two numbers");

    Scanner scanner = new Scanner(System.in);

    Scanner scanner2 = new Scanner(System.in);

    String userInput1 = scanner.nextLine();

    String userInput2 = scanner2.nextLine();

      double operand1 = Double.parseDouble(userInput1);

       double operand2 = Double.parseDouble(userInput2);

      showResults(operand1, operand2);








       

       


}


	public static void showResults( double  x , double  y ){
         double sum = x + y;
         double difference =  x - y;
         double division =  x / y;
         double multiplication =  x * y;
         double remainder =  x % y;
          System.out.println( "the sum is " + sum);
          System.out.println( "the difference is " + difference);
          System.out.println( "the Quatient is " + division);
          System.out.println( "the product is "+ multiplication);
          System.out.println( "the remainder is" + remainder);
    }

    }

