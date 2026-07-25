import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double currentValue = 10000;
        double growthRate = 0.10;   // 10%

        System.out.println("Enter number of Years:");
        int years = sc.nextInt();

        double result = Forecast.futureValue(currentValue, growthRate, years);

        System.out.println("Future Value after " + years + " years = " + result);

        sc.close();
    }
}