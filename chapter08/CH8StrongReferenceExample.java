public class CH8StrongReferenceExample {
    public static void main(String[] args) {
        SampleCorgiObject SampleCorgiObject = new SampleCorgiObject();

        System.out.println(SampleCorgiObject);
    }

    static class SampleCorgiObject {
        @Override
        public String toString() {
            return "This is a SampleCorgiObject instance.";
        }
    }
}
