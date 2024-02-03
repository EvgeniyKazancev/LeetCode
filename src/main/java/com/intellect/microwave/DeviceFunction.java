package com.intellect.microwave;

abstract class DeviceFunction implements DeviceMode {
    public void printHeatingMode() {
        System.out.println("The device is in heating mode");
    }

    public void deviceOn() {
        System.out.println("Device is ON");
    }

    abstract void deviceOff();
}
