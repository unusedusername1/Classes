/** 
* Class StudenGrades creates and manages an arraylist of Grades for one student 
* 
* @author kevin xiao
*/

import java.util.ArrayList;

public class StudentGrades{
  private ArrayList<Grade> grades;

  private int studentId;

  //usually wont use this OL -- requires a list of grades
  public StudentGrades(int sId, ArrayList<Grade> gradeList){
    studentId = sId;

    grades = gradeList;
  }

  public StudentGrades(int sId){
    studentId = sId;

    grades = new ArrayList<Grade>();
  }

  //methods

  //implement a search method when assignment class is completed -- search assignment by string
  //design the ui in a way that the id's are for the system's use for the most part and that the user will almost never need to enter ids


  public float getGrades(){
    float c = 0; //numerator sum
    float d = 0; //denominator sum
    //divide to get a percentage
    if(this.grades.size() < 1) return -1;

    for(Grade g: this.grades){
      c += g.getPoints();
    }
    for(Grade g: this.grades){
      d += g.getTotal();
    }
    if(d==0) return -1;
    return (c/d)*100;
  }


  public int getId(){
    return this.studentId;
  }

  public void setId(int newId){
    this.studentId = newId;
  }

  //called on automatically when a new assignment is created
  public void addGrade(int initId){
    this.grades.add(new Grade(initId));
  }


  public void remGrade(int searchId){
    boolean found = false;
    for(int i = 0; i < this.grades.size(); i++){
      if(this.grades.get(i).getId() == searchId){
        found = true;
        this.grades.remove(i);
      }
    }
  }


  public void setGrade(int searchId, float pts, float totalpts){
    boolean found = false;
    for(Grade g: this.grades){
      if(g.getId() == searchId){
        g.setPoints(pts);
        g.setTotal(totalpts);
        found = true;
      }
      //if(!found) System.out.println("assignment does not exist");
    }
  }

}
