public class Student extends Person{
  private String neptun;
  private boolean scholarship;


	/**
	* Returns value of neptun
	* @return
	*/
	public String getNeptun() {
		return neptun;
	}

	/**
	* Sets new value of neptun
	* @param
	*/
	public void setNeptun(String neptun) {
		this.neptun = neptun;
	}

	/**
	* Returns value of scholarship
	* @return
	*/
	public boolean isScholarship() {
		return scholarship;
	}

	/**
	* Sets new value of scholarship
	* @param
	*/
	public void setScholarship(boolean scholarship) {
		this.scholarship = scholarship;
	}
}
