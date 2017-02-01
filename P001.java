public class E1{
	public static void main(String[] args){

		int sum = 0;
		int max = 1000;

		for(int i = 0; i < max; i++){
			if(i % 3 == 0 || i % 5 == 0){
				sum += i;
				System.out.println(sum);
			}
		}
	}
}