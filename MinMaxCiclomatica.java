package minMax;

import static org.junit.Assert.*;

import org.junit.Test;




public class MinMaxCiclomatica {

	boolean iguales(int[] a, int[] b){
		if((a==null && b==null) || (a==null && b.length==0) || (a.length==0 && b==null)){
			return true;
		}
		if(a.length!=b.length){
			return false;
		}else{
			for(int i=0; i<a.length; i++){
				if(a[i]!=b[i]) return false;
			}
		}
		return true;
	}	
		
	@Test
	public void test() {
		
		int[] array;
		int[] res;
		
		//Test 1
		array = new int[4];
		array[0]=2; array[1]=1; array[2]=3; array[3]=1;
					
		res = new int[2];
		res[0]=1; res[1]=3;
		assertEquals(iguales(MinMax.minMax(array), res), true);
		
		//Test 2
		assertEquals(iguales(MinMax.minMax(null), null), true);
	}

}
