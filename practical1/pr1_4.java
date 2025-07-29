
public class pr1_4 {
    public static void main(String[] args) {

        double distance = Double.parseDouble(args[0]);
        double time = Double.parseDouble(args[1]);
        double speed = distance / time;
        System.out.println("The speed is " + speed + " units per time unit.");

        double principle = Double.parseDouble(args[2]);
        double rate = Double.parseDouble(args[3]);
        double timePeriod = Double.parseDouble(args[4]);
        double interest = (principle * rate * timePeriod) / 100;
        System.out.println("The interest is " + interest + " ruppees.");

        double radius = Double.parseDouble(args[5]);
        double height = Double.parseDouble(args[6]);
        double volume = Math.PI * radius * radius * height;
        System.out.println("Volume of Cylinder = " + volume + " cubic cm");
    }
}