package GetFromInterface;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass {
	 public static void main(String[] args) {

	        // Create Spring Container using Configuration class
	        AnnotationConfigApplicationContext app =new AnnotationConfigApplicationContext("GetFromInterface");
	        
	        Mobile mb=app.getBean(Mobile.class);
	        System.out.println(mb);

	        // Close container
	        app.close();
	    }
}
