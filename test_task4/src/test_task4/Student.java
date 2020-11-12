package test_task4;

class Student implements Comparable<Student> {

	String name = new String();
	double cgpa;
	int id;

	public Student(String name, double cgpa, int id) {
		this.name = name;
		this.cgpa = cgpa;
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public double getCgpa() {
		return cgpa;
	}

	public int getId() {
		return id;
	}

	public int compareTo(Student s) {
		if (cgpa == s.cgpa) {
			if (name.compareTo(s.name) == 0) {
				if (id == s.id)
					return 0;
				else if (id > s.id)
					return 1;
				else
					return -1;
			} else
				return name.compareTo(s.name);
		} else if (cgpa > s.cgpa)
			return -1;
		else
			return 1;
	}

}