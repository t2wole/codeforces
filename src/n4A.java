import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class n4A {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		int weight = Integer.parseInt(br.readLine());
		
		if(weight > 2) {	// �ѷ� ������ �� ���� ��� ¦���� YES(4���� ����). �ƴϸ� NO
			if(weight % 2 == 0) 
				System.out.println("YES");
			else 
				System.out.println("NO");
		}
		else {
			System.out.println("NO");
		}

	}

}
