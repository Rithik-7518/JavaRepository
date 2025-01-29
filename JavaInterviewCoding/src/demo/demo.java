package demo;
public class demo {
    public static void main(String[] args) {
        int number = 12345;
        int reversedNumber = 0;

        // Loop to reverse the number
        while (number != 0) {
        	
            int digit = number % 10;                        
            // Extract the last digit
            
            
            reversedNumber = reversedNumber * 10 + digit;    // Append the digit to reversedNumber
            number = number / 10;  // Remove the last digit from number
        }

        System.out.println("The reversed number is: " + reversedNumber);
    }
}
