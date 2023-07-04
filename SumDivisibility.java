// Objective : Write a program to find the sum of all integers greater than 40 and less than 250 that are divisible by 5.

package labEx;
public class SumDivisibility {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 41; i < 250; i++) {
            if (i % 5 == 0) {
                sum += i;
            }
        }
        System.out.println("Sum of integers greater than 40 and less than 250 that are divisible by 5: " + sum);
    }
}