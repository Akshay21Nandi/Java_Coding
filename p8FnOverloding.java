public class p8FnOverloding {
    // //Funtion overloding using parameters
    //// funtion to calclute sum of 2 number
    // public static int sum(int a, int b) {
    // int add = a + b;
    // return add;
    // }

    //// Funtion to calclute sum of 3 number
    // public static int sum(int a, int b, int c) {
    // int add = a + b + c;
    // return add;
    // }

    // public static void main(String[] args) {
    // System.out.println(sum(3, 5));
    // System.out.println(sum(5, 6, 7));
    // }

    // Funtion Overloding using Data types

    // func to cal int sum
    public static int sum(int a, int b) {
        int add = a + b;
        return add;

    }

    // fumc to cal float sum
    public static float sum(float a, float b) {
        float add = a + b;
        return add;
    }

    public static void main(String args[]) {
        System.out.println(sum(2, 4));
        System.out.println(sum(4.8f, 3.2f));
    }

}
