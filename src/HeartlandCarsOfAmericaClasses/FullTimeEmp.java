package HeartlandCarsOfAmericaClasses;

import java.text.DecimalFormat;

/**
 * Full-time employee class
 */
public class FullTimeEmp
{
    private String firstName;
    private String lastName;
    private double baseSalary;
    private int hoursWorked;

    /**
     * Computes and returns the compensation
     * @return compensation
     */
    public double computeCompensation()
    {
        double compensation, payPerHour;

        payPerHour = baseSalary / 80;

        if (hoursWorked > 80)
        {
            compensation = baseSalary +
                    (hoursWorked - 80) * 1.5 * payPerHour;
        }
        else
        {
            compensation = baseSalary;
        }

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
                "\tBasic Salary \t$" +
                currencyFormat.format(baseSalary) +
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

    /** Accessor method for base salary
     * @return base salary
     */
    public double getBaseSalary()
    {
        return baseSalary;
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

    /** Mutator method for base salary
     * @param inBaseSalary new value for base salary
     */
    public void setBaseSalary(double inBaseSalary)
    {
        baseSalary = inBaseSalary;
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
