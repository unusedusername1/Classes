
/**
 * Assignment class creates an object teacher information.
 *
 * @author Wes G, framework created by Jonathan Gai
 */
import java.util.ArrayList;
import java.util.Scanner;

public class Teacher {
  private int id;
  private String name;
  private String contact;
  private ArrayList<Classes> teachClasses = new ArrayList<Classes>();

  /**
   * Constructor for Teacher class.
   *
   * @param id The school id of the teacher.
   * @param name The name of the teacher.
   * @param contact The phone number of the teacher.
   */
  public Teacher(int id, String name, String contact) {
    this.id = id;
    this.name = name;
    this.contact = contact;
  }

  /**
   * No-arg contructor for Teacher class.
   */
  public Teacher() {
    id = 0;
    name = "";
    contact = "";
  }

  /**
   * Method to set the teacher's name.
   *
   * @param name The teacher's name.
   */
  public void setTeacherName(String name) { this.name = name; }

  /**
   * Method to set the id of the teacher.
   *
   * @param id teacher's id.
   */
  public void setId(int id) {
    this.id = id;
  }

  /**
   * Method to set the contact of the teacher.
   *
   * @param contact The teacher's contact information
   */
  public void setRawGrade(String contact) {
   this.contact = contact;
  }

  /**
   * Method to get the teacher's name.
   *
   * @return The teacher's name.
   */
  public String getTeacherName() { return name; }

  /**
   * Method to get the teacher's id.
   *
   * @return The teacher's id.
   */
  public double getTeacherId() { return id; }

  /**
   * Method to get the Teacher's contact.
   *
   * @return The teacher's contact.
   */
  public String getTeacherContact() { return contact; }
  
  /**
   * Method to add a class
   *
   * @param The name of the class
   */
  public void addClass(String className) {
    teachClass.add(className);
  }
  
  /**
   * Method to remove a class
   *
   * @param The name of the class
   */
  public void removeClass(String className) {
    teachClass.remove(className);
  }

///////////////////////////////////////////////////

/* to do
 * fix remove class method
 * list classes
 * to string method
 * 
 */
 
  }
}
