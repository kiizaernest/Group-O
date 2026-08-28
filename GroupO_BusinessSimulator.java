public class GroupO_BusinessSimulator {

    public static void main(String[] args) {

        // Store the four item names in an array
        String[] itemNames = {
            "Petrol (litre)",
            "Diesel (litre)",
            "Engine Oil",
            "Car Wash"
        };

        // Store the prices in another array
        double[] prices = {
            5000.00,
            4800.00,
            25000.00,
            10000.00
        };

        // Quantities being bought
        int[] quantities = {
            19,  // Petrol
            2,   // Diesel
            2,   // Engine Oil
            4    // Car Wash
        };

        // -----------------------------
        // DISPLAY PRICE LIST
        // -----------------------------

        System.out.println("===== POWERFUEL STATION =====");

        for (int i = 0; i < itemNames.length; i++) {

            System.out.printf(
                "%d. %s - UGX %.2f%n",
                i + 1,
                itemNames[i],
                prices[i]
            );
        }


        // -----------------------------
        // CALCULATE SUBTOTALS
        // -----------------------------

        double[] subtotals = new double[itemNames.length];

        for (int i = 0; i < itemNames.length; i++) {

            subtotals[i] = calculateSubtotal(
                prices[i],
                quantities[i],
                i
            );
        }

    }

}