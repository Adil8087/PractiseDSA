

//public class Minimum_Operation 

import java.io.*;
import java.util.*;


public class Minimum_Operation {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
        int T = Integer.parseInt(br.readLine().trim());
        for(int t_i = 0; t_i < T; t_i++)
        {
            int n = Integer.parseInt(br.readLine().trim());
            String s = br.readLine();

            int out_ = Minimum_Operations(n, s);
            System.out.println(out_);
            
         }

         wr.close();
         br.close();
    }
    static int Minimum_Operations(int n, String s){
       // Write your code here
        int result = 0; int len=26;
        int count[]=new int[len];
        for(int i=0;i<n;i++){
            count[s.charAt(i)-'a']++;
        }
        for(int j=0;j<len;j++){
            result+=count[j]/2;
        }
       

        return result;
    
    }
}
