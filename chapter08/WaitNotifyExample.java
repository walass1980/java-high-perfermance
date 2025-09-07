public class WaitNotifyExample {
    private static class SharedResource {
        private String message;
        private boolean empty = true;

        public synchronized String take() {
            // Wait until the message is available.
            while (empty) {
                try {
                    wait();
                } catch (InterruptedException e) {}
            }
            // Toogle status to true.
            empty = true;
            // Notify producer that status has changed.
            notifyAll();
            return message;
        }
    }
}
