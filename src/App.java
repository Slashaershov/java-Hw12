public class App
{
    public static void main(String[] args)
    {
        Author author1 = new Author("Vasia", "Shield");
        System.out.println(author1.toString());
        Author author2 = new Author("Kolia", "Armor");
        System.out.println(author2);

        Book book1 = new Book(author1, "Van Love Die", 1979);
        System.out.println(book1);
        Book book2 = new Book(author1, "Van Love Die 2", 1985);
        System.out.println(book2);
        Book book3 = new Book(author2, "Van Love Die Fanfic", 2003);
        System.out.println(book3);

        book2.setYearPublication(2004);
    }


}
