class InitArray{
	public static void main(String args[]){
		int[] arr = new int[10];
		int[] arr2 = {5,6,6,5,3,3,2,1};
		
		for(int index = 0; index < arr.length; index++){
			System.out.printf("%5d%8d%n", index, arr[index]);
		}
	}
}