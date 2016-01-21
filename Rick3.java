public class Rick3 {
	public static void main(String[] args) {
		System.out.println("(D)");
		int i,j,k;
		for(i = 1; i <= 5 ; i++){
			for(j= 4; j >=i ; j--){
				System.out.print(" ");
			}
			for(k=1; k<=(2*i-1);k++){				
				System.out.print(i);
			}
			System.out.println();
		}
	}
}	
	