public class Book {
    private String title;
    private String category;
    private float cost;
    private String[] authors = new ArrayList<String>();

    // Phương thức thêm tác giả
    public void addAuthor(String authorName) {
        if (authors.contains(authorName)) {
            System.out.println("Author \"" + authorName + "\" is already in the list.");
        } else {
            authors.add(authorName);
            System.out.println("Author \"" + authorName + "\" added.");
        }
    }

    // Phương thức xóa tác giả
    public void removeAuthor(String authorName) {
        if (authors.contains(authorName)) {
            authors.remove(authorName);
            System.out.println("Author \"" + authorName + "\" removed.");
        } else {
            System.out.println("Author \"" + authorName + "\" not found in the list.");
        }
    }
}
public Book(int id, String title, String category, float cost, String author) {
    super(title, category, cost);
    this.authors = new ArrayList<String>(); // Khởi tạo ArrayList
    this.authors.add(author); // Thêm author vào list
}

@Override
public String toString() {
    String authorString = String.join(", ", this.authors); // Kết hợp các danh sách
    return "Book " + this.getTitle() + " " + authorString + " " + this.getCost();
}
