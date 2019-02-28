public class SuperStack {

  public static void main(String[] args) {

    Stack stack = new Stack(12);
    //Ops
    stack.push(4); //push 4
    stack.pop();  //  pop
    stack.push(3); // push 3
    stack.push(5); // push 5
    stack.push(2); // push 2
    stack.inc(3, 1); // inc 3 1
    stack.pop(); // pop
    stack.push(1); // push 1
    stack.inc(2, 2); // inc 2 2
    stack.push(4);   // push 4
    stack.pop(); //pop
    stack.pop(); //pop

  }


  static class Stack {


    private Integer[] elements;

    private int headPosition = -1;

    public Stack(int n) {
      elements = new Integer[n];
    }

    void push(int k) {
      headPosition++;
      elements[headPosition] = k;
      printTop();
    }

    void pop() {

      if (!isEmpty()) {
        elements[headPosition] = null;
        headPosition--;
      }

      if (isEmpty())
        System.out.println("EMPTY");
      else
        printTop();

    }

    void inc(int e, int k) {

      if (!isEmpty()) {
        for (int i = 0; (i < e && i < headPosition); i++) {
          elements[i] += k;
        }
      }
    }

    boolean isEmpty() {
      return headPosition < 0;
    }

    void printTop() {
      System.out.println(elements[headPosition]);
    }
  }

}
