public class PrintedBook extends Book{
    private int pageCount;

    public PrintedBook(String title, String author, int publish_year,int pageCount)
    {
        super(title,author,publish_year);
        this.pageCount = pageCount;
    }

    public int getPageCount(){
        return pageCount;
    }

    @Override
    public void displayDetails(){
        System.out.println("Printed Book: " + getTitle() + " by " + getAuthor() + ", Year: " + getPublishedYear() + ", Pages: " + pageCount);
    }
}