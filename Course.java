import java.util.ArrayList;
import java.util.List;

public class Course implements Subject {
	private List<Student> sts = new ArrayList<>();
	String title;
	
	@Override
	public void register(Student st)
	{
		sts.add(st);
	}
	
	@Override
	public void unRegister(Observer st)
	{
		sts.remove(st);
	}

	@Override
	public void notifyStudents()
	{
		for(Observer st:sts)
		{
			st.update();
		}
	}
	
	@Override
	public void upload(String title)
	{
		this.title= title;
		notifyStudents();
	}
}
