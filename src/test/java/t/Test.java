package t;

import com.sun.tools.classfile.Dependency;

public class Test {
    @org.junit.Test
    public void t1() throws Exception
    {
        Class<Entity> c1= (Class<Entity>) Class.forName("t.Entity");
        System.out.println("--------------------");
    }

    @org.junit.Test
    public void t2() throws Exception
    {
        Class<Entity> c2 = Entity.class;

        System.out.println("--------------------");
    }

    @org.junit.Test
    public void t3() throws Exception
    {
        Entity entity = new Entity();
        Class<Entity> c3 = (Class<Entity>) entity.getClass();

        System.out.println("--------------------");
    }

    @org.junit.Test
    public void t() throws Exception
    {
        Class<Entity> c1= (Class<Entity>) Class.forName("t.Entity");
        Class<Entity> c2 = Entity.class;
        Entity entity = new Entity();
        Class<Entity> c3 = (Class<Entity>) entity.getClass();

    }


}
