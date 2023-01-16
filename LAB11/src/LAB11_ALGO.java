import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LAB11_ALGO {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int count = 0;
		int plus = 1;	
		int num = 10;	
		int N = Integer.parseInt(bf.readLine());
		
		for(int i = 1; i <= N; i++) {
			if(i % num == 0) {
				plus ++;
				num *= 10;
			}
			count += plus;

		}
		System.out.println(count);
		bf.close();
	}

}