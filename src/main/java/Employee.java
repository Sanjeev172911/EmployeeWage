import java.util.Random;

public class Employee {
    int wagePerHour;
    int fullDayHour;


    Employee(int wagePerHour,int fullDayHour){
        this.wagePerHour=wagePerHour;
        this.fullDayHour=fullDayHour;
    }

    public boolean checkAttendance(){
        double chancePresent=Math.random();

        if(chancePresent<.5) return false;
        return true;
    }

    public int calculateDailyWage(){
        return wagePerHour*fullDayHour;
    }

    public Boolean isPartTimeEmployee(){
        int identity=(int)Math.round(Math.random());

        switch(identity){
            case 0:
                return false;
            default:
                return true;
        }

    }
}
