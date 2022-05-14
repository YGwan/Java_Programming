package Fifth_2;

import java.util.ArrayList;
import java.util.TreeMap;

class MyStack<T> implements IStack<T> {

    ArrayList<T> arrayList = null;
    public MyStack() {
        this.arrayList = new ArrayList<>();
    }

    @Override
    public T pop() {
        if(arrayList.size() == 0)
            return null;
        else
            return arrayList.remove(0);
    }

    @Override
    public boolean push(T ob) {
        arrayList.add(0, ob);
        return true;
    }
}

public class P10 {

    public static void main(String[] args) {
        IStack<Integer> stack = new MyStack<>();
        for (int i=0; i<10; i++) {
            stack.push(i);
        }
        while (true) {
            Integer n = stack.pop();
            if(n == null) break;
            System.out.print(n + " ");
        }
    }
}


