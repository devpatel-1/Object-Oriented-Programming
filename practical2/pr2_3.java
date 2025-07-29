public class pr2_3 {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);

        String day = switch (a) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            case 7 -> "Sunday";
            default -> "Invalid input";
        };
        System.out.println(day);
    }
    
}