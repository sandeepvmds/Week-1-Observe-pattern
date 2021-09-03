
public interface Subject {

	void register(Student st);

	void unRegister(Observer st);

	void notifyStudents();

	void upload(String title);

}