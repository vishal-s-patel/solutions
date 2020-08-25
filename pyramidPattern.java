public class pyramidPattern{
	public static void main(String args[]){
		int rows = 4,pos =0;
		String elements[] = {"a1","b2","c2","d3","e3","f3","g4","h4","i4","j4"};
		for(int i=1;i<=rows;i++){
			for(int j=0;j<rows-i;j++){
				System.out.print(" ");
			}
			for(int k=0;k<i;k++){
				System.out.print(elements[pos]+" ");
				pos++;
			}
			System.out.println("\n");
		}
	}
}
