public class PersonBuilder {

    protected String name;
    protected String surname;
    protected int age = 999;
    protected String city;

    public PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public PersonBuilder setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public PersonBuilder setAddress(String address) {
        this.city = address;
        return this;
    }

    public PersonBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    public Person build() throws IllegalStateException, IllegalArgumentException {
        if (this.age <= 0) {
            throw new IllegalArgumentException();
        } else if (this.name == null || this.surname == null) {
            throw new IllegalStateException();
        } else if (this.age == 999) {
            return new Person(name, surname);
        } else {
            return new Person(name, surname, age, city);
        }
    }
}


