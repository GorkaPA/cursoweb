/*
 * Created on 25-abr-2006
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package bookstore.beans;

import java.io.Serializable;
import java.util.Date;

/**
 * @author Administrador
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class User implements Serializable{

	private static final long serialVersionUID = 1L;


	private String user;
	private String password;
	private String name;
	private String secondName;
	private String id;
	private String address;
    private Date birthdate;
    private String email;

	public User(String user, String password, String name, String secondName, String id, String address,
			Date birthdate, String email) {
		super();
		this.user = user;
		this.password = password;
		this.name = name;
		this.secondName = secondName;
		this.id = id;
		this.address = address;
		this.birthdate = birthdate;
		this.email = email;
	}
	/**
	 * 
	 */
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSecondName() {
		return secondName;
	}
	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Date getBirthdate() {
		return birthdate;
	}
	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}
