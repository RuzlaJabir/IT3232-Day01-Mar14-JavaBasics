abstract class Book{
    private String title;
    private String author;
    private int publish_year;

    public Book(String title, String author, int publish_year)
    {
        this.title = title;
        this.author = author;
        this.publish_year = publish_year;
    }

    public String getTitle(){
        return title;
    }

    public String getAuthor(){
        return author;
    }

    public int getPublishedYear(){
        return publish_year;
    }

    public abstract void displayDetails();
}