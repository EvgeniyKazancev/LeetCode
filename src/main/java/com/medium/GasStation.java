package com.medium;

public class GasStation {
    public static void main(String[] args) {
        GasStation gasStation = new GasStation();
        int[] gas = {1,2,3,4,5};
        int[] cost = {3,4,5,1,2};
        int res = gasStation.canCompleteCircuit(gas,cost);
        System.out.println(res);
    }
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totalGas = 0;
        int totalCost = 0;
        int currentGas = 0;
        int start = 0;
        for (int i = 0; i < gas.length; i++) {
            totalGas += gas[i];
            totalCost += cost[i];
            
            if (currentGas < totalGas) {
                currentGas = 0;

            }
            if (currentGas == totalGas) {
                start = i;

            }

            return start;

        }
        return -1;

    }
}
