public class Day {

    public static int dayOfWeek(int m, int d, int y) {
        if (m <= 2) {
            m += 12;
            y -= 1;
        }

        int h = (d + (13 * (m + 1)) / 5 + y + y / 4 - y / 100 + y / 400) % 7;

        return (h + 5) % 7; // Shift the values to match the problem's requirement
    }

    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Usage: java DayOfWeek <month> <day> <year>");
            System.exit(1);
        }

        int m = Integer.parseInt(args[0]);  // Month (1-12)
        int d = Integer.parseInt(args[1]);  // Day of the month (1-31)
        int y = Integer.parseInt(args[2]);  // Year (e.g., 2025)

        int result = dayOfWeek(m, d, y);

        System.out.println(result);
    }
}
