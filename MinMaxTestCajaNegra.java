package minMax;

import static org.junit.Assert.*;

import org.junit.Test;

public class MinMaxTestCajaNegra {

	private int[] array;
	
	@Test
	public void arrayConLongitudCeroDevuelveNull(){
		array = new int[0];
		assertEquals(MinMax.minMax(array),null);
	}
	
	@Test
	public void arrayNuloDevuelveNull(){
		array = null;
		assertEquals(MinMax.minMax(array),null);
	}
	
	@Test
	public void arrayNoVacioNiNuloDevuelveMaxYMin(){
		int[] result = new int[2];
		result[0]=0; result[1]=9;
		array = new int[10];
		for(int i=0; i<array.length; i++){
			array[i] = i;
		}
			
		assertEquals(iguales(MinMax.minMax(array), result), true);
	}
	
	
	boolean iguales(int[] a, int[] b){
		if(a.length!=b.length){
			return false;
		}else{
			for(int i=0; i<a.length; i++){
				if(a[i]!=b[i]) return false;
			}
		}
		return true;
	}
}
