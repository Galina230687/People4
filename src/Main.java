public class Main {

    public static void main(String[] args) {
        Person mom = new PersonBuilder()
                //.setName("Анна")
                //.setSurname("Вольф")
                .setAge(35)
                //.setAddress("Сидней")
                .build();
        //Person son = mom.newChildBuilder()
                //.setName("Антошка")
//                .setAge(1)
//                .build();
        System.out.println("У " + mom + " есть сын "); //+ son

//        try {
//            // Не хватает обязательных полей
//            new PersonBuilder().setSurname(mom.surname).build();
//        } catch (IllegalStateException e) {
//            e.printStackTrace();
//        }
//
//        try {
//            // Возраст не верный
//            new PersonBuilder().setAge(mom.age).build();
//        } catch (IllegalArgumentException e) {
//            e.printStackTrace();
//        }
    }
}

