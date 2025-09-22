public class MultiplicationTable {

    public static void main(String[] args) {
        int number = 1;
        
        System.out.println("Multiplication Table of " + number + ":");
        
        // Use a loop to iterate from 1 to 10
        for (int i = 1; i <= 10; i++) {
            // Calculate the product
            int product = number * i;
            
            // Print the multiplication expression and the result
            System.out.println(number + " * " + i + " = " + product);
        }
    }
}

//NAME:AKRITI ADYA ,PRN:20240802253