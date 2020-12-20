import java.util.HashMap;

/**
 * Assignment class creates an object storing grades and student IDs.
 *
 * @author Jonathan Gai
 */
public class Assignment {
  private HashMap<Integer, Double> grades = new HashMap<>();
  private String name;
  private double totalPoints;

  /**
   * Constructor for Assignment class.
   *
   * @param name The name of the assignment.
   * @param totalPoints The total points in the assignment.
   */
  public Assignment(String name, double totalPoints) {
    this.name = name;
    this.totalPoints = totalPoints;
  }

  /**
   * No-arg contructor for Assignment class.
   */
  public Assignment() {}

  /**
   * Method to set the grade for a student
   *
   * @param studentID The student's ID.
   * @param grade The student's raw grade.
   */
  public void setRawGrade(int studentID, double grade) {
    grades.put(studentID, grade);
  }

  /**
   * Method to get the student's raw grade.
   *
   * @param studentID The student's ID.
   * @return double The student's raw grade.<br>
   *         -1     if no raw grade found.
   */
  public double getRawGrade(int studentID) {
    Double grade = grades.get(studentID);
    if (grade == null) {
      return -1;
    }
    return grade;
  }

  /**
   * Method to get the student's grade out of 100.
   *
   * @param studentID The student's ID.
   * @return double The student's grade out of 100.<br>
   *         -1     if no grade found.
   */
  public double getPercentageGrade(int studentID) {
    Double grade = grades.get(studentID);
    if (grade == null) {
      return -1;
    }
    return grade / totalPoints * 100;
  }
}
