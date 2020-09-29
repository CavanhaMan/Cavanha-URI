/*-------------------*
| Rodrigo CavanhaMan |
| URI 2750           |
| Saida 4            |
*--------------------*/
public class Main {
	public static void main(String[] args) {
		int[] decimal = new int[16];
		String[] octal = new String[16];
		String[] hexa = new String[16];
		int i;
		for(i=0 ; i<16 ; i++){
			decimal[i]=i;
			octal[i]=Integer.toString(decimal[i],8);
			hexa[i]=Integer.toString(decimal[i],16).toUpperCase();
		}
		System.out.printf("---------------------------------------\n");
		System.out.printf("| decimal  | octal  | Hexadecimal  |\n");
		System.out.printf("---------------------------------------\n");
		for(i=0 ; i<16 ; i++)
			System.out.printf("| %2d    | %2s    | %2s       |\n",decimal[i],octal[i],hexa[i]);
		System.out.printf("---------------------------------------\n");
	}
}
