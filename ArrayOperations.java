public class ArrayOperations {
    private int[] data;

    // Constructor to initialize the data array
    public ArrayOperations(int[] data) {
        this.data = data;
    }

    // Method to calculate and return the total sum of the elements in the array
    public int getTotal() {
        int total = 0;
        for (int i = 0; i < data.length; i++) {
            total += data[i];
        }
        return total;
    }

    // Method to calculate and return the average of the elements in the array
    public double getAverage() {
        int sum = getTotal(); // Reusing the total sum calculation
        return (double) sum / data.length;
    }

    // Method to find and return the highest value in the array
    public int getHighest() {
        int highest = data[0];
        for (int i = 0; i < data.length; i++) {
            if (data[i] > highest) {
                highest = data[i];
            }
        }
        return highest;
    }

    // Method to find and return the lowest value in the array
    public int getLowest() {
        int lowest = data[0];
        for (int i = 0; i < data.length; i++) {
            if (data[i] < lowest) {
                lowest = data[i];
            }
        }
        return lowest;
    }

    // Main method to test the functionality of the ArrayOperations class
    public static void main(String[] args) {
        // Test data initialization
        int[] testData = {26, 85, 25, 94, 3, 95, 65, 90, 42, 56, 65, 81, 4, 59, 48, 1, 46, 7, 60, 98, 32, 40, 54, 85, 77, 69, 51, 16, 54, 87};

        // Creating an instance of ArrayOperations
        ArrayOperations arrayOperations = new ArrayOperations(testData);

        // Displaying the test data and the results of the operations
        System.out.printf("Test Data: ");
        for (int i = 0; i < testData.length; i++) {
            System.out.printf(" %s", testData[i]);
        }
        System.out.printf("\nTotal: %d\n", arrayOperations.getTotal());
        System.out.printf("Average: %.2f\n", arrayOperations.getAverage());
        System.out.printf("Highest Value: %d\n", arrayOperations.getHighest());
        System.out.printf("Lowest Value: %d\n", arrayOperations.getLowest());
    }
}
