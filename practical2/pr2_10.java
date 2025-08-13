public class pr2_10 {
    public static void main(String[] args) {
        
        int i = 25;
        float f = i;
        double d = f;

        System.out.println("Widening Typecastig:");
        System.out.println("int i = " + i);
        System.out.println("float f = " + f);
        System.out.println("double d = " + d);

        double d2 = 89.76;
        float f2 = (float) d2;
        int i2 = (int) f2;

        System.out.println("\nNarrowing Typecasting:");
        System.out.println("double d2 = " + d2);
        System.out.println("float f2 = (float d2) " + f2);
        System.out.println("int i2 = (int) f2 " + i2);

    }
}
