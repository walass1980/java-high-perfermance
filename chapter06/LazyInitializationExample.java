package chapter06;

import java.util.function.Supplier;

public class LazyInitializationExample {
    private Supplier<String> lazyString = () -> {
        // Simulate complex string generation or data retrival
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Java is incredibbbly ");
        stringBuilder.append("flexible programming langage ");
        stringBuilder.append("text is used in a wide range of application. ");
        stringBuilder.append("This is a complex string ");
        stringBuilder.append("that was lazely initiated.");
        return stringBuilder.toString();
    };

    public String getLazyString() {
        return lazyString.get();
    } 

    public static void main(String[] args) {
        LazyInitializationExample example = new LazyInitializationExample();

        // Accessing the lazy-initialized string
        String lazyString = example.getLazyString();
        System.out.println("Lazy initialized string: " + lazyString);
    }
}
