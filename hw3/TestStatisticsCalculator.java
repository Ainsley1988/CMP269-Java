
public class TestStatisticsCalculator {



    public static void main(String [] args){

      
            // Test with Integer
            try {
                StatisticsCalculator<Integer> intCalc = new StatisticsCalculator<>();
                intCalc.enter(2);
                intCalc.enter(4);
                intCalc.enter(6);
                
                System.out.println("Integer test:");
                System.out.println("Sum: " + intCalc.getSum());
                System.out.println("Mean: " + intCalc.getMean());
                System.out.println("StdDev: " + intCalc.getStandardDeviation());
                System.out.println("----------------------");
            } catch (Exception e) {
                e.printStackTrace();
            }
    
            // Test with Double
            try {
                System.out.println("Double test:");
                StatisticsCalculator<Double> stats = new StatisticsCalculator<>();
stats.enter(10.0);
stats.enter(12.0);
stats.enter(23.0);
stats.enter(23.0);
stats.enter(16.0);

System.out.println("Sum: " + stats.getSum());       // Should be 84.0
System.out.println("Mean: " + stats.getMean());     // Should be 16.8
System.out.println("SD: " + stats.getStandardDeviation()); // Should be ~6.05805

    
               
            } catch (Exception e) {
                e.printStackTrace();
            }
    
            // Test with Float
            try {
                StatisticsCalculator<Float> floatCalc = new StatisticsCalculator<>();
                floatCalc.enter(2.0f);
                floatCalc.enter(4.0f);
                floatCalc.enter(6.0f);
                
                System.out.println("Float test:");
                System.out.println("Sum: " + floatCalc.getSum());
                System.out.println("Mean: " + floatCalc.getMean());
                System.out.println("StdDev: " + floatCalc.getStandardDeviation());
                System.out.println("----------------------");
            } catch (Exception e) {
                e.printStackTrace();
            }
    
            // Test with Long
            try {
                StatisticsCalculator<Long> longCalc = new StatisticsCalculator<>();
                longCalc.enter(2L);
                longCalc.enter(4L);
                longCalc.enter(6L);
                
                System.out.println("Long test:");
                System.out.println("Sum: " + longCalc.getSum());
                System.out.println("Mean: " + longCalc.getMean());
                System.out.println("StdDev: " + longCalc.getStandardDeviation());
                System.out.println("----------------------");
            } catch (Exception e) {
                e.printStackTrace();
            }
        
            
        }

        public static void assertDoubleEquals(double expected, double actual, double tolerance, String message) {
    
            // Calculate the absolute difference between the actual and expected values
            double difference = Math.abs(actual - expected);
        
            // If the difference is greater than or equal to the allowed tolerance, the test fails
            if (difference >= tolerance) {
                
                // Throw an exception with a helpful message
                throw new AssertionError(
                    message + 
                    "\nExpected: <" + expected + ">" +
                    "\nActual:   <" + actual + ">" +
                    "\nDifference: " + difference + 
                    " (Tolerance: " + tolerance + ")"
                );
            }
            // If the condition is met, the method returns silently (passes)
        }


    
    
}
