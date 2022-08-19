import java.util.Objects;
import java.util.OptionalInt;

public class Person {

    protected final String name;
    protected final String surname;
    protected int age;
    protected String address;


    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public Person(String name, String surname, int age, String adress) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.address = adress;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public boolean hasAge() {
        if (Person.this.age > 0) {
            return true;
        } else {
            return false;
        }
    }


    public boolean hasAddress() {
        if (Person.this.address == null) {
            return false;
        } else {
            return true;
        }
    }

    public void setAddress(String address) {
        this.address = address;
    }


    public void happyBirthday() {
        if (hasAge() == true)
            this.age = age + 1;
    }


    @Override
    public int hashCode() {
        return Objects.hash(getName(), getSurname(), getAge(), getAddress());
    }


    public PersonBuilder newChildBuilder() {

        return new PersonBuilder().setSurname(surname).setAge(age).setAddress(address);
    }

    @Override
    public String toString() {
        return "name " + name + ", surname " +
                surname + ", age " + age + ", address " + address;
    }
}


