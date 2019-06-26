package TestLink;

import java.awt.*;

public class TestLink {

    public static void main(String[] args) {
        Frame F=new Frame("Database Application");
        TextField regno,name,marks;
        Button Btn=new Button("save");
        WindowHandler wevent=new WindowHandler();
        
        regno=new TextField(10);
        name=new TextField(10);
        marks=new TextField(10);
        
        DataEntry e =new DataEntry(regno,name,marks);
        Btn.addActionListener(e);
        
        F.addWindowListener(wevent);
        F.setLayout(   new GridLayout(4,2)  );
        F.add(new Label("Regno"));
        F.add(regno);
        F.add(new Label("name"));
        F.add(name);
        F.add(new Label("marks"));
        F.add(marks);
        F.add(new Label());
        F.add(Btn);
        F.setSize(400,400);
        F.setVisible(true);   
    }
}
