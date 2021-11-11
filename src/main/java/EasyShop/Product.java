package EasyShop;

public class Product {
    /**
     * Есть класс EasyShop.Product (id, название, цена).
     */
    private Long id;
    private String title;
    private float cost;

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public float getCost() {
        return cost;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public Product(long id, String title, float cost) {
        this.id = id;
        this.title = title;
        this.cost = cost;
    }

    @Override
    public String toString() {
        return id + " " + title + " " + cost;
    }
}
