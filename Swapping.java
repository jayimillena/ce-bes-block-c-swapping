public class Swapping 
{
  public static void main(String[] args)
  {
    String first_student = "John";
    String second_student = "Mark";
    String third_student = "Rocky";

    System.out.println("The original students are "+ first_student +", " + second_student +", and "+ third_student);
    
    String temp = first_student;
    first_student = third_student;

    System.out.println("The newly swapped students are "+ first_student +", " + second_student +", and "+ third_student);
  }
}