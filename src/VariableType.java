import java.util.Scanner;

public class VariableType {
	String name;
	String range;
	String size;
	String kind;
	String l;
	
	public String createResponse(String input) {
		String type = name + " = " + input + l + ";";
		String response = "Your input is of data type '" + name + "' because it is a " + kind
				+ " input within the range of " + range + ". It has a size of " + size
				+ " bytes. Recommended notation: " + type;
		return response;
	}
	
	public VariableType(String name, String range, String size, String kind, String l) {
		this.name = name; 
		this.range = range; 
		this.size = size; 
		this.kind = kind; 
		this.l = l; 
	}

}
