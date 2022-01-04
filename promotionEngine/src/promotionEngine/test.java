package promotionEngine;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class test {
	// case1	
	@Test
	void test() {
		String userInput = "1\n1\n1\n0\n";
		String expected = "Enter quantity of product ID A : Enter quantity of product ID B : Enter quantity of product ID C : Enter quantity of product ID D : Total : 100";
	    inputTest(userInput,expected);
	}
	@Test
	void test2() {	    
	 // case2
	    String userInput = "5\n5\n1\n0\n";
	    String expected = "Enter quantity of product ID A : Enter quantity of product ID B : Enter quantity of product ID C : Enter quantity of product ID D : Total : 370";
 	    inputTest(userInput,expected);
	}
	@Test
	void test3() {	    
	 // case3
	    String userInput = "3\n5\n1\n1\n";
	    String expected = "Enter quantity of product ID A : Enter quantity of product ID B : Enter quantity of product ID C : Enter quantity of product ID D : Total : 280";
 	    inputTest(userInput,expected);
	}
	@Test 
	void test4() {	    
	 // case4
	    String userInput = "3\n5\n1\n2\n";
	    String expected = "Enter quantity of product ID A : Enter quantity of product ID B : Enter quantity of product ID C : Enter quantity of product ID D : Total : 295";
 	    inputTest(userInput,expected);
	}

	public void inputTest(String user_input, String expected) {
		String userInput = String.format(user_input);
	    ByteArrayInputStream bais = new ByteArrayInputStream(userInput.getBytes());
	    System.setIn(bais);
	    
	    ByteArrayOutputStream baos = new ByteArrayOutputStream();
	    PrintStream printStream = new PrintStream(baos);
	    System.setOut(printStream);
		
	    Engine.main(null); // call the main method

	    String[] lines = baos.toString().split(System.lineSeparator());
	    String actual = lines[lines.length-1];

	    // checkout output
	    Assert.assertEquals(expected,actual);
	}

}
