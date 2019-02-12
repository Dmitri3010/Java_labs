public interface Person {
    int LimitYear=1990;
    void SetSurname(String surname);
    void SetName(String name);
    void SetFatherName(String fatherName);
    void SetBirthDay(int yyyy, int mm, int dd);
    String GetSurname();
    String GetName();
    String GetFatherName();
    java.util.Date GetBirthday();
}
