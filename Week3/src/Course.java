import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Course
{
	private int courseNumber;	
	private Person instructor;
	private ArrayList<Person>  students;

	public Course()
	{
		students = new ArrayList<Person>();
		this.courseNumber = 0000;
		this.instructor = new Person();
	}

	public Course(int courseNumber, Person instructor, String filename) throws FileNotFoundException, IOException {
		this();
		this.courseNumber = courseNumber;
		this.instructor = instructor;

		// File handling
		File filePath = new File(filename);
		//System.out.print(filePath.getAbsolutePath() + "\n");	
		try (BufferedReader br = new BufferedReader(new FileReader(filePath.getAbsolutePath()))) {
			String line;
			while ((line = br.readLine()) != null) {
				// Add each student (a Person) line by line.
				String[] firstAndLast = line.split(", ");
				Person student = new Person(firstAndLast[1], firstAndLast[0]);
				students.add(student);
			}
		}
	}

	public void printCourseDetails() {
		System.out.println("Course number: " + courseNumber);
		System.out.println("Instructor: " + instructor);
		System.out.println("Students enrolled: " + students);
	}

}
