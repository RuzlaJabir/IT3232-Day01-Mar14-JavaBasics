public class EBook extends Book {
    private double fileSize;
    private String format;

    public EBook(String title, String author, int publish_year, double fileSize, String format) {
        super(title, author, publish_year);
        this.fileSize = fileSize;
        this.format = format;
    }

    public double getFileSize() {
        return fileSize;
    }

    public String getFormat() {
        return format;
    }

    @Override
    public void displayDetails() {
        System.out.println("E-Book: " + getTitle() + " by " + getAuthor() + ", Year: " + getPublishedYear() + ", File Size: " + fileSize + "MB, Format: " + format);
    }
}