package t;

public class Entity {
    private int i;
    private static int s;

    public Entity()
    {
        i =1;
        s =1;
        System.out.println("construct i="+i + " s="+s);
    }
    static
    {
        s = 2;
        System.out.println("static s=" +s);
    }


}
