import java.util.Scanner;

class BaseClass {
    private int baseValue;

    // Base class constructor
    public BaseClass(int value) {
        this.baseValue = value;
        System.out.println("Base class constructor called with value: " + baseValue);
    }

    // Base class method
    public void displayBaseMethod() {
        System.out.println("Base class method called. Base value: " + baseValue);
    }
}

class DerivedClass extends BaseClass {
    private int derivedValue;

    // Derived class constructor
    public DerivedClass(int baseValue, int derivedValue) {
        super(baseValue); // Call base class constructor using super
        this.derivedValue = derivedValue;
        System.out.println("Derived class constructor called with value: " + derivedValue);
    }

    // Derived class method
    public void displayDerivedMethod() {
        System.out.println("Derived class method called. Derived value: " + derivedValue);
    }
}

public class baseClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input for baseValue and derivedValue
        System.out.print("Enter the value for BaseClass: ");
        int baseValue = scanner.nextInt();

        System.out.print("Enter the value for DerivedClass: ");
        int derivedValue = scanner.nextInt();

        // Create an object of the derived class with user input
        DerivedClass derivedObj = new DerivedClass(baseValue, derivedValue);

        // Call methods using the derived class object
        derivedObj.displayBaseMethod();    // Calls base class method
        derivedObj.displayDerivedMethod(); // Calls derived class method

        scanner.close();
    }
}

