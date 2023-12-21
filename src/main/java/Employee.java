public class Employee {
    int id;
    int companyId;
    int []workingHourPerDay;
    Employee(int id,int companyId,int []workingHours){
        this.id=id;
        this.companyId=companyId;
        int days=workingHours.length;
        workingHourPerDay=new int [days];
        for(int i=0;i<days;i++) workingHourPerDay[i]=workingHours[i];
    }

    public boolean isEmployeePresent(){
        double chancePresent=Math.random();

        if(chancePresent<.5){
            System.out.println("Employee is absent");
            return false;
        }
        else{
            System.out.println("employee is present");
            return true;
        }
    }

    public int calculateDailyWage(int wagePerHour,int fullDayHour){
        return wagePerHour*fullDayHour;
    }

    public boolean isPartTimeEmployee(){
        int id=(int)Math.round(Math.random());

        switch (id){
            case 0:
                System.out.println("worker is a part time employee");
                return true;
            default:
                System.out.println("Worker is a full time employee");
                return false;
        }
    }

    public int calculateMaximumMonthlyWage(int wagePerHour,int fullDayHour,int workingDayInMonth){
        return wagePerHour*fullDayHour*workingDayInMonth;
    }

    public int calculateTotalWage(int workingDayInMonth,int workingHoursInMonth,int wagePerHour){
        int days=0;
        int hours=0;
        int totalWage=0;

        while(days<workingHourPerDay.length && days<=workingDayInMonth && hours<=workingHoursInMonth){

            totalWage+=workingHourPerDay[days]*wagePerHour;
            hours+=workingHourPerDay[days];
            days++;
        }
        
        return totalWage;
    }
}
