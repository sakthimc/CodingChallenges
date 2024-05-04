package Challenge;

/**
 * Write a program that prints the numbers from 1 to 100. But for multiples of three,
 * print Fizz instead of the number, and multiples of five, print Buzz.
 * For numbers that are multiples of both three and five, print Challenge.FizzBuzz.
 */

//public class FizzBuzz {
//    public static void main(String[] args) {
//        for (int i=0; i<=100;i++){
//            if (i%3==0 && i%5==0){
//                System.out.println("Challenge.FizzBuzz");
//            } else if(i%3==0){
//                System.out.println("Fizz");
//            } else if(i%5==0){
//                System.out.println("Buzz");
//            } else{
//                System.out.println("Nothing to print");
//            }
//        }
//    }
//}

public class FizzBuzz {
    public static String getFizzBuzz(int number) {
        if (number % 3 == 0 && number % 5 == 0) {
            return "FizzBuzz";
        } else if (number % 3 == 0) {
            return "Fizz";
        } else if (number % 5 == 0) {
            return "Buzz";
        } else {
            return String.valueOf(number);
        }
    }
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            System.out.println(getFizzBuzz(i));
        }
    }
    }

