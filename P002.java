public class E2{
	public static void main(String[] args){
		int fibResult = 0;
		int evenSum = 0;
		for(int i = 0; fibResult < 4000000; i++){
			fibResult = fibonacci(i);
			if(fibResult < 4000000){
				if(fibResult % 2 == 0){
					evenSum += fibResult;
					System.out.println(evenSum);
				}
				
			}
		}
	}

	public static int fibonacci(int n){
		if (n == 0) {
			return 0;
		}
		else if (n==1) {
			return 1;
		}
		else { 
			return fibonacci(n-1) + fibonacci(n-2);
		}

	}
}