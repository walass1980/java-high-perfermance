package chapter08;

public class CH8SoftReferenceExample {
    public static void main(String[] args) {
        
    }
}

class MyBougieObject {
    private String name;

    public MyBougieObject(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}