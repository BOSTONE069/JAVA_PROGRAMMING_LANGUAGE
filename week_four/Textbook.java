package week_four.monday;

public class Textbook extends Book{

    private int edition;
    public Textbook(String title, double price, int edition) {
        super(title, price);
        this.edition = edition;
    }

    @Override
    public String getBookInfo() {
        return super.getBookInfo() + "_" + edition;
    }

    public int getEdition() {
        return edition;
    }

    public boolean canSubstituteFor(Textbook other) {
        return this.edition >= other.getEdition() && this.getTitle().equals(other.getTitle());
    }
}
