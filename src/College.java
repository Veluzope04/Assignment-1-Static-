public class College {

    private int rollno;
    private String name;
    private String st_class;

    private static String college;

    private static int nextroll;

    static{
      nextroll = 1;
      college = "NDMVP Engineering";
    }

    public College(String name, String st_class)
    {
     this.rollno = nextroll;
     nextroll++;
     this.name = name;
     this.st_class = st_class;
    }

    public int getRollno() {
        return rollno;
    }

    public String getName() {
        return name;
    }

    public String getSt_class() {
        return st_class;
    }
    public static String getCollege() {
        return college;
    }
    public void display(){
        System.out.println(rollno + " "  + name+ " "    + st_class +  " college name is = " + college );
    }
}
