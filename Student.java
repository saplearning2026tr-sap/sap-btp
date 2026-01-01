public class Student {
 
    String name;
    String age;
    String section;
    String raw;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAge() {
        return age;
    }
    public void setAge(String age) {
        this.age = age;
    }
    public String getSection() {
        return section;
    }
    public void setSection(String section) {
        this.section = section;
    }
    public Student()     
    {
       System.out.println("object is created");
       

    }

    public static void main(String[] agrs){
        Student obj1 = new Student();
        obj1.setName("rohit");
        obj1.setAge("23");
        obj1.setSection("A");
        System.out.println(obj1.getAge() + " " + obj1.getName() + " " + obj1.getSection());
    }

    

    



}