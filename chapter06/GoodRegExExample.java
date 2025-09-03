package chapter06;

public class GoodRegExExample {
    public static void main(String[] args) {
        // Email pattern regex
        String emailRegex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";

        // Sample email addresses
        String[] emails = {
            "java@example.com",
            "muzz.acruise@gmail.com",
            "invalid-email",
            "bougie@.com",
            "@example.com",
            "brenda@domain.",
            "edward@domain.co",
            "user@example"
        };
    }
}
