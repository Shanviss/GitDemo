public class CoreJavaBrushUp1 {

	public static void main(String[] args) {

		int mynum = 5;
		String website = "Ruhul Shetty Academy";
		char letter = 'c';
		double dec = 5.99;
		boolean myCard = true;

		System.out.println(mynum + " is the value stored in mynum variable");
		System.out.println(website);
		// Arrays-
		int[] array = new int[5];
		array[0] = 1;
		array[1] = 2;
		array[2] = 3;
		array[3] = 4;
		array[4] = 5;
		System.out.println(array[2]);

		int[] arr2 = { 1, 2, 3, 4, 5, 78, 90, 34, 90, 46, 78, 89 };

		// for loop array.length - 5
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		for (int i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i]);
		}

		String[] name = { "Rahul", "Shetty", "Selenium" };
		for (int i = 0; i < name.length; i++) {
			System.out.println(name[i]);
		}
		for (String s : name) {
			System.out.println(s);
		}

	}
}
