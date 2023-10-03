public class PersonBuilder {
    //...

    private String name;
    private String surname;
    private int age;
    private String address;


    public PersonBuilder setName(String name) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Не верно указано имя");
        } else this.name = name;
        return this;
    }

    public PersonBuilder setSurname(String surname) {
        if (surname == null || surname.isEmpty()) {
            throw new IllegalArgumentException("Не верно указана фамилия");
        } else {
            this.surname = surname;
        }
        return this;
    }

    public PersonBuilder setAge(Integer age) {  //установить возраст
        if (age < 0) {
            throw new IllegalArgumentException("Не верно указан возраст");
        } else {
            this.age = age;
        }
        return this;
    }

    public PersonBuilder setAddress(String address) {
        Person person;
        this.address = address;
        return this;
    }

    public Person build() {
        Person person;
        if (name == null || surname == null || address == null) {
            throw new IllegalStateException("Не верно указано одно из полей имя/фамилия/адрес");
        } else {
            return new Person(name, surname, age, address);
        }
    }
}