public class Person {
    private String name;
    private int age;
    private String country;

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

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public static void main(String[] args) {
        Person person = new Person();
        person.setName("John");
        person.setAge(25);
        person.setCountry("USA");
        System.out.println("Person: " + person.getName() + ", Age: " + person.getAge() + ", Country: " + person.getCountry());
    }
}
