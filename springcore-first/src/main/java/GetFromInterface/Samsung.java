package GetFromInterface;

import org.springframework.stereotype.Component;

@Component
public class Samsung implements Mobile{
public void text(){
		System.out.println("texting");
	}
}
