package pessoa;

public class Pessoa {
    private String name;
    private int age;

    public void tellTheName(){
        System.out.println("Hi, my name's "+name);
    }

    public void tellTheAge(){
        System.out.println("Hi, I am "+age+" years old");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void doBirthday(){
        age += 1;
    }
}
