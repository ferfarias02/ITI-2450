package HeartlandCarsOfAmericaPayRollFileVersion;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

import java.util.Scanner;

import HeartlandCarsOfAmericaClasses.FullTimeEmp;
import HeartlandCarsOfAmericaClasses.PartTimeEmp;
import HeartlandCarsOfAmericaClasses.SalesEmp;

/**
 * File version payroll program:
 * Reads employee data from employee.dat and writes pay stubs to payroll.dat
 */
public class HeartlandCarsOfAmericaPayRollFileVersion
{
    public static void main(String[] args) throws FileNotFoundException, IOException
    {
        // Use project-root files by default (best for Eclipse)
        File inFile = new File("employee.dat");
        File outFile = new File("payroll.dat");

        // If your teacher requires C:\ paths (like the book example), uncomment these:
        // File inFile = new File("C:\\employee.dat");
        // File outFile = new File("C:\\payroll.dat");

        try (Scanner scannedInfo = new Scanner(inFile);
             PrintWriter out = new PrintWriter(outFile))
        {
            // Loop through ALL employees in the file
            while (scannedInfo.hasNext())
            {
                char inputEmployeeType = scannedInfo.next().charAt(0);

                switch (inputEmployeeType)
                {
                    case 'F':
                    case 'f':
                    {
                        String inputFirstName = scannedInfo.next();
                        String inputLastName = scannedInfo.next();
                        double inputBaseSalary = scannedInfo.nextDouble();
                        int inputHoursWorked = scannedInfo.nextInt();

                        FullTimeEmp fullTimeEmployee = new FullTimeEmp();
                        fullTimeEmployee.setFirstName(inputFirstName);
                        fullTimeEmployee.setLastName(inputLastName);
                        fullTimeEmployee.setBaseSalary(inputBaseSalary);
                        fullTimeEmployee.setHoursWorked(inputHoursWorked);

                        out.print(fullTimeEmployee.createPayStub());
                        break;
                    }

                    case 'P':
                    case 'p':
                    {
                        String inputFirstName = scannedInfo.next();
                        String inputLastName = scannedInfo.next();
                        double inputPayPerHour = scannedInfo.nextDouble();
                        int inputHoursWorked = scannedInfo.nextInt();

                        PartTimeEmp partTimeEmployee = new PartTimeEmp();
                        partTimeEmployee.setFirstName(inputFirstName);
                        partTimeEmployee.setLastName(inputLastName);
                        partTimeEmployee.setPayPerHour(inputPayPerHour);
                        partTimeEmployee.setHoursWorked(inputHoursWorked);

                        out.print(partTimeEmployee.createPayStub());
                        break;
                    }

                    case 'S':
                    case 's':
                    {
                        String inputFirstName = scannedInfo.next();
                        String inputLastName = scannedInfo.next();
                        double inputBaseSalary = scannedInfo.nextDouble();
                        int inputSalesVolume = scannedInfo.nextInt();

                        SalesEmp salesEmployee = new SalesEmp();
                        salesEmployee.setFirstName(inputFirstName);
                        salesEmployee.setLastName(inputLastName);
                        salesEmployee.setBaseSalary(inputBaseSalary);
                        salesEmployee.setSalesVolume(inputSalesVolume);

                        out.print(salesEmployee.createPayStub());
                        break;
                    }

                    default:
                        // If the file has a bad record, stop with a clear message:
                        throw new IllegalArgumentException(
                                "Unknown employee type in file: " + inputEmployeeType);
                }
            }
        }
    }
}
