package com.solitudeworks.powersupply;

public class Main {

    public static void main(String[] args) {

        Device device_1 = new Device(5);
        Device device_2 = new Device(10);
        Device device_3 = new Device(3);

        PowerSupply powerSupply = new PowerSupply(15);

        System.out.println(powerSupply.AddDevice(device_1));
        System.out.println(powerSupply.AddDevice(device_2));
        System.out.println(powerSupply.AddDevice(device_3));

        System.out.println(powerSupply.RemoveDevice(device_1));
        System.out.println(powerSupply.AddDevice(device_3));

        System.out.println(powerSupply.getPowerCapacity());

    }
}
