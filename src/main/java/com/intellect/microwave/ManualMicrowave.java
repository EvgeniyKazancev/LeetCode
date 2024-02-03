package com.intellect.microwave;

public class ManualMicrowave extends DeviceFunction{
    @Override
    void deviceOff() {
        System.out.println("Waiting for new task");
    }
}
