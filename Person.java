import java.util.*;
abstract class Person {
    public String firstName;
    public String lastName;
    private GregorianCalendar dateOfBirth;
    public String gender;
    public boolean isMarried;
    protected String aadharNo;
    protected String panNo;

public void setDOB(GregorianCalendar dob){
    dateOfBirth=dob;
}
public GregorianCalendar getDOB(){
    return dateOfBirth;
}
public void changeMarritalStatus(boolean m){
    isMarried=m;
}
abstract public void exercise(int calories);
abstract public void work();
}