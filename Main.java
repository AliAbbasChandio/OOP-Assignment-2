import java.io.File;
import java.io.IOException;
import java.util.Scanner;

class EstateAgency {
    // Encapsulation
    private String propertyType;
    private int price;

    // Constructor
    public EstateAgency(String propertyType, int price) {
        this.propertyType = propertyType;
        this.price = price;
    }

    // Polymorphism - Overloading
    public void displayInfo() {
        System.out.println("Property Type: " + propertyType);
        System.out.println("Price: $" + price);
    }

    public void displayInfo(String location) {
        System.out.println("Property Type: " + propertyType);
        System.out.println("Location: " + location);
    }

    // Inheritance
    static class ResidentialProperty extends EstateAgency {
        public ResidentialProperty(String propertyType, int price) {
            super(propertyType, price);
        }

        // Method overriding
        @Override
        public void displayInfo() {
            super.displayInfo();
            System.out.println("Residential Property Specific Info");
        }
    }

    // Abstraction
    abstract static class Property {
        abstract void buy();
        abstract void sell();
    }

    // Relational operators and programs
    public void relationalOperatorsExample(int area1, int area2) {
        System.out.println("Area 1 > Area 2: " + (area1 > area2));
        // Add more relational operator examples
    }

    // Logical operators and programs
    public void logicalOperatorsExample(boolean condition1, boolean condition2) {
        System.out.println("Condition 1 && Condition 2: " + (condition1 && condition2));
        // Add more logical operator examples
    }

    // Assignment & Arithmetic operators and programs
    public void arithmeticOperatorsExample(int a, int b) {
        int sum = a + b;
        int difference = a - b;
        int product = a * b;
        int quotient = a / b;
        int remainder = a % b;

        // Display results
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        // Add more arithmetic operator examples
    }

    // Switch program
    public void switchExample(int choice) {
        switch (choice) {
            case 1:
                System.out.println("Option 1 selected");
                break;
            case 2:
                System.out.println("Option 2 selected");
                break;
            default:
                System.out.println("Invalid choice");
        }
    }

    // If, else, if-else programs
    public void ifElseExample(int bedrooms) {
        if (bedrooms >= 3) {
            System.out.println("Spacious property");
        } else if (bedrooms == 2) {
            System.out.println("Moderate size property");
        } else {
            System.out.println("Compact property");
        }
    }

    // Scanner class and methods
    public void scannerExample() {
        Scanner scanner = new Scanner(System.in);

        // nextLine() method
        System.out.print("Enter property location: ");
        String location = scanner.nextLine();
        System.out.println("Location entered: " + location);

        // charAt method
        System.out.print("Enter property type: ");
        char propertyType = scanner.next().charAt(0);
        System.out.println("Property type entered: " + propertyType);

        // Close the scanner
        scanner.close();
    }

    // Loops
    public void loopsExample(int n) {
        // For loop
        System.out.println("For Loop:");
        for (int i = 0; i < n; i++) {
            System.out.print(i + " ");
        }

        // While loop
        System.out.println("\nWhile Loop:");
        int i = 0;
        while (i < n) {
            System.out.print(i + " ");
            i++;
        }

        // Do-while loop
        System.out.println("\nDo-While Loop:");
        i = 0;
        do {
            System.out.print(i + " ");
            i++;
        } while (i < n);
    }

    // Arrays
    public void arraysExample() {
        // One-dimensional array
        int[] areas = {1200, 1500, 1800, 1000, 2000};

        // For each loop
        System.out.println("One-dimensional array:");
        for (int area : areas) {
            System.out.print(area + " ");
        }

        // Multidimensional array
        int[][] propertyMatrix = {{3, 2, 4}, {2, 1, 3}, {4, 3, 5}};

        // For each loop for multidimensional array
        System.out.println("\nMultidimensional array:");
        for (int[] row : propertyMatrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }

    // Typecasting
    public void typecastingExample() {
        // Implicit conversion
        int intValue = 100000;
        double doubleValue = intValue; // Implicit conversion from int to double

        // Explicit conversion
        double doublePrice = 150000.75;
        int intPrice = (int) doublePrice; // Explicit conversion from double to int
    }

    // Exception Handling
    public void exceptionHandlingExample() {
        try {
            // Code that may cause an exception
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            // Handle the exception
            System.out.println("Cannot divide by zero.");
        }
    }

    // Functions with "this" keyword
    public void thisKeywordExample() {
        EstateAgency property = new EstateAgency("Apartment", 120000);
        property.displayInfo();

        // Continuity program
        continuityProgramExample();

        // File handling
        fileHandlingExample();
    }

    // Continuity program
    private void continuityProgramExample() {
        // Code for continuity program
    }

    // File handling methods
    private void fileHandlingExample() {
        // Creating a file
        File file = new File("propertyList.txt");

        try {
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }

            System.out.println("File can be read: " + file.canRead());
            System.out.println("File can be written: " + file.canWrite());
            System.out.println("File length: " + file.length() + " bytes");
            System.out.println("File absolute path: " + file.getAbsolutePath());
            System.out.println("File name: " + file.getName());

            // Deleting the file
            if (file.delete()) {
                System.out.println("File deleted: " + file.getName());
            } else {
                System.out.println("Unable to delete the file.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}

public class Main {
    public static void main(String[] args) {
        EstateAgency property

        = new EstateAgency("House", 250000);
        property.displayInfo();

        EstateAgency.ResidentialProperty residentialProperty = new EstateAgency.ResidentialProperty("Villa", 500000);
        residentialProperty.displayInfo();

        property.relationalOperatorsExample(1500, 1800);
        property.logicalOperatorsExample(true, false);
        property.arithmeticOperatorsExample(200000, 50000);
        property.switchExample(2);
        property.ifElseExample(3);
        property.scannerExample();
        property.loopsExample(4);
        property.arraysExample();
        property.typecastingExample();
        property.exceptionHandlingExample();
        property.thisKeywordExample();
    }
}
