package week2.assignments;

public class RemoveDuplicates {

	public static void main(String[] args) {
		String text = "We learn java learn basics as part of java sessions in java week1";

		String[] str = text.split(" ");
		for (int i = 0; i < str.length; i++) {
			for (int j = i + 1; j < str.length; j++) {
				if (str[i].equals(str[j])) {
					str[j] = "";
				}
			}
		}

		for (int j = 0; j < str.length; j++)
			System.out.print(str[j] + " ");

	}
}
