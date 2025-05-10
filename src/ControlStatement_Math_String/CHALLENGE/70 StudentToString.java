package ControlStatement_Math_String.CHALLENGE;

 class StudentToString {
  String name;
  int age;
  String rollNumber;
  String house;

  public StudentToString(String name, int age, String rollNumber, String house) {
   this.name = name;
   this.age = age;
   this.rollNumber = rollNumber;
   this.house = house;
  }

  @Override
  public String toString() {
   return "Student Detail:{name: "+name+
           ", age: "+age+
           ", roll number: " +rollNumber+
           ",house: "+house+" }";
  }

  public static void main(String[] args) {
   StudentToString stu = new StudentToString("Ankit",18,
                                              "246003","Bihar");
   System.out.println(stu);
  }
 }
