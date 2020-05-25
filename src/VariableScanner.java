import java.util.Scanner;

public class VariableScanner {	
	// Create method that checks whether input is of data type 'byte' 
	public static boolean isByte(int i) {
		if (-128 <= i && i <= 127) {
		return true; 
		}
		else return false; 
	}
	
	// create method that returns 'byte' data within response 
	static VariableType checkByte = new VariableType("byte", "-128 and 127", "1", "numerical integer", "");
	
	// Create method that checks whether input is of data type 'short'
	public static boolean isShort(int i) {
		if (-32768 <= i && i <= 32767) {
		return true; 
		}
		else return false; 
	}
	
	// create method that returns 'short' data within response 
	static VariableType checkShort = new VariableType("short",  "-32768 and 32767", "2",  "numerical integer", ""); 
	
	// create method that returns 'int' data within response 
	static VariableType checkInt = new VariableType("int", "-2147483648 and 2147483647", "4", "numerical integer", "");

	// create method that returns 'long' data within response 
	static VariableType checkLong = new VariableType("long", "-9223372036854775808 and 9223372036854775807L", "8", "numerical integer", "L");
	
	// create method that returns 'float' data within response 
	static VariableType checkFloat = new VariableType( "float", "-3.402823e38 and 3.402823e38", "4", "numerical decimal", "");
	
	// create method that returns 'float' data within response 
	static VariableType checkDouble = new VariableType("double", "-1.79769313486231570e+308 and 1.79769313486231570e+308", "8", "numerical decimal", ""); 

	// create method that returns 'boolean' data within response 
	static VariableType checkBoolean= new VariableType("boolean", "true or false", "N/A", "binary", "");

	public static void main(String[] args) {
		// Initialize variable response 
		String response = ""; 
		
		// Ask user to provide input
		System.out.println("What input do you want evaluated?");
		// Scan input
		Scanner scan = new Scanner(System.in);
		
		// Checks whether input is purely numerical
		if (scan.hasNextInt()) { 
			String input = scan.nextLine(); 
			int i= Integer.parseInt(input);
			
			// Checks whether numerical input is of type byte
			if (isByte(i)) { 
				response = checkByte.createResponse(input);  
			}
			// Checks whether numerical input is of type short
			else if (isShort(i)) {
				response = checkShort.createResponse(input); 
			}
			// Concludes that numerical input must be of type integer
			else {
				response = checkInt.createResponse(input); 
			}
		
		}
		
		// Checks whether numerical input is of type long
		else if (scan.hasNextLong()) {
			String input = scan.nextLine(); 
			response = checkLong.createResponse(input); 
		}
		
		// Checks whether numerical input is of type float
		else if (scan.hasNextFloat()) {
			String input = scan.nextLine(); 
			response = checkFloat.createResponse(input); 
		}
		
		// Checks whether numerical input is of type double+#7
		
		else if (scan.hasNextDouble()) {
			String input = scan.nextLine();
			response = checkDouble.createResponse(input); 
		}
		
		// Checks whether numerical input is of type boolean
		else if (scan.hasNextBoolean()) {
			String input = scan.nextLine();
			response = checkBoolean.createResponse(input); 
		}
		
		// In case the input is not numerical, checks for whether the input is of type string or character 
        else {
        	// Checks whether input is a character 
        	String input = scan.nextLine(); 
        	int a = input.length();
			if (a == 1) {
				response = "Your input is of data type 'character' because it is letter input with a length of 1. It has a size of 2 bytes. Recommended notation: char i = " + input + ";";
			}
			else {
				response = "Your input is of data type 'string' because it is a sequence of characters larger than length 1. It has a size of " + a*2 + " bytes (2 * number of character bytes). Recommended notation: String i = " + input + ";";
			}
		}

		
		// Provides output if input data type could not be defined 
		if (!response.isEmpty()){
			System.out.println(response);	
		}
		// Provides output in case input data type could not be defined 
		else {
			 System.out.println("No idea ;(");
		}

}
}