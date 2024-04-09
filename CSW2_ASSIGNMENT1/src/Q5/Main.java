package Q5;

class College {
 private String collegeName;
 private String collegeLoc;

 public College(String collegeName, String collegeLoc) {
     this.collegeName = collegeName;
     this.collegeLoc = collegeLoc;
 }

 public String getCollegeName() {
     return collegeName;
 }

 public String getCollegeLoc() {
     return collegeLoc;
 }
}

class Student {
 private int studentId;
 private String studentName;
 private College college;

 public Student(int studentId, String studentName, College college) {
     this.studentId = studentId;
     this.studentName = studentName;
     this.college = college;
 }

 public void displayStudentInfo() {
     System.out.println("Student ID: " + studentId);
     System.out.println("Student Name: " + studentName);
     System.out.println("College Name: " + college.getCollegeName());
     System.out.println("College Location: " + college.getCollegeLoc());
     System.out.println();
 }
}

public class Main {
 public static void main(String[] args) {
 
     College college1 = new College("ITER", "BBSR");
     College college2 = new College("SVM", "JagatsinghPur");

     Student student1 = new Student(101, "Sourav", college1);
     Student student2 = new Student(102, "Anurag", college2);

     System.out.println("College 1:");
     System.out.println("Name: " + college1.getCollegeName());
     System.out.println("Location: " + college1.getCollegeLoc());
     System.out.println();

     System.out.println("College 2:");
     System.out.println("Name: " + college2.getCollegeName());
     System.out.println("Location: " + college2.getCollegeLoc());
     System.out.println();

     System.out.println("Student 1:");
     student1.displayStudentInfo();

     System.out.println("Student 2:");
     student2.displayStudentInfo();
 }
}

