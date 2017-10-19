package com.myscorecard.model.dto;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="users")
public class Users {
	@XmlElement(name="user")
    List<String> users;
    public void init(List<String> list) {
        users=list;
    }
/*\
 * @XmlRootElement(name="employees")
public class Employees {
    @XmlElement(name="employee")
    List<String> employees;
    public void init(List<String> list) {
        employees=list;
    }
 * */
}
