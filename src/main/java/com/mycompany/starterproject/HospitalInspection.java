package com.mycompany.starterproject;

/**
 * Model class that holds the details of a single hospital inspection.
 *
 * @author tebellox
 */
public class HospitalInspection {

    // Private fields keep the data encapsulated inside the object
    private final String hospitalName;
    private final String hospitalLocation;
    private final int yearsSinceInspection;

    /**
     * Constructor that creates a hospital inspection with all of its details.
     *
     * @param hospitalName         the name of the hospital
     * @param hospitalLocation     the location of the hospital
     * @param yearsSinceInspection years since the last inspection (1 to 5)
     */
    public HospitalInspection(String hospitalName, String hospitalLocation, int yearsSinceInspection) {
        this.hospitalName = hospitalName;
        this.hospitalLocation = hospitalLocation;
        this.yearsSinceInspection = yearsSinceInspection;
    }

    // Getter methods give read-only access to the private fields
    public String getHospitalName() {
        return hospitalName;
    }

    public String getHospitalLocation() {
        return hospitalLocation;
    }

    public int getYearsSinceInspection() {
        return yearsSinceInspection;
    }

    /**
     * Builds the "years" text, using "year" for 1 and "years" for anything else.
     *
     * @return the years since inspection as readable text, e.g. "3 years"
     */
    public String getYearsText() {
        return yearsSinceInspection + (yearsSinceInspection == 1 ? " year" : " years");
    }
}