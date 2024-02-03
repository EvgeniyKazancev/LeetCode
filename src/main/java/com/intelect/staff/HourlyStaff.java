package com.intelect.staff;

public class HourlyStaff implements Staff{
    private  int workTime;

    public HourlyStaff(int workTime) {
        if (workTime >= 4 && workTime <= 10 ) {
            this.workTime = workTime;
        }else
           this.workTime = 0;

    }

    public int getWorkTime() {
        return workTime;
    }
    @Override
    public int calculateSalary(int salary) {
        if (salary < 0){
            salary = 0;
        }
        return salary * workTime;
    }
}
