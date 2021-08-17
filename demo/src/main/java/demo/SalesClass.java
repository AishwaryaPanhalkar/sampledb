package demo;

public class SalesClass {
	public void display() {
		int[] arr= {23,45,56,78,80};
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		System.out.println("Array size" +arr.length);
	}
	public void print() {
		System.out.println("Print all array numbers");
		display();
	}
}
