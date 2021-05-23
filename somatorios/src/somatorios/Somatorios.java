package somatorios;

public class Somatorios {

	public static void main(String[] args) {
		
		
		float x = 1;
		float n = 50;
		float soma = 0f;
		
		somatorio(x,n,soma);
		
	}
	
	public static void somatorio(float x, float n, float soma) {
		if(x<=n) {
		soma = soma + 1/x;
			if(x<n) {
				System.out.println("1/"+(int)x+" +");
			}else if(x==n) {
				System.out.println("1/"+(int)x);
				System.out.print("_____________");
			}
		x++;
		somatorio(x,n,soma);
		}else {
		System.out.println("= "+soma);
		}	
	}

}
