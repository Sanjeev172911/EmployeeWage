public class Employee {
    int id;
    int companyId;
    int []workingHourPerDay;
    Employee(){

    }
    Employee(int id,int companyId,int []workingHours){
        this.id=id;
        this.companyId=companyId;
        int days=workingHours.length;
        workingHourPerDay=new int [days];
        for(int i=0;i<days;i++) workingHourPerDay[i]=workingHours[i];
    }

    public int calculateTotalWage(int workingDayInMonth,int workingHoursInMonth,int wagePerHour){
        return 0;
    }
}
