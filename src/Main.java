public class Main {

    public static void main(String[] args) {
        /*Реализовать методы toString, equals и hashCode в классах Author и Book, которые были созданы на прошлом уроке.
         Обратите внимание, что toString книги не должен дублировать код из toString автора,
         а должен делегировать (вызывать) его версию метода.
         */

        Author author1 = new Author("Джанни", "Родари");
        Book book1 = new Book("Голубая стрела", author1, 1980);


        Author author2 = new Author("Кей", "Хорстманн");
        Book book2 = new Book("Java. Библиотека профессионала", author2, 2014);

        System.out.println("Книга 1");
        System.out.println(author1.getFoolName());
        System.out.println(book1.getNameBook());
        System.out.println(book1.getYearOfPublicationBook());


        System.out.println();
        System.out.println("Книга 2");
        System.out.println(author2.getFoolName());
        System.out.println(book2.getNameBook());
        System.out.println(book2.getYearOfPublicationBook());


    }



}

