import java.util.ArrayList;
import java.util.List;

public class StringIndex
{
	public static void main(String[] args) {
		
		String s="nishanthnish";
		String pattern="nis";
		
		List<Integer> indices = new ArrayList<>();
		
		int start =0;
		
		while (true)
		{
		    int idx = s.indexOf(pattern,start);
		    
		    if(idx == -1){
		        break;
		    }
		    
		    indices.add(idx);
		    
		    start=idx+1;
		    
		}
		
		System.out.print(indices);
		
		
	}
}
