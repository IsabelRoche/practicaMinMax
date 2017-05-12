package minMax;

import static org.junit.Assert.*;

import org.junit.Test;

public class MinMaxTestCajaBlanca {

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
	public void statementCoverage() {
		int[] array = new int[3];
		array[0]=2; array[1]=1; array[2]=3;
		
		int[] res = new int[2];
		res[0]=1; res[1]=3;
		
		assertEquals(iguales(MinMax.minMax(array), res), true);
	}
	
	
	
	@Test
	public void decisionCoverage(){
		//Test 1
		int[] array = new int[0];
		int[] res = null;
		assertEquals(iguales(MinMax.minMax(array),null), true);
		
		//Test 2
		array = new int[4];
		array[0]=2; array[1]=1; array[2]=3; array[3]=1;
		
		res = new int[2];
		res[0]=1; res[1]=3;
		
		assertEquals(iguales(MinMax.minMax(array), res), true);
	}
	
	@Test
	public void conditionCoverage(){
		//Test 1
		int[] array = new int[0];
		int[] res = null;
		assertEquals(iguales(MinMax.minMax(array),null), true);
		
		//Test 2
		array = new int[4];
		array[0]=2; array[1]=1; array[2]=3; array[3]=1;
		
		res = new int[2];
		res[0]=1; res[1]=3;
		
		assertEquals(iguales(MinMax.minMax(array), res), true);
		
		//Test 3
		assertEquals(iguales(MinMax.minMax(null), null), true);
	}
	
	@Test
	public void decisionConditionCoverage(){
		//Test 1
		int[] array = new int[0];
		int[] res = null;
		assertEquals(iguales(MinMax.minMax(array),null), true);
		
		//Test 2
		array = new int[4];
		array[0]=2; array[1]=1; array[2]=3; array[3]=1;
		
		res = new int[2];
		res[0]=1; res[1]=3;
		
		assertEquals(iguales(MinMax.minMax(array), res), true);
		
		//Test 3
		assertEquals(iguales(MinMax.minMax(null), null), true);
	}
	
}
