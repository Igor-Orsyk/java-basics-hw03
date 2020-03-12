public class Student {
  private int rating;
  private String name;
  static int sum_rate, counter;


  public Student(String name) {
    this.name = name;
    counter ++;
  }

  public static double getAvgRating() {
    if(counter != 0){
      return (double) sum_rate / counter;}
    else {
      return 0.0d;}
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getRating() {
    return rating;
  }

  public void setRating(int rating) {
    sum_rate += rating;
    this.rating = rating;
  }

  public boolean betterStudent(Student student) {

    if (this.rating > student.rating) {
      return true;
    } else if (this.rating < student.rating) {
      return false;
    } else {
      return true;}
  }

  public void changeRating(int rating) {
    sum_rate -= this.rating;
    this.rating = rating;
    sum_rate += rating;
  }

  public static void removeStudent(Student student) {
    student = null;
    System.gc();
    sum_rate = 0;
    counter = 0;
  }

  @Override
  public String toString() {
    return "Student name is" + this.name + ". Student rating " + this.rating;
  }
}
