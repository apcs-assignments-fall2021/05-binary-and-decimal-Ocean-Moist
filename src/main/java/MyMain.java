import java.util.Scanner;

public class MyMain {

    // Given a String representing a binary number (e.g. "1010") as input,
    // and returns the decimal value of that number.
    // You can use Integer.parseInt() to convert a String into a **decimal** number.
    // Ex. binaryToDecimal("1010") => 10 (ten)
    //     binaryToDecimal("110010") => 50
    public static int binaryToDecimal(String binary) {
        return Integer.parseInt(binary,2);
    }

    // Given a decimal number (e.g. 152) as input, and returns a String
    // representing the binary representation of that number.
    // Ex. decimalToBinary(7) => "111"
    //     decimalToBinary(152) => "10011000"
    public static String decimalToBinary(int decimal) {
        return Integer.toBinaryString(decimal);
    }
    
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("gimme a binary str");
        System.out.println(binaryToDecimal(scan.next()));
        System.out.println("gimme a decimal int");
        System.out.println(decimalToBinary(scan.nextInt()));
    }
}
