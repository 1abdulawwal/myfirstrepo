import java.util.*;
import java.util.stream.*;
import java.util.function.Function;

class GFG {

    // Function to convert Stream to Array
    public static <T> Object[] convertStreamToArray(Stream<T> stream)
    {
        return stream.toArray();
    }

    public static void main(String args[])
    {
        // Create a stream of integers
        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5);

        // Convert Stream to array
        Object[] array = convertStreamToArray(stream);

        // Print the array of stream
        System.out.println("Array from Stream: "
                           + Arrays.toString(array));
    }
}:wq
