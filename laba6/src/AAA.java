import java.util.Calendar;
import java.util.Date;

public class AAA implements Student {
private String name;
private String soname;
private String fatherName;
private String university;
private java.util.Date birthday;
private java.util.Date firstDate;


    public void SetName(String name) {
        this.name=name;
    }

    public void SetSurname(String soname) {
        this.soname = soname;
    }

    public void SetFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    @Override
    public void SetFirstDate(Date d) {
        this.firstDate=d;
    }

    @Override
    public void SetUniversity(String u) {
        if(u.length()<=this.LimitUniversityLength) {
            this.university = u;
        }
    }


    @Override
    public void SetBirthDay(int yyyy, int mm, int dd) {
        if (this.LimitYear<= yyyy){
                this.birthday = new java.util.Date(yyyy, mm, dd);
                }
        }


    @Override
    public Date GetFirstDate() {
        return firstDate;
    }

    @Override
    public String GetUniversity() {
        return university;
    }

    @Override
    public String GetName() {
        return this.name;
    }

    @Override
    public String GetSurname() {
        return this.soname;
    }

    @Override
    public String GetFatherName() {
        return this.fatherName;
    }

    @Override
    public Date GetBirthday() {
        return this.birthday;
    }


}
