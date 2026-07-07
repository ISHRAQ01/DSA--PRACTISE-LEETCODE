public class StaticKeyword{
    public static void main(String[] args){
    Student s1=new Student();
    s1.schoolName="RD ENG";
    s1.getSchoolName();
    Student s2=new Student();
    s2.getSchoolName();
    s2.getName();

    }
}

class Student{
    static String schoolName;
    public int roll;
    public String name;

    void setName(){
        this.name=name;
    }
    void getName(){
        System.out.println(name);
    }
   void getSchoolName(){
    System.out.println(schoolName);
   }
}