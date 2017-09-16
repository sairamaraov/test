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
	
	/**
	 * DO NOT remove or change this constructor, it will be used during task check
	 * @param length
	 */
	public StudentGroup(int length) {
		this.students = new Student[length];
	}

	@Override
	public Student[] getStudents() {
		// Add your implementation here
		return this.students;
	}

	@Override
	public void setStudents(Student[] students) {
		this.students = students;  // Add your implementation here
	}

	@Override
	public Student getStudent(int index) {

		if(index<0 || index >= students.length)
		throw new IllegalArgumentException("invalid index");
	else

		return students[index];
	}

	@Override
	public void setStudent(Student student, int index) {
		
		if(student == null || index<0 || index >= students.length)
		throw new IllegalArgumentException("invalid index");
		else
		{
			students[index] = student;
		}
		// Add your implementation here
	}

	@Override
	public void addFirst(Student student) 
	{
		if (student==null) {
			throw new IllegalArgumentException("invalid data");

	
					}
		else
		{

			for(int i = students.length;i>0;i--)
				{

					students[i] =students[i-1];

				}
			students[0] = student;

		}

		// Add your implementation here
}

	@Override
	public void addLast(Student student) {
		if (student==null) {
			throw new IllegalArgumentException("invalid data");

	
					}
		else
		{

		students[students.length]=student;
		// Add your implementation here
		}

	}

	@Override
	public void add(Student student, int index) {
		if(student == null || index<0 || index >= students.length)
		throw new IllegalArgumentException("invalid arguments");
		else
		{

			for(int i = students.length;i>index;i--)
				{

					students[i] =students[i-1];

				}
			students[index] = student;



		}
		// Add your implementation here
	}

	@Override
	public void remove(int index) {

if( index<0 || index >= students.length)
		throw new IllegalArgumentException("invalid arguments");
		else
		{

			for(int i = index; i<students.length-1; i++)
				{

					students[i] =students[i+1];

				}
			students[i+1] = null;



		}

		// Add your implementation here
	}

	@Override
	public void remove(Student student) {
		
		if(student==null)
			throw new IllegalArgumentException("invalid parameter");
		else
		{
		
			int index=-1;
			for(int i=0;i<students.length-1;i++)
			{
			if(students[i]==student)
				{
					index = i;
					break;
				}
		}
		if(index==-1)
			throw new IllegalArgumentException("do not exists");
		else
			{
		
			remove(index);
			}
		
	}

	}
	
	@Override
	public void removeFromIndex(int index) {
		// Add your implementation here
	}

	@Override
	public void removeFromElement(Student student) {
		// Add your implementation here
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
		for (int a = 1; a < students.length; a++) {
        for (int b = 0; b < students.length - a; b++) {
            if (((students[b].getFullName()).compareTo((students[b + 1].getFullName()))) > 0) {
                
                Student temp = students[b];
                students[b] = students[b + 1];
                students[b + 1] = temp;
            }
        }
    }
		
		// Add your implementation here
	}

	@Override
	public Student[] getByBirthDate(Date date) {
		
		if(date==null)
			throw new IllegalArgumentException("invalid arguments");
		else
		{
		
		Student[] stu= new Student[students.length];
		int j=-1,flag=0;// Add your implementation here
		for(int i=0;i<students.length;i++)
		{
			
			if(students[i].getDateOfBirth() == date)
			{
				++j;
				stu[j]=students[i];
			}
			
		}
		
		if(j==-1)
		{
		throw new IllegalArgumentException("not found in the array");
		}
		else
			
		return stu;
		}
	}

	@Override
	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) {
		
		if( firstDate==null || lastDate==null )
			throw new IllegalArgumentException("invalid arguments");
		else
		{
		
		Student[] stu= new Student[students.length];
		int j=-1,flag=0;// Add your implementation here
		for(int i=0;i<students.length;i++)
		{
			
			if(students[i].getDateOfBirth() > firstDate &&  students[i].getDateOfBirth() < lastDate )
			{
				++j;
				stu[j]=students[i];
			}
			
		}
		
		if(j==-1)
		{
		throw new IllegalArgumentException("not found in the array");
		}
		else
			
		return stu;
		}
		
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
		
		if(student==null)
			throw new IllegalArgumentException("invalid parameter");
		else
		{
		
		int flag=0;
		for(int i=0;i<students.length-1;i++)
		{
			if(students[i]==student)
			{
				flag=1;
				return students[i+1];
			}
		}
		if(flag==0)
			throw new IllegalArgumentException("do not exists");
			
			
		}	// Add your implementation here
		
	}
 }
