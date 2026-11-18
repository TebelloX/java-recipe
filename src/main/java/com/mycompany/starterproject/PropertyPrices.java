package com.mycompany.starterproject;

import java.util.Locale;

/**
 * Stores the average property type prices for three provinces in a
 * two-dimensional array, and prints each province's average property price.
 *
 * @author tebellox
 */
public class PropertyPrices {

    // Single array that stores the province names (one per row of the price table)
    private static final String[] PROVINCES = {"Gauteng", "Natal", "Cape"};

    // Single array that stores the property type headings (one per column)
    private static final String[] PROPERTY_TYPES = {"FLAT", "TOWN HOUSE", "HOUSE"};

    // Two-dimensional array: each row is a province, each column is a property type
    private static final int[][] PRICES = {
        {800000, 1500000, 2000000},  // Gauteng
        {700000, 1200000, 1600000},  // Natal
        {750000, 1300000, 1800000}   // Cape
    };

    public static void main(String[] args) {
        printPriceTable();
        System.out.println();
        printProvinceAverages();
    }

    /**
     * Prints the headings and every price in the 2D array as a table.
     */
    private static void printPriceTable() {
        // Print the column headings, leaving space for the province column
        System.out.printf("%-15s", "");
        for (String propertyType : PROPERTY_TYPES) {
            System.out.printf("%-20s", propertyType);
        }
        System.out.println();
        System.out.println("-".repeat(75));

        // Outer loop goes through the provinces (rows)
        for (int row = 0; row < PRICES.length; row++) {
            System.out.printf("%-15s", PROVINCES[row]);

            // Inner loop goes through the property types (columns)
            for (int col = 0; col < PRICES[row].length; col++) {
                System.out.printf("%-20s", "R " + PRICES[row][col]);
            }
            System.out.println();
        }
    }

    /**
     * Calculates and prints the average property price for each province.
     */
    private static void printProvinceAverages() {
        for (int row = 0; row < PRICES.length; row++) {
            int average = calculateAverage(PRICES[row]);
            // %,d adds thousands separators; Locale.US makes them commas (1,433,333)
            // even on a computer set to South African number formatting
            System.out.printf(Locale.US, "Average property prices in %s = R %,d%n",
                    PROVINCES[row], average);
        }
    }

    /**
     * Adds up the prices in one row and divides by the number of property types.
     *
     * @param provincePrices the prices for one province
     * @return the average price (whole rands, as in the sample output)
     */
    private static int calculateAverage(int[] provincePrices) {
        int total = 0;
        for (int price : provincePrices) {
            total += price;
        }
        return total / provincePrices.length;
    }
}