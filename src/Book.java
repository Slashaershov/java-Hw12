import java.util.Objects;

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

    @Override
    public String toString()
    {
        return "Book: " + name + "; " + author.toString() + "; yearPublication: " + yearPublication + ".";
    }

    @Override
    public boolean equals(Object o)
    {
        if (o == null || getClass() != o.getClass())
        {
            return false;
        }
        Book book = (Book) o;
        return yearPublication == book.yearPublication && Objects.equals(author, book.author) && Objects.equals(name, book.name);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(author, name, yearPublication);
    }
}
