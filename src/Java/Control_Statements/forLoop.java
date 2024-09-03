package Java.Control_Statements;

public class forLoop {

	public static void main(String[] args) {
		//int i=1;
		for( int i=1; i<=9;i++) {
			for (int k=9 ; k>=i; k--){
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
			System.out.print("*"+" ");
			}
			System.out.println();
			//i = i+1;
		}

	}

}
