package theRest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller 
public class theRestHello{
	
	@RequestMapping("/theRest")
	public @ResponseBody String therest() {
			return "hello this is a simple test that verifies JAVA is up and running";
		
	}
}
