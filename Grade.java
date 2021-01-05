/** 
* Class Grade to hold a single grade with an ID. The grade id should be the same for each student
* 
* @author Kevin Xiao
*/

public class Grade{
  private int id;
  private float totalpoints;
  private float points;



  public Grade(int initId, int totpt , int givpt){
    id = initId;
    totalpoints = totpt;
    points = givpt;
  }
  public Grade(int initId){
    id = initId;
    totalpoints = 0;
    points = 0;
  }
  //methods
  public float getPoints(){return this.points;}
  public void setPoints(float num){this.points = num;}

  public float getTotal(){return this.totalpoints;}
  public void setTotal(float num){this.totalpoints = num;}

  public int getId(){return this.id;}
  public void setId(int num){this.id = num;}
}
