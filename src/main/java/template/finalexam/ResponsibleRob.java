package template.finalexam;

public class ResponsibleRob extends Student {

	public ResponsibleRob(String name) {
		super(name);
	}

	@Override
	public void arriveAtExam() {
		System.out.println(name + " arrives at the exam 15 minutes early");
	}
	@Override
	boolean hasStudiedForExam() {
		return true;
	}
}
