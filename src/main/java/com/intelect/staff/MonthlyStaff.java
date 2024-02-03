package com.intelect.staff;

public class MonthlyStaff implements Staff {


    private int workDays;
    private int premium;

    public MonthlyStaff(int workDays, int premium) {
        if (workDays <= 0 || workDays > 30) {
            this.workDays = 0;
        } else {
            this.workDays = workDays;
        }
        if (premium < 0 || premium > 10000) {
            this.premium = 0;
        } else {
            this.premium = premium;
        }
    }

    public int getWorkDays() {
        return workDays;
    }

    public int getPremium() {
        return premium;
    }

    @Override

    public int calculateSalary(int salary) {
        if (salary < 0){
            salary = 0;
        }
        return salary * workDays + premium;
    }
}
