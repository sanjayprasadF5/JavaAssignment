package lambda;

import java.awt.List;
import java.util.ArrayList;
import java.util.function.Consumer;

public class question8 extends Thread{
	public void run() {
		System.out.println("thread is running");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		question8 t=new question8();
		t.start();
		ArrayList<Integer> numbers=new ArrayList<>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		numbers.add(5);
		numbers.add(6);
		numbers.add(7);
		Consumer<ArrayList<Integer>>print=list ->list.stream().forEach(a->System.out.println(a+""));
		print.accept(numbers);
		
		

	}

}
