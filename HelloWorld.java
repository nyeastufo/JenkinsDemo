import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime;    

public class HelloWorld {    
	public static void main(String[] args) {    
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
		LocalDateTime now = LocalDateTime.now();  
		System.out.println("Hello World " + dtf.format(now));  
	}    
}    
