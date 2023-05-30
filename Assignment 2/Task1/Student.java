public class Student {
    private String code;
    private String name;
    private int age;
    private String sex;

    public Student(String code, String name, int age, String sex) {
        this.code = code;
        this.name = name;
        this.age = age;
        this.sex = sex;
    }
    public void setCode(String code){
        this.code = code;

    }
    public void setName(String name){
        this.name = name;

    }
    public void setAge(int age){
        this.age = age;

    }
    public void setSex(String sex){
        this.sex = sex;

    }
    public String getCode(){
        return code;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public String getSex(){
        return sex;
    }
    public void Print(){
        System.out.println("CODE: " + code);
        System.out.println("NAME: " + name);
        System.out.println("AGE: " + age);
        System.out.println("SEX: " +sex);
    }
}
