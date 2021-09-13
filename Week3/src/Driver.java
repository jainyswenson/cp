import java.io.FileNotFoundException;
import java.io.IOException;

public class Driver
{
    public static void main(String[] args) throws FileNotFoundException, IOException {
        
    	Person instructor = new Person("Anindya", "Maiti");
    	Course CS2334_020 = new Course(2334, instructor, "studentlist.txt");
    	//Course CS2334_020 = new Course();
		
		CS2334_020.printCourseDetails();
    	
    }
}
