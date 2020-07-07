package Testing;

import java.io.FileNotFoundException;
import java.io.IOException;

public class TestException {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        try {
            testExceptions();
        } 
        catch (Exception e1) {
            e1.printStackTrace();
        }
    }

	private static void testExceptions() {
		// TODO Auto-generated method stub
		
	}
}