package day42_collection;

import java.util.PriorityQueue;

public class QueueObjects2 {
    public static void main(String[] args) {
        PriorityQueue <String> queue = new PriorityQueue<>();
        queue.offer("hello");
        queue.offer("world");
        queue.offer("java");
        queue.offer("selenium");
        queue.offer("apple");
        queue.offer("zebra");

        System.out.println(queue);
        System.out.println(queue.peek());

        queue.poll();
        System.out.println(queue);
    }
}
