package test.edu.generics;


import test.edu.generics.LinkedStack;;

public class MainTest {
	
	public static void main(String[] args) {
		LinkedStack<Integer> ob = new LinkedStack<Integer>();
        ob.push(5);
        ob.push(10);
        ob.push(15);
        while (!ob.IsEmpty()) {
            int x = ob.pop();
            System.out.println(x);
        }

    }

}
