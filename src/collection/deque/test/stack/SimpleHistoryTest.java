package collection.deque.test.stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class SimpleHistoryTest {
    public static void main(String[] args) {
        Deque<String> deque = new ArrayDeque<>();
        deque.push("youtube.com");
        deque.push("google.com");
        deque.push("facebook.com");

        System.out.println(deque.pop());
        System.out.println(deque.pop());
        System.out.println(deque.pop());

    }
}
