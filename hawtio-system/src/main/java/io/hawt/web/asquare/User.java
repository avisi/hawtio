package io.hawt.web.asquare;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

//Below annotation defines root element of XML file
@XmlRootElement
public class User {

	private String userName;
		  
	private ArrayList<Connection> listOfConnections;
	public User() {
		
	}
	public String getUserName() {
		return userName;
	}
	@XmlElement
	public void setUserName(String userName) {
		this.userName = userName;
	}

	
	public ArrayList<Connection> getListOfConnections() {
		return listOfConnections;
	}
	
	// XmLElementWrapper generates a wrapper element around XML representation
	  @XmlElementWrapper(name = "connectionList")
	 // XmlElement sets the name of the entities in collection
	  @XmlElement(name = "connections")
	public void setListOfConnections(ArrayList<Connection> listOfConnections) {
		this.listOfConnections = listOfConnections;
	}
	
}
