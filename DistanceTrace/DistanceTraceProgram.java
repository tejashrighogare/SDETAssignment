package DistanceTrace;

public class DistanceTraceProgram {
    //Length of race track based on the final distance between participants
    public static void main(String[] args) {
        int result = finalDistance(11, 90, 80);
        System.out.println(result);
        result = finalDistance(10, 20, 12);
        System.out.println(result);
    }

    public static int finalDistance(int A, int B, int C) {
        int result = 0;
        result = (A * C) / (A + C - B);
        return result;
    }
}