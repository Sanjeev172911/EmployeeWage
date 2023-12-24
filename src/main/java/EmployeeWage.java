interface EmployeeWage {

    boolean isEmployeePresent();
    int calculateDailyWage(int wagePerHour,int fullDayHour);
    boolean isPartTimeEmployee();
    int calculateMaximumMonthlyWage(int wagePerHour,int fullDayHour,int workingDayInMonth);
    int calculateTotalWage(int workingDayInMonth,int workingHoursInMonth,int wagePerHour,int []workingHourPerDay);
}
