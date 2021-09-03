
public class Student implements Observer {

	private String name;
	private Course course = new Course();
	
	
	
	public Student(String name) {
		super();
		this.name = name;
	}

	@Override
	public void update()
	{
		System.out.println( "Hello "+ name + ", class uploaded for course" + course.title);
	}
	
	@Override
	public void registerCourse(Course co)
	{
		course = co;
	}
}
