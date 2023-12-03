import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CoreJavaBrushUp2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr2 = { 1, 2, 3, 4, 5, 78, 90, 34, 90, 46, 78, 89 };
		// 2,4,78,90,46,78
		// check if array has multiple of 2

		for (int i = 0; i < arr2.length; i++) {
			if (arr2[i] % 2 == 0) {
				System.out.println(arr2[i]);
				break;
			} else {
				System.out.println(arr2[i] + " is not multiple of 2");
			}
		}

		ArrayList<String> a = new ArrayList<String>();
		a.add("Ruhul");
		a.add("Shetty");
		a.add("Academy");
		a.add("Selenium");
		// a.remove(2);
		System.out.println(a.get(3));

		for (int i = 0; i < a.size(); i++) {
			System.out.println(a.get(i));
		}
		System.out.println("**********");
		for (String var : a) {
			System.out.println(var);
		}

		// item is reprent in ArrayList
		System.out.println(a.contains("Selenium"));
		String[] name = { "Rahul", "Shetty", "Selenium" };
		List<String> nameArrayList = Arrays.asList(name);
		nameArrayList.contains("Selenium");

		// create object of the class - object.class

	}

}
