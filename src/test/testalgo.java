package test;

public class testalgo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
		int tab[]= {-20,-30,-17};
		int big = biggest(tab);

		System.out.println ("max = "+ big);
		System.out.println("coucou");
	}

	private static int biggest(int[] tab) {
		// TODO Auto-generated method stub
		int max=Integer.MIN_VALUE;
		
		for(int i=0;i<tab.length;i++) {
			if(tab[i]>max)
				max=tab[i];
		}
		
		
		return max;
	}
     
}
