class GrandParent
{
    String grandFatherName, grandMotherName;

    GrandParent(String a, String b)
    {
        grandFatherName=a;
        grandMotherName=b;
        System.out.println("Grand Father Name is " +grandFatherName);
        System.out.println("Grand Mother Name is " +grandMotherName);
    }
}
class Parent extends GrandParent
{
    String FatherName, MotherName;
    Parent(String c, String d, String a, String b)
    {
            super(a,b);
            FatherName=c;
            MotherName=d;
            System.out.println("Father Name is " +FatherName);
            System.out.println("Mother Name is " +MotherName);
    }
}
class Child extends Parent
{
    Child(String c, String d, String a, String b)
    {
        super(c, d, a, b);
    } 

public static void main(String args[])
{
    Child obj=new Child("Bharat", "Sunita", "Amrit", "Kuusum");
}
}
