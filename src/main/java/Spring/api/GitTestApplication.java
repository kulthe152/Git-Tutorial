package Spring.api;
                                                                                                        
import org.springframework.stereotype.Controller;                                 
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
                                      
@Controller                
public class GitTestApplication {
	@RequestMapping("/purchase")
	public String Purchase(@RequestBody Orderdto orderdto){
		return "Hi " + orderdto.getUsername() + " "+ orderdto.getAmount() +" "+ orderdto.getAmount();
	}
}
