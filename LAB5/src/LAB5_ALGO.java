import java.util.*;
import java.io.*;

public class LAB5_ALGO {
	static final int MAX = 1000000; 

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		long v[];
		long sum[];
		
		v = new long[MAX+1];
		sum = new long[MAX+1];
		
		for(int i = 1; i <= MAX; i++) { 
			v[i] = 1;
		}
		
		for(int i = 2; i <= MAX; i++) {
			for(int j = 1; j*i <= MAX; j++) { 
            		
				v[j*i] += i; 
			}
		}
		
		for(int i = 1; i <= MAX; i++){
			sum[i] = sum[i-1] + (int)v[i];
		}
		
		int t = Integer.parseInt(bf.readLine());
		while(t--> 0) {
			int n = Integer.parseInt(bf.readLine());
			bw.write(sum[n]+"\n");
		}
		
		bw.flush();
		
	}

}