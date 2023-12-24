import java.util.ArrayList;

public class Company {
    int companyId;
    int wagePerHour;
    int fullDayHour;
    int workingDayInMonth;
    int workingHoursInMonth;
    int partTimeHour;
    int totalWage;
    ArrayList<Employee>employees;

    public Company(){

    }

    public Company(int id,int wagePerHour,int fullDayHour,int workingDayInMonth,int workingHoursInMonth,int partTimeHour){
        this.companyId=id;
        this.wagePerHour=wagePerHour;
        this.fullDayHour=fullDayHour;
        this.workingDayInMonth=workingDayInMonth;
        this.workingHoursInMonth=workingHoursInMonth;
        this.partTimeHour=partTimeHour;
        totalWage=0;
    }

    public int getTotalWage(){
        int totalAmount=0;
        for(Employee employee:employees){
            employee=new EmployeeWageBuilder();
            totalAmount+=employee.calculateTotalWage(workingDayInMonth,workingHoursInMonth,wagePerHour);
        }

        this.totalWage=totalAmount;
        return totalAmount;
    }
}
