package template.finalexam;

public class LazyLarry extends Student {

	public LazyLarry(String name) {
		super(name);
	}

	@Override
	public void arriveAtExam() {
		System.out.println(name + " arrives at the exam 15 minutes late");
	}
}
