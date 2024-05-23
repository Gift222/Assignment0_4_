
// Assignment 4 Task 1.


public class Car {
    String brand;
    String model;
    int year;

    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;

        //Method to Start and stop the engine
    }
    public Car(String honda) {
    }

    public static void main(String[] args) {

        System.out.println("Engine has started");
        System.out.println("Engine has Stopped");

        Car mycar = new Car ("Toyota", " Camry", 2020);

        System.out.println("Car Brand:" + mycar.brand);
        System.out.println("Model" + mycar.model);
        System.out.println("Year" + mycar.year);


        // Assignment 4 Task 2: Method to calculate the class

        public class Calculator {
            public  double
            calculatePercentage (double value, double percentage) {
                return (value * percentage) / 100;
        }
         //Method that compare two values
            public boolean isGreater (double value1, double value2) { return  value1  >  value2;

                public static void main(String[] args) {
                    //Creating an instance of the calculator class
                    Calculator myCalculator = new Calculator();

                    //Test calculatorPercentage Method
                    double initialValue = 200;
                    double percentage =20;
                    double calculatedPercentage = myCalculator.calculatePercentage(initialValue, percentage);

                    // Test isGreater method

                    double Value1 = 50;
                    double Value2 = 30;
                    boolean comparisonResult = myCalculator.isGreater( value1, value2);
                    System.out.println("Is 25 greater than 30? " + comparisonResult);

                }








    }

