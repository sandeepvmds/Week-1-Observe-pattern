
public class Lewis {
	
	public static void main(String[] args)
	{
		Course online = new Course();
		
		Student st1 = new Student("Sandeep");
		Student st2 = new Student("Ramesh");


		online.register(st1);
		online.register(st2);
			
		st1.registerCourse(online);
		st2.registerCourse(online);
		
		online.upload(" Object Oriented Development");
			
	}

}
