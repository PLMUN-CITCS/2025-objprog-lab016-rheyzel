public class MethodOverloading {

    public static void main(String[] args) {
        // Calling the overloaded methods with different data types
        printValue(10);        // Calls the method with an integer
        printValue(3.14);      // Calls the method with a double
        printValue("Hello!");  // Calls the method with a string
    }

    // First method to handle an integer parameter
    public static void printValue(int number) {
        System.out.println("Integer value: " + number);
    }

    // Second method to handle a double parameter
    public static void printValue(double number) {
        System.out.println("Double value: " + number);
    }

    // Third method to handle a String parameter
    public static void printValue(String text) {
        System.out.println("String value: " + text);
    }
}
