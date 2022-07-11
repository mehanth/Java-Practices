package javawithmehanth;

class employee{
    int id;
    String name;
    int age;
    public void printdetails(){
        System.out.println("my id is " + id);
        System.out.println("my name is " + name);
        System.out.println("and my age is "+ age);
    }
}
public class custom_class {
    public static void main(String[] args) {
        employee mehanth = new employee();
        employee rahul = new employee();
        mehanth.id =45;
        mehanth.name="Mehanth Valluri";
        mehanth.age =19;
        rahul.id=44;
        rahul.name="Rahul kecha";
        rahul.age =20;
        mehanth.printdetails();
        rahul.printdetails();

    }
}
