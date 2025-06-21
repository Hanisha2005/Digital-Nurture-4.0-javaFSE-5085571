package financialforecasting;

public class FinancialForecast {

    public static double futureValue(double pv, double[] rates, int n) {
        if (n == 0) {
            return pv;
        }
        return (1 + rates[n - 1]) * futureValue(pv, rates, n - 1);
    }

    public static void main(String[] args) {
        double pv = 1000;
        double[] rates = {0.05, 0.04, 0.06, 0.03, 0.05, 0.02, 0.04, 0.03, 0.05, 0.04};
        int n = rates.length;

        double fv = futureValue(pv, rates, n);
        System.out.println("Future Value: " + fv);
    }
}
