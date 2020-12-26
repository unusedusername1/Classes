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
  public Assignment() {
    name = "";
    totalPoints = 100;
  }

  /**
   * Method to set the assignment name.
   *
   * @param name The assignment name.
   */
  public void setAssignmentName(String name) { this.name = name; }

  /**
   * Method to set the total points of the assignment.
   *
   * @param totalPoints Total points of the assignment.
   */
  public void setTotalPoints(double totalPoints) {
    this.totalPoints = totalPoints;
  }

  /**
   * Method to set the grade for a student.
   *
   * @param studentID The student's ID.
   * @param grade The student's raw grade.
   */
  public void setRawGrade(int studentID, double grade) {
    grades.put(studentID, grade);
  }

  /**
   * Method to get the assignment name.
   *
   * @return The assignment name.
   */
  public String getAssignmentName() { return name; }

  /**
   * Method to get the total points of the assignment.
   *
   * @return The total points of the assignment.
   */
  public double getTotalPoints() { return totalPoints; }

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
