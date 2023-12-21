public class Company {
    int companyId;
    int wagePerHour;
    int fullDayHour;
    int workingDayInMonth;
    int workingHoursInMonth;
    int partTimeHour;

    public Company(){

    }

    public Company(int id,int wagePerHour,int fullDayHour,int workingDayInMonth,int workingHoursInMonth,int partTimeHour){
        this.companyId=id;
        this.wagePerHour=wagePerHour;
        this.fullDayHour=fullDayHour;
        this.workingDayInMonth=workingDayInMonth;
        this.workingHoursInMonth=workingHoursInMonth;
        this.partTimeHour=partTimeHour;
    }
}
