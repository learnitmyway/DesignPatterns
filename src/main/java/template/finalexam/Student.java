package template.finalexam;

// The template method patter contains a set of of steps,
// some of which can be overridden by subclasses.
// The structure remains the same.
public abstract class Student {
	String name;
	
	public Student(String name) {
		this.name = name;
	}

	public void completeClass() {
		arriveAtExam();
		takeFinalExam();
		receiveResult();
	}
	
	public abstract void arriveAtExam();

	public void takeFinalExam() {
		System.out.println(name + " takes the final exam");
	}

	public final void receiveResult() {
		String result = "";
		if (hasStudiedForExam()) {
			result = "passed";
		} else {
			result = "failed";
		}
		System.out.println(name + " " + result + " the exam." );
	}
	
	// This is a hook, as sub classes may override this
	boolean hasStudiedForExam() {
		return false;
	}
}
