/**********************************
* Author: Monish Mamilla
* Program: Password Checker
* Version 1.0
* Development Date(s): 2/19/25
***********************************/
package Practice_Assignments;

public class User 
{
	// Declaring instance variables
	int id;
    String firstName;
    String lastName;
    String emailAddress;

    public User(int id, String firstName, String lastName, String emailAddress) 
    {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailAddress = emailAddress;
    }
    // Getting the id
    public int getId() 
    {
        return id;
    }
    // Getting the first name
    public String getFirstName() 
    {
        return firstName;
    }
    // Setting the first name
    public void setFirstName(String firstName) 
    {
        this.firstName = firstName;
    }
    // Getting the last name
    public String getLastName() 
    {
        return lastName;
    }
    // Setting the last name
    public void setLastName(String lastName) 
    {
        this.lastName = lastName;
    }
    // Getting the email address
    public String getEmailAddress() 
    {
        return emailAddress;
    }
    // Setting the email address
    public void setEmailAddress(String emailAddress) 
    {
        this.emailAddress = emailAddress;
    }
    // toString method to return id, first name, and last name
    public String toString() 
    {
        return "User ID: " + id + ", Name: " + firstName + " " + lastName;
    }
}
