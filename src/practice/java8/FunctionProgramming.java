package practice.java8;

import java.util.function.Function;

public class FunctionProgramming {

	public static void main(String[] args) {
		Function<Integer,Integer> add = x -> x + 1; //increments an integer x by one
		Function<String,String> concat = x -> x + 1; //concatenates the integer 1 to any string x

		Integer two = add.apply(1); //yields 2
		String answer = concat.apply("0 + 1 = "); //yields "0 + 1 = 1"
	}

	public static Integer add1(Integer x) { return x + 1; }
	public static String concat1(String x) { return x + 1; }

	Function<Integer,Integer> add1 = FunctionProgramming::add1;
	Function<String,String> concat1 = FunctionProgramming::concat1;

	/*
	 * The cool thing about functions is that they encapsulate behavior, 
	 * and now we can take a piece of code, put it into a function and 
	 * pass it around to other functions or methods for them to use it. 
	 * This type of functions that operate on (or produce new) functions are 
	 * called high order functions and the programming style based on exploiting this powerful feature is called, 
	 * unsurprisingly, 
	 * high order programming.
	 */

	Function<Integer, Function<Integer,Integer>> makeAdder = x -> y -> x + y;


	Function<Integer,Integer> add11 = makeAdder.apply(1);
	Function<Integer,Integer> add12 = makeAdder.apply(2);
	Function<Integer,Integer> add13 = makeAdder.apply(3);

	//alternative
	public static Function<Integer, Integer> adder(Integer x) {
		return y -> x + y;
	}
	
	Function<Integer, Function<Integer,Integer>> makeAdder1 = FunctionProgramming::adder;
	Function<Integer,Integer> add21 = makeAdder.apply(1);
	
	Function<Integer, Integer> plus = x->x+1;
	Function<Integer, Integer> mul3 = x->x+2;
	
	Integer res = mul3.apply(add1.apply(10));
	
}
