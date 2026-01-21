package HeartlandCarsOfAmericaClasses;

import java.text.DecimalFormat;

/**
 * Part-time employee class
 */
public class PartTimeEmp
{
    private String firstName;
    private String lastName;
    private double payPerHour;
    private int hoursWorked;

    /**
     * Computes and returns the compensation
     * @return compensation
     */
    public double computeCompensation()
    {
        double compensation;
        compensation = payPerHour * hoursWorked;
        return compensation;
    }

    /**
     * Creates and returns a String for Paystub
     * @return paystub information
     */
    public String createPayStub()
    {
        DecimalFormat currencyFormat = new DecimalFormat("0.00");
        double salary;

        salary = computeCompensation();
        String outStr;

        outStr = "\n\n\n\t\t" +
                "HEARTLAND CARS OF AMERICA" +
                "\n\n\t" +
                firstName + " " + lastName +
                "\n\n" +
                "\tSalary/Hour \t$" +
                currencyFormat.format(payPerHour) +
                "\n\tHours Worked \t " + hoursWorked +
                "\n\tPay \t\t$" +
                currencyFormat.format(salary) +
                "\n\n\n";

        return outStr;
    }

    /** Accessor method for first name
     * @return first name
     */
    public String getFirstName()
    {
        return firstName;
    }

    /** Accessor method for last name
     * @return last name
     */
    public String getLastName()
    {
        return lastName;
    }

    /** Accessor method for pay per hour
     * @return pay per hour
     */
    public double getPayPerHour()
    {
        return payPerHour;
    }

    /** Accessor method for hours worked
     * @return hours worked
     */
    public int getHoursWorked()
    {
        return hoursWorked;
    }

    /** Mutator method for first name
     * @param inFirstName new value for first name
     */
    public void setFirstName(String inFirstName)
    {
        firstName = inFirstName;
    }

    /** Mutator method for last name
     * @param inLastName new value for last name
     */
    public void setLastName(String inLastName)
    {
        lastName = inLastName;
    }

    /** Mutator method for pay per hour
     * @param inPayPerHour new value for pay per hour
     */
    public void setPayPerHour(double inPayPerHour)
    {
        payPerHour = inPayPerHour;
    }

    /** Mutator method for hours worked
     * @param inHoursWorked new value for hours worked
     */
    public void setHoursWorked(int inHoursWorked)
    {
        hoursWorked = inHoursWorked;
    }

    /** toString method returns name as a string
     * @return name of the customer
     */
    public String toString()
    {
        String str;
        str = firstName + " " + lastName;
        return str;
    }
}
