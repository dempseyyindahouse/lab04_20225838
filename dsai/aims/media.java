package Lab02.hust.soict.dsa.aims.media;

public abstract class Media {
    private int id;
    private String title;
    private String category;
    private float cost;

    public static void main(String[] args) {
        // Code cho phương thức main
    }
}public int getId() {
    return id;
}

public void setId(int id) {
    this.id = id;
}

public String getTitle() {
    return title;
}

public void setTitle(String title) {
    this.title = title;
}

public String getCategory() {
    return category;
}

public void setCategory(String category) {
    this.category = category;
}

public float getCost() {
    return cost;
}
