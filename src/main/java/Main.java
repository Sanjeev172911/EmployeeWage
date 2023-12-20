public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee\n" +
                "Wage Computation");

        int temp[]={7,8,3,8,8};
        Employee employee=new Employee(20,8,5,temp);

        employee.isEmployeePresent();

        System.out.println(employee.calculateDailyWage());

        if(employee.isPartTimeEmployee()){
            employee.setPartTimeHour();
        }

        System.out.println("Daily Wage of employee is "+employee.calculateDailyWage());
        System.out.println("Monthly wage "+employee.calculateWage());
    }
}
