package kin;

import java.util.Arrays;

public class S606 {

	public static void main(String[] args) {
		char[] input = new char[] { ' ', ' ', 'A', 'b', ' ', ' ', 'C', ' ' };
		char[] output = trim(input);
		System.out.println(Arrays.toString(output));

	}

	public static char[] trim(char[] input) {
		for (int i = 0, j = input.length; i <= j; i++, j--) {
			if (input[i] != ' ' && input[j] != ' ') {
				// System.out.println(i+"\t"+j);
			}

		}

		char[] output = new char[input.length - (input.length - 7) - 2];

		for (int i = 0; i < output.length; i++) {
			// System.out.println(i);
			output[i] = input[i + 2];
		}
		return output;
	}
}
