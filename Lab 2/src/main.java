public class main {
    public static void main(String[] args) {
        for (String arg : args) {
            try {
                int number = Integer.parseInt(arg);
                String binary = Integer.toBinaryString(number);
                System.out.println(number + " -> " + binary);
            } catch (NumberFormatException e) {
                System.out.println("Невірне число: " + arg);
            }
        }
    }
}