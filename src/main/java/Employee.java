public class Employee {
    public boolean isEmployeePresent(){
        double chancePresent=Math.random();

        if(chancePresent<.5) return false;
        return true;
    }
}
