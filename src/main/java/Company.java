import java.util.ArrayList;

public class Company {
    int companyId;
    int wagePerHour;
    int fullDayHour;
    int workingDayInMonth;
    int workingHoursInMonth;
    int partTimeHour;
    int totalWage;
    int dailyWage;
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
        dailyWage=0;
    }

    public int getTotalWage(){
        int totalAmount=0;

        for(Employee employee:employees){
            EmployeeWage obj=new EmployeeWageBuilder();
            totalAmount+=obj.calculateTotalWage(workingDayInMonth,workingHoursInMonth,wagePerHour,employee.workingHourPerDay);
        }
        
        this.totalWage=totalAmount;
        return totalAmount;
    }

    public int getDailyWage() {
        int totalAmount=0;

        for(Employee employee:employees){
            EmployeeWage obj=new EmployeeWageBuilder();
            totalAmount+=obj.calculateDailyWage(wagePerHour,fullDayHour);
        }

        this.dailyWage=totalAmount;
        return totalAmount;
    }
}
