package HeartlandCarsOfAmericaClasses;

import java.text.DecimalFormat;

/**
 * Sales employee class
 */
public class SalesEmp
{
    private String firstName;
    private String lastName;
    private double baseSalary;
    private double salesVolume;

    /**
     * Computes and returns the compensation
     * @return compensation
     */
    public double computeCompensation()
    {
        double compensation;
        compensation = baseSalary + 0.02 * salesVolume;
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
                "\n\tSales Volume \t$" +
                currencyFormat.format(salesVolume) +
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

    /** Accessor method for sales volume
     * @return sales volume
     */
    public double getSalesVolume()
    {
        return salesVolume;
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

    /** Mutator method for sales volume
     * @param inSalesVolume new value for sales volume
     */
    public void setSalesVolume(double inSalesVolume)
    {
        salesVolume = inSalesVolume;
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
