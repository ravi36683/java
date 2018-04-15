
public class Patern {

	public static void main(String[] args) {
		int i,j;
		
		
		for( i=1;i <= 6;i++){
			for(j=1;j<=i;j++){
				System.out.print(j);
			}
			System.out.print("\n");
		}
		
		
		for( i=1;i <= 3;i++){
			int alpha=65;
			for(j=1;j<=i;j++){
				System.out.print((char)alpha);
				alpha++;
			}
			System.out.print("\n");
		}
		
		
		for( i=1;i <= 4;i++){
			for(j=1;j<=4;j++){
				if(i==1||i==4||j==1||j==4)
				System.out.print("$");
				else
					System.out.print(" ");
			}
			System.out.print("\n");
		}

	}

}
