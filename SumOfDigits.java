public class SumOfDigits {
    public static void main(String[] args) {
        int number = 12345;
        int sum = 0;
        
        System.out.println("This program calculates the sum of the digits of " + number + ".");
        
        int tempNumber = number;
        
        while (tempNumber != 0) {
            int digit = tempNumber % 10;
            
            sum = sum + digit;
            
            tempNumber = tempNumber / 10;
        }
        
        System.out.println("The sum of the digits of " + number + " is: " + sum);
        
    }
}