public class Book
{
    private Author author;
    private String name;
    private int yearPublication;

    public Book(Author author, String name, int year)
    {
        this.author = author;
        this.name = name;
        this.yearPublication = year;
    }

    public Author getAuthor()
    {
        return author;
    }

    public String getName()
    {
        return name;
    }

    public int getYearPublication()
    {
        return yearPublication;
    }

    public void setYearPublication(int value)
    {
        yearPublication = value;
    }
}
