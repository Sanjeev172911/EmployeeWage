public class Employee {
    public boolean checkAttendance(){
        double chancePresent=Math.random();

        if(chancePresent<.5) return false;
        return true;
    }
}
