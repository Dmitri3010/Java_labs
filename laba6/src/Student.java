public interface Student extends Person {
    void SetFirstDate(java.util.Date d);
    java.util.Date GetFirstDate();
    void SetUniversity(String u);
    String GetUniversity();
    int LimitUniversityLength = 16;
}
