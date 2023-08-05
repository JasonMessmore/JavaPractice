public class Customer {
    private String name;
    private String creditLimit;
    private String emailAddress;

    public Customer() {
        this("JohnnyB", "emailAddress");
        this.creditLimit = getCreditLimit();
        System.out.println("This is the constructor with no arguments");
    }

    public Customer(String name, String creditLimit, String emailAddress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
        System.out.println("Constructor with all three fields called");
    }

    public Customer(String name, String email) {
        this(name, "3000", email);
        System.out.println("Constructor with name and email arguments called");
    }

    public String getName() {
        return name;
    }

    public String getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}
