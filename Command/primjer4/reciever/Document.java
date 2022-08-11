package primjer4.reciever;

public class Document {
	public String content = "";
	
	public Document() {
		this.content = "";
	}
	
	private void writeToConsole() {
		try {
			System.out.println("Content of File: ");
			System.out.println(content);
			System.out.println("===============================================================\n");
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void append(String content) {
		try {
			this.content += content;
		
			writeToConsole();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void write(String content) {
		try {
			this.content = content;
		
			writeToConsole();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public String getState() {
		return content;
	}
}
