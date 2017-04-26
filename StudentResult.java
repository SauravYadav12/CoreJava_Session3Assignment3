class Student
{
	int marks[], size;
	String[] name; 
	String result;
	
	public void AssignName()
	{
		System.out.println("Enter Size of Class :" );
		size = Integer.parseInt(System.console().readLine());
		name = new String[size];
		marks = new int[size];
		for(int i=0; i < name.length ;i++)
		{
			System.out.println(" Enter name of Student " + (i+1) + ":");
			name[i] = System.console().readLine();			
		}
		System.out.println("Students Name Successfully Entered." +"\n" + "================================");
	}
	
	public void AssignMarks()
	{
		
		for(int i=0; i < marks.length ;i++)
		{
			System.out.println(" Enter marks of Student " + name[i] + ":");
			marks[i] = Integer.parseInt(System.console().readLine());			
		}
		System.out.println("Marks of Students Successfully Entered." +"\n" + "================================");
	}
	
	public void calculateResult()
	{
		for(int j=0; j <= size-1 ; j++)
		{
			if (marks[j] >= 33 && marks[j]<= 100)
					System.out.println(" Result of "+ name [j] + " is QUALIFIED.");
				else
					System.out.println(" Result of "+ name [j] + " is DISQUALIFIED.");
		}
		System.out.println("==========================="+ "\n" + "Thank You for using Student Result Processing System.");
	}
}

class StudentResult
{
	public static void main(String[] args)
	{
		
	Student s1 = new Student();
	s1.AssignName();
	s1.AssignMarks();
	s1.calculateResult();
	
	}
}