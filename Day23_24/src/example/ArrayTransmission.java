package example;
//배열 선언 후 배열을 출력할 수 있는 메서드 정의
public class ArrayTransmission {
	int[] array;
	
	
	
	private static int[] getData(){
		int[] testdata = new int[] {10,20,30,40,50};
		return testdata;

	}
	public void printData(int[] array){
		
		
		for(int i=0;i<=array.length;i++) {
			System.out.println(array[i]);
		}
	}

}
//