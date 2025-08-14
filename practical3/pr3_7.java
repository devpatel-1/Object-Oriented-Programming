public class pr3_7 {
    public static void main(String[] args) {
        
        StringBuilder sb = new StringBuilder("Hello");

        sb.append(" world");
        System.out.println("After append: " + sb);

        sb.insert(5, ", Java");
        System.out.println("After insert: " + sb);

        sb.deleteCharAt(5);
        System.out.println("After deleteCharAt: " + sb);

        sb.replace(6, 10, "Dev");
        System.out.println("After replace: " + sb);

        sb.reverse();
        System.out.println("After reverce: " + sb);

    }
}
