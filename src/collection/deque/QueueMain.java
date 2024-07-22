package collection.deque;

import java.util.*;

public class QueueMain {
    public static void main(String[] args) {
        Queue<Integer> queue = new ArrayDeque<>();
        //Queue<Integer> queue = new LinkedList<>(); //LinkedList로 해도 됨. But ArrayDeque가 더 빠름

        // 데이터 추가
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        System.out.println("queue = ");
        System.out.println(queue);

        //다음 꺼내올 데이터 확인(꺼내지 않고 단순 조회만)
        System.out.println("queue.peek() = " + queue.peek());

        //데이터 꺼내기
        System.out.println("queue.poll() = " + queue.poll());
        System.out.println("queue.poll() = " + queue.poll());
        System.out.println("queue.poll() = " + queue.poll());
        System.out.println("queue = ");
        System.out.println(queue);

    }
}
