package entities;

public class Student implements Comparable <Student> {

	private Integer numberID;

	public Student(Integer numberID) {
		super();
		this.numberID = numberID;
	}

	public Integer getNumberID() {
		return numberID;
	}

	public void setNumberID(Integer numberID) {
		this.numberID = numberID;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((numberID == null) ? 0 : numberID.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (numberID == null) {
			if (other.numberID != null)
				return false;
		} else if (!numberID.equals(other.numberID))
			return false;
		return true;
	}

	@Override
	public int compareTo(Student other) {
		return numberID.compareTo(other.getNumberID());
	}
	
	
	
}
