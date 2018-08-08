package antra.greet;
import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
@RestController
@CrossOrigin(origins = "http://localhost:4200" ,allowCredentials = "false")	
public class GreetController {
@RequestMapping("/greet")

public ResponseEntity<GreetEntity> getEntity(@RequestParam(value="number", defaultValue="hello world") String message) {
		GreetEntity haha=new GreetEntity(1,"hello "+message);
return new ResponseEntity<GreetEntity>(haha, HttpStatus.OK);
}
@CrossOrigin(origins = "http://localhost:4200" ,allowCredentials = "false")	
@RequestMapping(value="/number" , produces = MediaType.APPLICATION_JSON_VALUE)
public number convert(@RequestParam(value= "number")  String num, 
		@RequestParam(value= "pageSize", defaultValue="20")  int size, 
		@RequestParam(value= "page",defaultValue="1")  int pageNum) {
	String[] map= {"0", "1","2ABC","3DEF","4GHI","5JKL","6MNO","7PQRS","8TUV","9WXYZ"};
	List<String> result=new ArrayList<>();
	List<String> previous=new ArrayList<>();
	result.add("");
	for(int i=0;i<num.length();i++) {
		int index=Integer.parseInt(num.substring(i,i+1));
		String letters=map[index];
		for(String str:result) {
			for(int j=0;j<letters.length();j++)  previous.add(str+letters.charAt(j));
		}
			result=previous;
			previous=new ArrayList<>();
	}
	number shit=new number(result.size(),result.subList(size*(pageNum-1), size*pageNum>result.size()?result.size():size*pageNum));
	return shit;
}
	
}

                 