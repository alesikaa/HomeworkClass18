package HomeworkClass18;

public class JavaTeacher extends Teacher {

    void code(){
        System.out.println("Java teacher teaches how to code");
    }

    public static void main(String[] args) {
        JavaTeacher java=new JavaTeacher();
        java.name="Olesea";
        java.subject="Java";
        java.grade();
        java.attendMeeting();
    }
}
