import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

// SetAnalyzerTester class
public class SetAnalyzerTester {
    // Main method
    public static void main(String[] args) throws FileNotFoundException {
        // Scanner object
        Scanner in = new Scanner(System.in);

        // Asking the user to choose what type of data to be analyzed
        System.out.println("Will you be analyzing Strings or Integers?");
        String Choice = in.nextLine();
        // Entering File paths
        System.out.print("Enter file name: ");
        String firstFile = in.nextLine();
        System.out.print("Enter the second file name: ");
        String secondFile = in.nextLine();

        // If condition to follow the condition, based on the choice provided by user.
        if(Choice.equals("Integer")) {

            // ArrayList with input data from two files
            ArrayList<Integer> List1 = new ArrayList<Integer>();
            ArrayList<Integer> List2 = new ArrayList<Integer>();

            // opens the first file
            File fileName = new File(firstFile);
            in = new Scanner(fileName);

            // while loop for reading the first file
            while(in.hasNextInt()) { List1.add(in.nextInt()); }

            // opens the second file
            fileName = new File(secondFile);
            in = new Scanner(fileName);

            // while loop for reading the second file
            while(in.hasNextInt()) { List2.add(in.nextInt()); }

            // SetAnalyzer object
            SetAnalyzer Result = new SetAnalyzer();
            System.out.println("Intersection:");
            // Running the intersection method
            System.out.println(Result.intersection(List1, List2));
            System.out.println();
            System.out.println("Union:");
            // Running the Union method
            System.out.println(Result.union(List1, List2));
        } else {
            // ArrayList with input data from two files
            ArrayList<String> List3 = new ArrayList<String>();
            ArrayList<String> List4 = new ArrayList<String>();

            // opens the first file
            File fileName = new File(firstFile);
            in = new Scanner(fileName);

            // while loop for reading the first file
            while(in.hasNextLine()) { List3.add(in.nextLine()); }

            // opens the second file
            fileName = new File(secondFile);
            in = new Scanner(fileName);

            // while loop for reading the second file
            while(in.hasNextLine()) { List4.add(in.nextLine()); }

            // SetAnalyzer object
            SetAnalyzer Result = new SetAnalyzer();
            System.out.println("Intersection:");
            // Running the intersection method
            System.out.println(Result.intersection(List3, List4));
            System.out.println();
            System.out.println("Union:");
            // Running the union method
            System.out.println(Result.union(List3, List4));
        }
    }
}