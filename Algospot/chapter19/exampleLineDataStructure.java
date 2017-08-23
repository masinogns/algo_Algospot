import java.util.*;

/**
 * Created by masinogns on 2017. 8. 16..
 *
 * 일렬로 늘어선 자료들을 표현하는 자료 구조로써
 * 자료를 넣고 꺼내는 연산을 지원한다
 *
 * 큐와 스택 데크는 일렬로 늘어선 형탱의 자료들을 저장할 수 있다
 * 자료구조의 구분은 "어느 쪽 끝에서 자료를 넣고 뺄 수 있는가?" 이다
 * Stack, Queue, Double-ended-queue--> Dequeue
 */
public class exampleLineDataStructure {

    /**
     * 구조의 한쪽 단에서만 데이터를 저장하고 접근할 수 있는 컬렉션
     */
    public void impleStack() {
        Stack<Integer> stack = new Stack<>();

        stack.push(3);
        stack.push(15);
        System.out.println(stack.peek());
        stack.pop();
        System.out.println(stack.peek());
    }

    /**
     * 구조의 양쪽 단에서만 데이터를 저장하고 접근할 수 있는 컬렉션
     *
     * 큐는 인터페이스이므로 구현 클래스를 이용해서 구현해야한다
     * 구현 클래스는 여러 개가 있다
     *
     * priorityQueue, prioirtyBlockingQueue, LinkedList
     * offer(E o) 요소 큐에 추가
     * poll() 큐의 haed의 요소를 반환, 큐가 비어있으면 null 반환
     *
     */
    public static void impleQueueUsingLinkedList(){
        Queue<Integer> queue = new LinkedList<>();

        queue.offer(11);
        queue.offer(22);

        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
    }

    public static void impleQueueUsingPriorityQueue(){
        Queue<Integer> queue = new PriorityQueue<>();

        queue.offer(11);
        queue.offer(22);

        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
    }

    /**
     * 큐의 양쪽 끝에서 삽입과 삭제를 할 수 있는 큐이다
     * 큐와 스택의 성질을 모두 가지고 있는 자료구조이다
     *
     * offerFirst, offerLast
     * pollFirst, pollLast
     *
     * 언제 써야할지 굳이
     *
     */
    public static void impleDequeueUsingLinkedList(){
        Deque deque = new LinkedList();


    }

    public static void impleDequeueUsingArrayDeque(){
        Deque deque = new ArrayDeque();
    }

    public static void main(String[] args) {
        impleQueueUsingLinkedList();
        impleQueueUsingPriorityQueue();
    }
}
