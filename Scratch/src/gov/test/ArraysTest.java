package gov.test;

import java.util.Arrays;

class ArraysTest {
    public static void main(String[] args) {
        int[] ages = new int[3];
        ages[0] = 30;
        ages[1] = 30;
        ages[2] = 50;

        for(int age : ages) {
            System.out.printf("The age is: %s\n", age);
        }
        System.out.printf("This array has %s values\n", ages.length);

        System.out.println(Arrays.toString(ages));

        double[] temps = {63.3, 88.0, 73.0, 66.2, 70.0};
        for(double temp : temps) {
            System.out.printf("The current temperature is: %s\n", temp);
        }
        System.out.println(Arrays.toString(temps));

        String[] names = {"jay", "bre", "roncia", "jai"};
        System.out.println(Arrays.toString(names));
    }
}