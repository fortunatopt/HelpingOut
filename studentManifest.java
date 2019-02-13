import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.Collections;

class studentManifest {
	
	public static void main(String[] args) {
		// Asking size of class, then converting string input to integer value.
		String numberUI = JOptionPane.showInputDialog("How many students are in your class?");
		int number = Integer.parseInt(numberUI);
		// print the number of students to be entered (for testing)
		System.out.println("You will be entering " + number + " student(s).");
		// Enter student names into ArrayList.
		JOptionPane.showMessageDialog(null, "Please enter student names.");
		// Create ArrayList for the students
		ArrayList<String> studentManifest = new ArrayList<String>();
		// Begin loop
		for (int i = 0; i < number; i++) {
			// Add each entered student into the ArrayList
			studentManifest.add(JOptionPane.showInputDialog("Name(Last, first) " + (i)));
		}
		// Print one per line (for testing)
		for (int i = 0; i < number; i++) {
			System.out.println("Student " + i + ": " + studentManifest.get(i));
		}
		// Output the student ArrayList to the window
		System.out.println(studentManifest);

		// More testing
		Collections.sort(studentManifest);  // Sort studentManifest
		for (String s : studentManifest) {
			System.out.println("Sorted Student: " + s);
		}
	}	
}
