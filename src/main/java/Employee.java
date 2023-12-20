public class Employee {
    int wagePerHour;
    int fullDayHour;
    int workingDayInMonth;
    int []workingHourPerDay;

    Employee(int wagePerHour,int fullDayHour,int workingDayInMonth,int []workingHours){
        this.wagePerHour=wagePerHour;
        this.fullDayHour=fullDayHour;
        this.workingDayInMonth=workingDayInMonth;
        int []workingHourPerDay=new int [workingDayInMonth];

        for(int i=0;i<workingDayInMonth;i++) workingHourPerDay[i]=workingHours[i];
    }

    public void isEmployeePresent(){
        double chancePresent=Math.random();

        if(chancePresent<.5) System.out.println("Employee is absent");
        else System.out.println("employee is present");
    }

    public int calculateDailyWage(){
        return wagePerHour*fullDayHour;
    }

    public void setPartTimeHour(){
        this.fullDayHour=8;
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

    public int calculateMonthlyWage(){
        return wagePerHour*fullDayHour*workingDayInMonth;
    }

    public int calculateWage(){
        int days=0;
        int hours=0;
        int totalWage=0;
        while(days<workingHourPerDay.length && days<=20 && hours<=100){
            totalWage+=workingHourPerDay[days]*wagePerHour;
            hours+=workingHourPerDay[days];
            days++;
        }
        
        return totalWage;
    }
}
