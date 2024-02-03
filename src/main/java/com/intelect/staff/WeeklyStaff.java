package com.intelect.staff;

public class WeeklyStaff extends MonthlyStaff {

    private int workWeeks;

    public int getWorkWeeks() {
        return workWeeks;
    }

    public WeeklyStaff(int workDays, int premium, int workWeeks) {
        super(workDays, premium);
        if (workWeeks >= 2 && workWeeks <= 4) {
            this.workWeeks = workWeeks;
        } else {
            this.workWeeks = 0;
        }

    }


    @Override
    public int calculateSalary(int salary) {
        return workWeeks * salary;
    }

    public void printYearSalary(int salary) {
        if (salary < 0){
            salary = 0;
        }
        int yearSalary = workWeeks * salary * 26;
        System.out.println(yearSalary);
    }

}
