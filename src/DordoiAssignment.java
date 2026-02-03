public class DordoiAssignment {

    public static void calculatePay(double basePay, int hours) {

        if (basePay < 8.0) {
            System.out.println("Error: Base pay is less than minimum wage");
            return;
        }

        if (hours > 60) {
            System.out.println("Error: Hours worked exceed 60");
            return;
        }

        double totalPay;

        if (hours <= 40) {
            totalPay = hours * basePay;
        } else {
            int overtimeHours = hours - 40;
            totalPay = (40 * basePay) + (overtimeHours * basePay * 1.5);
        }

        System.out.println("Total pay: $" + totalPay);
    }

    public static void main(String[] args) {

        calculatePay(7.50, 35);
        calculatePay(8.20, 47);
        calculatePay(10.00, 73);
    }
}
