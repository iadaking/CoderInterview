package A001_设计一个有getMin功能的栈;

import java.util.Stack;

public class MyStack2 {
    private Stack<Integer> stackData;
    private Stack<Integer> stackMin;

    public MyStack2() {
        this.stackData = new Stack<Integer>();
        this.stackData = new Stack<Integer>();
    }

    public void push(int newData) {
        if (this.stackMin.isEmpty()) {
            this.stackMin.push(newData);
        }
        if (newData <= this.getMin()) {
            this.stackMin.push(newData);
        } else {
            this.stackMin.push(this.getMin());
        }
        this.stackData.push(newData);
    }

    public int pop() {

    }


}
