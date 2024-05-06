package agenda;

public class Contacto {
 private int id;
 private String firstName;
 private String lastName;
 private int number;
 private String mail;
 private int row;
 
public Contacto(int id, String firstName, String lastName, int number, String mail, int row) {
	super();
	this.id = id;
	this.firstName = firstName;
	this.lastName = lastName;
	this.number = number;
	this.mail = mail;
	this.row=row;
}

public Contacto(int id, String firstName, String lastName, int number, String mail) {
	super();
	this.id = id;
	this.firstName = firstName;
	this.lastName = lastName;
	this.number = number;
	this.mail = mail;
	this.row=0;
}


public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public int getNumber() {
	return number;
}
public void setNumber(int number) {
	this.number = number;
}
public String getMail() {
	return mail;
}
public void setMail(String mail) {
	this.mail = mail;
}

public int getRow() {
	return row;
}

public void setRow(int row) {
	this.row = row;
}
 
 
}
