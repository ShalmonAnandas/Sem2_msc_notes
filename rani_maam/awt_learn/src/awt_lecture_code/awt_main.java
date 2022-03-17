package awt_lecture_code;

import java.awt.*;
import java.awt.event.*;

public class awt_main extends Frame implements ActionListener {
    
    Label l3 = new Label("");
    
    awt_main(){
        FlowLayout f1 = new FlowLayout();
        setLayout(f1);
        
        Label a1 = new Label("Name:");
        TextField t1 = new TextField(4);
        Label a2 = new Label("Password");
        TextField t2 = new TextField(4);
        Button b = new Button("login");
        
        add(a1);
        add(t1);
        add(a2);
        add(t2);
        add(b);
        add(l3);
        
        b.addActionListener(this);
        setVisible(true);
        setSize(500,400);
    }
    
    public void actionPerformed(ActionEvent e){
        l3.setText("SUCCESS");
    }
    
    public static void main(String[] args) {
        awt_main a1 = new awt_main();
    }
}
