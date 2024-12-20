import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
       
        int N = Integer.parseInt(br.readLine());
        
        int array[][]=new int[N][2];
        
        for(int i=0; i<N; i++) {
        	StringTokenizer st = new StringTokenizer(br.readLine());
        	array[i][0]= Integer.parseInt(st.nextToken());
        	array[i][1]= Integer.parseInt(st.nextToken());
        }
        
        Arrays.sort(array,(e1,e2)->{
        	if(e1[0]==e2[0]) {
        		return e1[1]-e2[1];
        	} else {
        		return e1[0]-e2[0];
        	}
        });
        
        StringBuilder sb = new StringBuilder();
        
        for(int i=0; i<N; i++) {
        	sb.append(array[i][0]+" "+array[i][1]).append("\n");
        }
        
        bw.write(sb.toString());
        
        bw.flush();
     
                
    }
}
