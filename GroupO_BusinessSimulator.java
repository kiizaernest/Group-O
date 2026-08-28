public class GroupO_BusinessSimulator{

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
<<<<<<< HEAD


        // -----------------------------
        // CALCULATE GRAND TOTAL
        // -----------------------------

        double grandTotal = 0;

        for (int i = 0; i < subtotals.length; i++) {

            grandTotal = grandTotal + subtotals[i];
        }


        // -----------------------------
        // PRINT RECEIPT
        // -----------------------------

        printReceipt(
            itemNames,
            quantities,
            subtotals,
            grandTotal
        );
    }


    // =================================================
    // METHOD 1: CALCULATE SUBTOTAL AND APPLY DISCOUNT
    // =================================================

    public static double calculateSubtotal(
        double price,
        int quantity,
        int itemIndex
    ) {
=======

        // CALCULATE GRAND TOTAL
        // -----------------------------
>>>>>>> d839eda12ebd1af05f29bcc77ba5b372b1246d5a

        double grandTotal = 0;

<<<<<<< HEAD

        // Petrol
        if (itemIndex == 0) {

            if (quantity >= 20) {

                subtotal = subtotal - (subtotal * 0.05);
            }

        }

        // Diesel
        else if (itemIndex == 1) {

            // Diesel has no discount
            subtotal = subtotal;

        }

        // Engine Oil
        else if (itemIndex == 2) {

            if (quantity >= 3) {

                subtotal = subtotal - 3000;
            }

        }

        // Car Wash
        else if (itemIndex == 3) {

            if (quantity >= 4) {

                subtotal = subtotal - (subtotal * 0.10);
            }

        }


        return subtotal;
    }


    // =========================================
    // METHOD 2: PRINT THE ITEMISED RECEIPT
    // =========================================

    public static void printReceipt(
        String[] itemNames,
        int[] quantities,
        double[] subtotals,
        double grandTotal
    ) {

        System.out.println();
        System.out.println("===== RECEIPT =====");


        for (int i = 0; i < itemNames.length; i++) {

            System.out.printf(
                "%s x%d = UGX %.2f",
                itemNames[i],
                quantities[i],
                subtotals[i]
            );


            // Petrol discount message
            if (i == 0) {

                if (quantities[i] >= 20) {

                    System.out.println(" (5% discount applied)");

                } else {

                    System.out.println(
                        " (no discount - fewer than 20)"
                    );
                }

            }

            // Diesel discount message
            else if (i == 1) {

                System.out.println(
                    " (no discount)"
                );

            }

            // Engine Oil discount message
            else if (i == 2) {

                if (quantities[i] >= 3) {

                    System.out.println(
                        " (UGX 3,000 discount applied)"
                    );

                } else {

                    System.out.println(
                        " (no discount - fewer than 3)"
                    );
                }

            }

            // Car Wash discount message
            else if (i == 3) {

                if (quantities[i] >= 4) {

                    System.out.println(
                        " (10% discount applied)"
                    );

                } else {

                    System.out.println(
                        " (no discount - fewer than 4)"
                    );
                }

            }

        }


        System.out.println(
            "-------------------------------------------"
        );

        System.out.printf(
            "TOTAL = UGX %.2f%n",
            grandTotal
        );
    }
=======
        for (int i = 0; i < subtotals.length; i++) {

            grandTotal = grandTotal + subtotals[i];
        }

        // -----------------------------
        // PRINT RECEIPT
        // -----------------------------

        printReceipt(
            itemNames,
            quantities,
            subtotals,
            grandTotal
        );
    }

    // =================================================
    // METHOD 1: CALCULATE SUBTOTAL AND APPLY DISCOUNT
    // =================================================

    public static double calculateSubtotal(
        double price,
        int quantity,
        int itemIndex
    ) {

        double subtotal = price * quantity;


        // Petrol
        if (itemIndex == 0) {

            if (quantity >= 20) {

                subtotal = subtotal - (subtotal * 0.05);
            }

        }

        // Diesel
        else if (itemIndex == 1) {

            // Diesel has no discount
            subtotal = subtotal;

        }

        // Engine Oil
        else if (itemIndex == 2) {

            if (quantity >= 3) {

                subtotal = subtotal - 3000;
            }

        }

        // Car Wash
        else if (itemIndex == 3) {

            if (quantity >= 4) {

                subtotal = subtotal - (subtotal * 0.10);
            }

        }


        return subtotal;
    }

    // =========================================
    // METHOD 2: PRINT THE ITEMISED RECEIPT
    // =========================================

    public static void printReceipt(
        String[] itemNames,
        int[] quantities,
        double[] subtotals,
        double grandTotal
    ) {

        System.out.println();
        System.out.println("===== RECEIPT =====");


        for (int i = 0; i < itemNames.length; i++) {

            System.out.printf(
                "%s x%d = UGX %.2f",
                itemNames[i],
                quantities[i],
                subtotals[i]
            );


            // Petrol discount message
            if (i == 0) {

                if (quantities[i] >= 20) {

                    System.out.println(" (5% discount applied)");

                } else {

                    System.out.println(
                        " (no discount - fewer than 20)"
                    );
                }

            }

            // Diesel discount message
            else if (i == 1) {

                System.out.println(
                    " (no discount)"
                );

            }

            // Engine Oil discount message
            else if (i == 2) {

                if (quantities[i] >= 3) {

                    System.out.println(
                        " (UGX 3,000 discount applied)"
                    );

                } else {

                    System.out.println(
                        " (no discount - fewer than 3)"
                    );
                }

            }

            // Car Wash discount message
            else if (i == 3) {

                if (quantities[i] >= 4) {

                    System.out.println(
                        " (10% discount applied)"
                    );

                } else {

                    System.out.println(
                        " (no discount - fewer than 4)"
                    );
                }

            }

        }


        System.out.println(
            "-------------------------------------------"
        );

        System.out.printf(
            "TOTAL = UGX %.2f%n",
            grandTotal
        );
    }

>>>>>>> d839eda12ebd1af05f29bcc77ba5b372b1246d5a
}