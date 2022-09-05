import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

abstract class cake {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int HC[]= {2};
		int VC[]= {2};
		long h=1000000000;
		long w=1000000000;
		Arrays.sort(HC); // 1,3
        Arrays.sort(VC); // 1
        
        int PHC=0;
        int PVC=0;
        
        List<Long> partHC=new ArrayList<>();
        List<Long> partVC=new ArrayList<>();
        
        for(int i=0;i<HC.length;i++){
            partHC.add((long) (HC[i]-PHC));   //1,2,2
            PHC=HC[i];
            if(i==HC.length-1)
                partHC.add(h-PHC);
        }
        for(int j=0;j<VC.length;j++){
            partVC.add((long) (VC[j]-PVC)); //1,3
            PVC=VC[j];
            if(j==VC.length-1)
                partVC.add(w-PVC); //3
        }
        
        long maxCut=1;
        int n= partHC.size();
        int t= partVC.size();
        for(int ii=0;ii<partHC.size();ii++){
        	Long pehle=partHC.get(ii);
            for(int jj=0;jj<partVC.size();jj++){
            	Long dusre=partVC.get(jj);
                maxCut=Math.max(maxCut, partHC.get(ii)*partVC.get(jj));                
            }
            
        }
        
        System.out.println(maxCut);
	}

}
