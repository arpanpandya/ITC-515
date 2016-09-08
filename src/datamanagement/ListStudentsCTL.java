package datamanagement;
        public class ListStudentsCTL {
private StudentManager sm;
public ListStudentsCTL() {sm = StudentManager.get();}
            public void listStudents( IStudentLister lister, String unitCode ) {
    lister.clearStudents();
    //create new object with student name 
                StudentMap students = sm.getStudentsByUnit( unitCode );
for (Integer id : students.keySet() ) lister.addStudent(students.get(id));}}
