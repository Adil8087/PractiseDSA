import java.io.BufferedReader;
import java.io.InputStreamReader;


public class DoubleInversion2 {
	public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
        //get number of inputs
        int num = Integer.parseInt(br.readLine());
        
        //while expecting more inputs
        while(num > 0) {
            int length = Integer.parseInt(br.readLine());
 
            //get inverted and inverted reverse arrays
            String[] array = br.readLine().split(" ");
            String[] reverse = br.readLine().split(" ");
 
            System.out.println(getOriginalArray(array, reverse, length));
            num--;
        }
    }
 
    private static String getOriginalArray(String[] a, String[] r, int length) {
        if(Integer.parseInt(a[0]) != 0 || Integer.parseInt(r[0]) != 0) {
            return "-1";
        }
 
        StringBuilder answer = new StringBuilder();
 
        int sum = 0;
 
        for(int i = 0; i < length; i++) {
            int aValue = Integer.parseInt(a[i]);
            int rValue = Integer.parseInt(r[length-1-i]);
            int tSum = aValue + rValue;
            if(tSum > length-1) {
                return "-1";
            }
 
            int tValue = length - tSum;
            sum += tValue;
            
            answer.append(" " + tValue);
        }
        if(sum != length * (length + 1) / 2) {
            return "-1";
        }
 
        return answer.toString().trim();
    }
}
