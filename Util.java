import java.util.Random;

public class Util<T> {

	
	public static <T>  T randomEl(T [] array)
	{
		
		Random random = new Random();
		//generate random number
		int randomNumber= random.nextInt(array.length);
		
		return array[randomNumber];
		
	}
	public static void main(String[] args) {
		
		Integer array[]= {4,56,78,765};
		
		String names[]= {"John","Kay","Jane","Julian","Lia","Amy"};
 
		
		System.out.println(Util.randomEl(array));
	
		System.out.println(Util.randomEl(array));
	
		System.out.println(Util.randomEl(array));
		
		
		System.out.println(Util.randomEl(names));
		System.out.println(Util.randomEl(names));
		
		System.out.println(Util.randomEl(names));
	
		System.out.println(Util.randomEl(names));
		
		
	}
	/* Output
	 * 	78
		4
		56
		
		Lia
		Lia
		Amy
		Kay

	 
	 */

}
