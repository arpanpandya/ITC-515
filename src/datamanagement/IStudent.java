package datamanagement;

public interface IStudent {
// using the getter and setter method.
    public Integer getID();
// get the first name.
    public String getFirstName();
    public void setFirstName(String firstName);
// Get the last name
    public String getLastName();
    public void setLastName(String lastName);

    public void addUnitRecord( IStudentUnitRecord record );
    public IStudentUnitRecord getUnitRecord( String unitCode );

    public StudentUnitRecordList getUnitRecords();

}
