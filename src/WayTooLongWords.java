import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WayTooLongWords {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < n; i++) {
			
			String words = br.readLine();	
			
			if(words.length() > 10) 
				sb.append(words.charAt(0)).append(words.length() - 2).append(words.charAt(words.length() - 1)).append("\n");		
			else 
				sb.append(words).append("\n");	
		}
		
		System.out.print(sb.toString());
		
	}

}
