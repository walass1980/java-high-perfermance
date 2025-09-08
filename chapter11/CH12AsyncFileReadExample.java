package chapter11;

import java.nio.ByteBuffer;
import java.nio.channels.AsynchronousFileChannel;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.concurrent.Future;

public class CH12AsyncFileReadExample {
    public static void main(String[] args) {
        // Define the path to the file
        Path path = Paths.get("ch12.txt");

        // Use AsynchronousFileChannel to open the file for reading
        try (AsynchronousFileChannel fileChannel = AsynchronousFileChannel.open(path, StandardOpenOption.READ)) {
            // Allocate a ByteBuffer to read data into
            ByteBuffer buffer = ByteBuffer.allocate(1024);

            // Perform the asynchronous read
            Future<Integer> result = fileChannel.read(buffer, 0); // Read from position 0

            // Do other tasks while the read operation completes
            while (!result.isDone()) {
                System.out.println("Processing something else while reading input...");
            }
        } catch (Exception e) {
            System.err.println("Error encountered " + e.getMessage());
        }
    }
}
