public class SecondSmallest {
    public static void main(String[] args) {
        int[] arr = {7, 3, 9, 1, 4, 1};

      
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int num : arr) {
            if (num < smallest) {
                secondSmallest = smallest;
                smallest = num;
            } else if (num < secondSmallest && num != smallest) {
                secondSmallest = num;
            }
        }

        if (secondSmallest == Integer.MAX_VALUE) {
            System.out.println("No second smallest element found (array may contain all same values or only one unique value).");
        } else {
            System.out.println("Second smallest element is: " + secondSmallest);
        }
    }
}
