import java.util.Objects;

public class Person {
    protected final String name;
    protected final String surname;
    protected int age;
    protected String city;

    public Person (String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Person (String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public Person (String name, String surname, int age, String city) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.city = city;
    }

    public boolean hasAge() {
        return this.age > 0;
    }

    public boolean hasAddress() {
        return this.city != null;
    }


    public String getName() {
        return this.name;
    }

    public String getSurname() {
        return this.surname;
    }

    public int getAge() {
        return this.age;
    }

    public String getAddress() {
        return this.city;
    }

    public String setAddress(String address) {
        return this.city = address;
    }

    public void happyBirthday() {
        if (hasAge()) {
            this.age++;
        }
    }

    @Override
    public String toString() {
        if (hasAge() && hasAddress()) {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", surname='" + surname + '\'' +
                    ", age=" + age +
                    ", city='" + city + '\'' +
                    '}';
        } else if (hasAge() && !hasAddress()) {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", surname='" + surname + '\'' +
                    ", age=" + age +
                    '\'' +
                    '}';
        } else {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", surname='" + surname + '\'' +
                    '}';
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, age);
    }

    public PersonBuilder newChildBuilder() {
        PersonBuilder personBuilder = new PersonBuilder();
        personBuilder.surname = this.surname;
        personBuilder.city = this.city;
        personBuilder.age = 1;
        return personBuilder;
    }
}
