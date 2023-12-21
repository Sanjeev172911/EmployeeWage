import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    static Map<Integer,Company> dataBase;

    public static void takeInputForCompany(){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter Company Id ");
        Integer id=input.nextInt();
        System.out.println("Enter WagePerHour ");
        int wagePerHour=input.nextInt();
        System.out.println("Enter Full Day Working Hour ");
        int fullDayHour=input.nextInt();
        System.out.println("Enter working Day In Month ");
        int workingDayInMonth=input.nextInt();
        System.out.println("Enter working Hours In Month ");
        int workingHoursInMonth=input.nextInt();
        System.out.println("Enter Part Time Hour");
        int partTimeHour=input.nextInt();

        Company company=new Company(id,wagePerHour,fullDayHour,workingHoursInMonth,workingDayInMonth,partTimeHour);
        dataBase.put(id,company);
    }

    public static Employee takeInputForEmployee(){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter Employee Id ");
        int EmpId=input.nextInt();
        System.out.println("Enter Company Id ");
        int CompanyId=input.nextInt();
        int []workingHours={5,7,5,8,7,8,6};

        return new Employee(EmpId,CompanyId,workingHours);
    }
    public static void main(String[] args) {
        dataBase=new HashMap<>();
        System.out.println("Welcome to Employee\n" +
                "Wage Computation");

        takeInputForCompany();
        Employee employee=takeInputForEmployee();
        Company company=dataBase.get(employee.companyId);
        if(employee.isEmployeePresent()){
            System.out.println("Daily Wage "+employee.calculateDailyWage(company.wagePerHour,company.fullDayHour));
        }

        employee.isPartTimeEmployee();

        System.out.println("Maximum Monthly Wage of Employee Id "+employee.id+" is "+
                employee.calculateMaximumMonthlyWage(company.wagePerHour,company.fullDayHour,company.workingDayInMonth));

        System.out.println("Total Monthly Wage of Employee Id "+employee.id+" is "+
                employee.calculateTotalWage(company.workingDayInMonth,company.workingHoursInMonth,company.wagePerHour));

    }
}
