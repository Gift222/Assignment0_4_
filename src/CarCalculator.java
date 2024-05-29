public class CarCalculator {
    public class Calculator {
        public double
        calculatePercentage(double value, double percentage) {
            return (value * percentage) / 100;
        }

        //Method that compare two values
        public boolean isGreater(double value1, double value2) {
            return value1 > value2;

            //Creating an instance of the calculator class
            Calculator myCalculator = new.Calculator();

            //Test calculatorPercentage Method
            double initialValue = 200;
            double percentage = 20;
            double calculatedPercentage = myCalculator.calculatePercentage(initialValue, percentage);
        }
    }
