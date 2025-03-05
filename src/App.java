public class App
{
    public static void main(String[] args)
    {
        Author author1 = new Author("Vasia", "Shield");
        Author author2 = new Author("Kolia", "Armor");

        Book book1 = new Book(author1, "Van Love Die", 1979);
        Book book2 = new Book(author1, "Van Love Die 2", 1985);
        Book book3 = new Book(author2, "Van Love Die Fanfic", 2003);

        book2.setYearPublication(2004);
    }
}
