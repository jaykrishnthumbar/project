import java.lang.management.OperatingSystemMXBean;

import com.school.Principle;
import com.school.SchoolRulesFactory;
import com.school.Student;
import com.school.Teachers;

public class FactoryMain {

	public static void main(String[] args) {

		SchoolRulesFactory scr = new SchoolRulesFactory();
			Student st = scr.getInstance("Help");
		st.stu();
	}

}
