public class Main {
    public static void main(String[] args) {
        Customer john = new Customer("Johnson Bricks", "Johnnybricks@gmail.com");

        Customer sam = new Customer();
        System.out.println("Sam's email is: " + sam.getEmailAddress());
    }
}