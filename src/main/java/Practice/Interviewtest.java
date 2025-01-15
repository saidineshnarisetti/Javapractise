package Practice;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.nio.file.Paths;
import java.util.Map;

public class Interviewtest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//byte[] jsonData = Files.readAllBytes(Paths.get("test.json"));
		
		ObjectMapper mapper = new ObjectMapper();
		//test obj = mapper.readValue(new File("test.json"), test.class);
		//Test obj = mapper.readValue(new File("test.json"), Test.class);
		Map<String, Object> jsonMap = mapper.readValue(new File("test.json"), Map.class);
		
		String cidValue = (String) jsonMap.get("cid");
		System.out.println("Value of 'cid' field: " + cidValue);
		
//		System.out.println(obj);
//		Staff obj = mapper.readValue("{'name' : 'cid'}", test.class);
		

	}

}
