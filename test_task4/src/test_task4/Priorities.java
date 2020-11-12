package test_task4;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

class Priorities {
	public ArrayList<Student> getStudents(List<String> events) {
		int n = events.size();
		PriorityQueue<Student> priorityQueue = new PriorityQueue<Student>();
		for (String i : events) {
			String[] s = new String[4];
			s = i.split("\\s");
			if (s.length <= 1) {
				priorityQueue.poll();
			} else {
				priorityQueue.add(new Student(s[1], Double.valueOf(s[2]), Integer.valueOf(s[3])));
			}
		}
		while (priorityQueue.size() > 1) {
			System.out.println(priorityQueue.poll().name);
		}
		return new ArrayList<Student>(priorityQueue);
	}
}