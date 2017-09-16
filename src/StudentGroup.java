import java.util.Date;

/**
 * A fix-sized array of students
 * array length should always be equal to the number of stored elements
 * after the element was removed the size of the array should be equal to the number of stored elements
 * after the element was added the size of the array should be equal to the number of stored elements
 * null elements are not allowed to be stored in the array
 * 
 * You may add new methods, fields to this class, but DO NOT RENAME any given class, interface or method
 * DO NOT PUT any classes into packages
 *
 */
public class StudentGroup implements StudentArrayOperation {

	private Student[] students;
	//Arrays.asList(this.students);
	//int l=sizeof(students)/sizeof(student);
	/**
	 * DO NOT remove or change this constructor, it will be used during task check
	 * @param length
	 */
	public StudentGroup(int length) {
		this.students = new Student[length];
	}
	Arrays.asList(this.students);
	@Override
	public Student[] getStudents() {
		// Add your implementation here
		
		
			if(students==null) {
				return null;
			}
			else {
				return students;
			}
			
	}

	@Override
	public void setStudents(Student[] students){
		// Add your implementation here
		
	}

	@Override
	public Student getStudent(int index) {
		// Add your implementation here
		try {
	if(index>=0&&index<=students.length-1)
		if(students[index]==null) {
		return null;
		}
		else 	return students[index];
	}

	}
	@Override
	public void setStudent(Student student, int index) {
		// Add your implementation here
		students[index]=student; 
	}

	@Override
	public void addFirst(Student student) {
		// Add your implementation here
		if(students[0]==null) {
			students[0]=student;
		}
		else {
			
			for(int i=students.length-1;i>=0;i--) {
				students[i+1]=students[i];
			}
			students[0]=student;
		}
	}

	@Override
	public void addLast(Student student) {
		// Add your implementation here
		students[students.length++]=student;
	}

	@Override
	public void add(Student student, int index) {
		
		// Add your implementation here
		if(students[index]==null) {
			students[index]=student;
		}
		else {
			for(int i=students.length-1;i>=index;i--) {
				students[i+1]=students[i];
			}
			students[index]=student;
		}
	}

	@Override
	public void remove(int index) {
		// Add your implementation here
		for(int i=index;i<students.length-1;i--) {
			students[i]=students[i+1];
		}
	}

	@Override
	public void remove(Student student) {
		// Add your implementation here
		int j;
		for(int i=0;i<Students.length-1;i++) {
			if(students[i].compareTo(student)==0) {
				j=i;
				break;
			}
		}
		for(int i=j;i<students.length-1;i++) {
			students[i]=students[i+1];
		}
	}

	@Override
	public void removeFromIndex(int index) {
		// Add your implementation here
		for(int i=index+1;i<students.length-1;i++) {
			students[i]=null;
		}
	}

	@Override
	public void removeFromElement(Student student) {
		// Add your implementation here
		int j;
		for(int i=0;i<Students.length;i++) {
			if(students[i].compareTo(student)==0) {
				j=i;
				break;
			}
		}
		for(int i=j;i<students.length;i++) {
			students[i]=null;
		}
	}

	@Override
	public void removeToIndex(int index) {
		// Add your implementation here 
	}

	@Override
	public void removeToElement(Student student) {
		// Add your implementation here
	}

	@Override
	public void bubbleSort() {
		// Add your implementation here
		int i,j;
		Student s;
		for(i=0;i<students.length;i++) {
			for(j=i+1;i<students.length;j++) {
				if(students[i].compareTo(stdents[j])>0) {
					s=students[i];
					students[i]=students[j];
					students[j]=s;
				}
			}
		}
	}

	@Override
	public Student[] getByBirthDate(Date date) {
		// Add your implementation here
		
		return null;
	}

	@Override
	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getNearBirthDate(Date date, int days) {
		// Add your implementation here
		return null;
	}

	@Override
	public int getCurrentAgeByDate(int indexOfStudent) {
		// Add your implementation here
		return 0;
	}
	

	@Override
	public Student[] getStudentsByAge(int age) {
		// Add your implementation here
		
		return null;
	}

	@Override
	public Student[] getStudentsWithMaxAvgMark() {
		// Add your implementation here
		return null;
	}

	@Override
	public Student getNextStudent(Student student) {
		// Add your implementation here
		//int j;
		for(int i;i<students.length-1;i++) {
			if(students[i].compareTo(student)==0) {
				return students[i+1];
			}
		}
		if(i>=students.length)
			return null;
	}
}
