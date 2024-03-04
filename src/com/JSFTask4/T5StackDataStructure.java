package com.JSFTask4;
import java.util.EmptyStackException;
public class T5StackDataStructure {
        private int[] stack;
        private int top;
        private int capacity;

        public T5StackDataStructure(int capacity) {
            this.capacity = capacity;
            stack = new int[capacity];
            top = -1;
        }

        public boolean isEmpty() {
            return top == -1;
        }


        public boolean isFull() {
            return top == capacity - 1;
        }

        public void push(int element) {
            if (isFull()) {
                System.out.println("Stack overflow. Cannot push element onto full stack.");
                return;
            }
            stack[++top] = element;
            System.out.println("Pushed element: " + element);
        }
        public int pop() {
            if (isEmpty()) {
                throw new EmptyStackException();
            }
            int poppedElement = stack[top];
            top--;
            System.out.println("Popped element: " + poppedElement);
            return poppedElement;
        }
        public static void main(String[] args) {
            T5StackDataStructure stack = new T5StackDataStructure(5);

            stack.push(45);
            stack.push(23);
            stack.push(12);

            stack.pop();
            stack.pop();
            stack.pop();

            try {
                stack.pop();
            } catch (EmptyStackException e) {
                System.out.println("Cannot pop from an empty stack.");
            }
        }


}
