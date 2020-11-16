package stack;

public class TwoStackUsingSingleArray {
    static final int MAX = 1000;
    int top1 = -1;
    int top2 = MAX;
    int arr[] = new int[MAX];

    void push1(int x) {
        if (top1 < top2) {
            arr[top1++] = x;
        }
    }

    void push2(int x) {
        if (top1 < top2) {
            top2--;
            arr[top2--] = x;
        }
    }

}
