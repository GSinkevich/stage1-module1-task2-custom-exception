package com.epam.mjc;
class StudentIllegalArgumentException extends IllegalArgumentException {
  public StudentIllegalArgumentException(String message){
    super(message);
  }
}

public class StudentManager {

  private static final long[] IDs = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};

  public Student find(long studentID) throws  StudentIllegalArgumentException {
    if (Student.getValueOf(studentID) != null){
      return Student.getValueOf(studentID);
    }
    else {
      throw new StudentIllegalArgumentException("Could not find student with ID "+studentID);
    }
  }

  public static void main(String[] args) {
    StudentManager manager = new StudentManager();

      for (int i = 0; i < IDs.length; i++) {
        Student student = manager.find(IDs[i]);
        System.out.println("Student name " + student.getName());
    }
  }
}