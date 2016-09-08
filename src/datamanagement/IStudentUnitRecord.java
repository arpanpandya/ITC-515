package datamanagement;

public interface IStudentUnitRecord {
// using the getter and setter method for getting the student id and student marks.
    public Integer getStudentID();
    public String getUnitCode();

    public void setAsg1(float mark);
    public float getAsg1();

    public void setAsg2(float mark);
    public float getAsg2();

    public void setExam(float mark);
    public float getExam();
// get the total marks.
    public float getTotal();
}
