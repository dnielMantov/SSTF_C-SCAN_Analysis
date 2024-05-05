package src.utils;

import java.util.ArrayList;

public class Utils {
    
	public static void formatReturn(int seekDistance, ArrayList<Integer> seekSequence) {
		System.out.println("Total distance traveled:");
		System.out.println(seekDistance);

		StringBuilder sequence = new StringBuilder();
		for (int i = 0; i < seekSequence.size(); i++) {
			if (i == seekSequence.size() - 1)
				sequence.append(seekSequence.get(i));
			else {
				sequence.append(seekSequence.get(i));
				sequence.append(" -> ");
			}
		}
		System.out.println("Seek Sequence:");
		System.out.println(sequence);
	}

    public static ArrayList<Integer> toArrayInteger(int[] request) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int j : request) {
            arr.add(j);
        }
        return arr;
    }

}
