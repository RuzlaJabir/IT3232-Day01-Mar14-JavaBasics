public class AudioBook extends Book {
    private double duration;
    private String narrator;

    public AudioBook(String title, String author, int publicationYear, double duration, String narrator) {
        super(title, author, publicationYear);
        this.duration = duration;
        this.narrator = narrator;
    }

    public double getDuration() {
        return duration;
    }

    public String getNarrator() {
        return narrator;
    }

    @Override
    public void displayDetails() {
        System.out.println("Audio Book: " + getTitle() + " by " + getAuthor() + ", Year: " + getPublishedYear() + ", Duration: " + duration + " hours, Narrated by: " + narrator);
    }
}