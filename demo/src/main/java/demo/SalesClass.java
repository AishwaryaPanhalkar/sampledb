package demo;

public class SalesClass {
	public void display() {
		int[] arr= {23,45,56,78,80};
		int sum=0;
		for(int num: arr) {
			sum+=num;
			System.out.println(num);
		}
		System.out.println("Sumation="+sum);
	}
	public void print() {
		System.out.println("Print all array numbers");
		display();
	}
}
