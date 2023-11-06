package SDA3.arrays;

import java.util.Arrays;

public class Ex9 {
    public static void main(String[] args) {
        int[] taskDuration ={3,2,1,2,6};
        System.out.println("Timpul minim de executie a task-urilor:" +minimumWaitingTime(taskDuration));

    }
    public static int minimumWaitingTime(int[] taskDuration){
        Arrays.sort(taskDuration);
        int totalTime = 0;
        int waitingTime = 0;
        for (int i = 0; i < taskDuration.length; i++) {
            totalTime += waitingTime + taskDuration[i];
            waitingTime += taskDuration[i];
        }
        return totalTime;
    }
}
