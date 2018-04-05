import java.util.Date;

public class Person{
    private String name;
    private String surname;
    private Date birthday;

  public Person(){
    name = "Terry";
  }

  public Person (String name, String surname){
      this.name=name;
      this.surname=surname;
  }
	/**
	* Returns value of name
	* @return
	*/
	public String getName() {
		return name;
	}

	/**
	* Sets new value of name
	* @param
	*/
	public void setName(String name) {
		this.name = name;
	}

	/**
	* Returns value of surname
	* @return
	*/
	public String getSurname() {
		return surname;
	}

	/**
	* Sets new value of surname
	* @param
	*/
	public void setSurname(String surname) {
		this.surname = surname;
	}

	/**
	* Returns value of birthday
	* @return
	*/
	public Date getBirthday() {
		return birthday;
	}

	/**
	* Sets new value of birthday
	* @param
	*/
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

}
