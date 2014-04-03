package io.hawt.web.asquare;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;

//Below annotation defines root element of XML file
@XmlRootElement
public class Users {


	private ArrayList<User> listOfUsers;

	public ArrayList<User> getListOfUsers() {
		return listOfUsers;
	}
	
	// XmLElementWrapper generates a wrapper element around XML representation
	  @XmlElementWrapper(name = "userList")
	 // XmlElement sets the name of the entities in collection
	  @XmlElement(name = "user")
	public void setListOfUsers(ArrayList<User> listOfUsers) {
		this.listOfUsers = listOfUsers;
	}
	
}
