
public class OOPS{
    public static void main(String[ ] args){
        Student s1=new Student();
        s1.name="ISHRAQ";
        s1.roll=1234;
        s1.marks[0]=100;
        s1.marks[1]=90;
        s1.marks[2]=80;
        System.out.println(s1.getname());
        System.out.println(s1.getroll());
        Student s2=new Student(s1);
        System.out.println(s2.getroll());
        s1.marks[2]=90;
        for(int i=0;i<3;i++){
            System.out.println(s2.marks[i]);
        }


    }
}

class Student{
    public String name;
    public int roll;
    public int[] marks;

    Student(){
        System.out.println("constructor called");
        marks=new int[3];
    }
    Student(Student s1){
        this.marks=new int[3];
        this.name=s1.name;
        this.roll=s1.roll;
        for(int i=0;i<marks.length;i++){
            this.marks[i]=s1.marks[i]; 
        }
    }

    String getname(){
        return this.name;
    }
    int getroll(){
        return this.roll;
    }

}