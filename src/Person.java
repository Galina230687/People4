import java.util.Optional;

public class Person {
//    protected final String name;
//    protected final String surname;
    protected int age;
//    protected String address;
    //...

//    public Person(String name, String surname) {
//        //...
//        this.name = name;
//        this.surname = surname;
//    }

    public Person(int age) { //String name, String surname,String address
//        this.name = name;
//        this.surname = surname;
        this.age = age;
//        this.address = address;

        //...
    }


    public boolean hasAge() {
        return age >= 0;
    }

//    public boolean hasAddress() {
//        return getAddress().isEmpty();
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public String getSurname() {
//        return surname;
//    }

    public Optional<Integer> getAge() { //получить возраст
        return Optional.of(age);
//        if (age == Integer.parseInt(null)) {
//            return OptionalInt.of(age);
//        } else {
//            return OptionalInt.empty();
//        }
        //return OptionalInt.empty();
    }


//    public String getAddress() {
//        return address;
//    }
//
//    public void setAddress(String address) {
//        this.address = address;
//    }
//
//    public void happyBirthday() {
//        if (hasAge()) age++;
//    }

//    public PersonBuilder newChildBuilder() {
//        return new PersonBuilder().setSurname(surname).setAddress(address);
//    }

    @Override
    public String toString() {
        return "Person {age=" + age;

        }
    }
//        return "Person{" + "name='" + name + '\'' + ", surname='" + surname + '\'' + ", age=" + age + ", address='" + address + '\'' +
//                "name='" + name + '\'' +
//                ", surname='" + surname + '\'' +
//                ", age=" + age +
//                ", address='" + address + '\'' +
//                '}';
//    }


//    @Override
//    public int hashCode() { /*...*/ }
//    }