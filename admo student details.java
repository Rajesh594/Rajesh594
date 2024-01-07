class student
{
    int admo;
    String name;
    void get(int x,String y)
    {
        admo=x;
        name=y;
    }
    void show()
    {
        System.out.println("Admission no="+admo+"<Name="+name);
    }
    public static void main(String[] args)
    {
        student s1=new student();
        s1.get(111,"rrr");
        s1.show();
        student s2=new student();
        s2.get(222,"kkk");
        s2.show();
    }
}
