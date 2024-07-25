import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CoreJavaBrushup2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] arr= {1,2,4,5,6,7,8,9,10,122};
		//for (int i=0; i<arr.length; i++)
		//{
			//if (arr[i]%2==0) {
				//System.out.println(arr[i]);
				//break;
			//}
			//else {
				//System.out.println(arr[i]+ "is not multiple of 2");
			//}
		//}
		ArrayList <Integer> a= new ArrayList<Integer>();
		a.add(78);
		a.add(87);
		a.add(95);
		a.add(10);
		System.out.println(a.get(2));
		for (int i=0; i<a.size();i++) {
			System.out.println(a.get(i));
		}
		
		System.out.println("****");
		for (Integer val :a) {
			System.out.println(val);
		}
		Integer[] arr= {1,2,4,5,6,7,8,9,10,122};
		List<Integer>arrArrayList= Arrays.asList(arr);
		System.out.println(arrArrayList.contains(122));
		
	}

}
