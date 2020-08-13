import java.util.Objects;

public class Person {

    String surname;
    int age;
    String sex;

    public Person(String surname, int age, String sex) {
        this.surname = surname;
        this.age = age;
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Person{" +
                "surname='" + surname + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age &&
                Objects.equals(surname, person.surname) &&
                Objects.equals(sex, person.sex);
    }

    @Override
    public int hashCode() {
        return Objects.hash(surname, age, sex);
    }
}
