package program;

public class Program {

    public static void main(String[] args) {
        System.out.println("Program ConstantTime");
        new ConstantTime();
        System.out.println("\nProgram Logarithmic");
        new Logarithmic();
        System.out.println("\nProgram Linear");
        new Linear();
        System.out.println("\nProgram Linerithmic");
        new Linearithmic();
        System.out.println("\nProgram Polynominal");
        new Polynominal();
        System.out.println("\nProgram Exponential");
        new Exponential();
        System.out.println("\nProgram Factorial");
        new Factorial();
    }
}