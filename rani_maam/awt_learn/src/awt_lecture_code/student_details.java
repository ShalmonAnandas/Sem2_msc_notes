package awt_lecture_code;

import java.awt.*;

public class student_details extends Frame {
    student_details(){
        FlowLayout f1 = new FlowLayout();
        setLayout(f1);
        Label l1 = new Label("Student Name:");
        Label l2 = new Label("Phone Number:");
        Label l3 = new Label("Age:");
        Label heading = new Label("Student Registration");
        TextField t1 = new TextField(5);
        TextField t2 = new TextField(5);
        TextField t3 = new TextField(5);
        Button b1 = new Button("Register");
        add(heading);
        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(l3);
        add(t3);
        add(b1);
        setVisible(true);
        setSize(500,400);
    }
    public static void main(String[] args){
        student_details sd1 = new student_details();
    }
}
