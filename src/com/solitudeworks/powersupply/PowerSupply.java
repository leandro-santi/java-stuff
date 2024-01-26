package com.solitudeworks.powersupply;

import java.util.ArrayList;
import java.util.List;

public class PowerSupply {

    private int powerCapacity;
    private List<Device> deviceList = new ArrayList<>();

    public PowerSupply(int powerCapacity) {
        this.powerCapacity = powerCapacity;
    }

    public int getPowerCapacity() {
        return powerCapacity;
    }

    public boolean AddDevice(Device device) {
        int devicePower = device.power();
        if (devicePower <= powerCapacity) {
            deviceList.add(device);
            DecrementPowerSupply(devicePower);
            return true;
        }
        return false;
    }

    public boolean RemoveDevice(Device device) {
        if (!deviceList.contains(device)) return false;
        powerCapacity += device.power();
        return deviceList.remove(device);
    }

    private void DecrementPowerSupply(int power) {
        powerCapacity -= power;
    }

}
