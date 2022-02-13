public class Main {

    public static void main(String[] args) {
        Person mom = new PersonBuilder()
                .setName("Анна")
                .setSurname("Вольф")
                .setAge(31)
                .setAddress("Сидней")
                .build();
        Person son = mom.newChildBuilder()
                .setName("Антошка")
                .build();
        System.out.println("У " + mom + " есть сын, " + son);

        Person brother = new PersonBuilder()
                .setName("Леша")
                .setSurname("Вольф")
                .setAge(43)
                .build();
        System.out.println(brother);

        Person uncle = new PersonBuilder()
                .setName("Игорь")
                .setSurname("Бурмистров")
                .build();
        System.out.println(uncle);

        try {
            new PersonBuilder().build();
        } catch (IllegalStateException e) {
            e.printStackTrace();
        }

        try {
            new PersonBuilder().setAge(-100).build();
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
    }
}
