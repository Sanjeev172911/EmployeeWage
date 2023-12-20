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
}
