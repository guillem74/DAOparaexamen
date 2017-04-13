import com.sun.org.apache.xpath.internal.SourceTree;

import static org.junit.Assert.*;


public class Test {

    @org.junit.Test
    public void insert(){
        User u = new User(1,"Guillem", "guillem@gmail.com");
        u.insert();
    }

    @org.junit.Test
    public void update(){
        User u = new User(1,"Guillem", "guillem@gmail.com");
        u.setName("Aleix");
        u.update();
    }

    @org.junit.Test
    public void select(){
        User u = new User(1,"Guillem", "guillem@gmail.com");
        u.select(0);
        System.out.println(u.getId()+","+u.getName()+","+u.getMail());
    }

    @org.junit.Test
    public void delete() {
        User u = new User(1, "Guillem", "guillem@gmail.com");
        u.delete();
    }
}