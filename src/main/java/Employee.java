public class Employee {
    int wagePerHour;
    int fullDayHour;

    Employee(int wagePerHour,int fullDayHour){
        this.wagePerHour=wagePerHour;
        this.fullDayHour=fullDayHour;
    }

    public boolean isEmployeePresent(){
        double chancePresent=Math.random();

        if(chancePresent<.5) return false;
        return true;
    }

    public int calculateDailyWage(){
        return wagePerHour*fullDayHour;
    }

    public void setPartTimeHour(){
        this.fullDayHour=8;
    }
}
