package ua.goit.java.restaurant.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "dish")
public class Dish {

    public Dish() {
    }

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name="increment", strategy = "increment")
    private Long id;

    @ManyToMany(cascade = {CascadeType.DETACH}, fetch = FetchType.EAGER)
    @JoinTable(
            name = "ingredient_to_dish",
            joinColumns = @JoinColumn(name = "dish_id"),
            inverseJoinColumns = @JoinColumn(name = "ingredient_id")
    )

    private List<Ingredient> ingredients;

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    public Dish(List<Ingredient> ingredients, DishCategory category, String name, Float weight, Float price, String photo) {
        this.ingredients = ingredients;
        this.category = category;
        this.name = name;
        this.weight = weight;
        this.price = price;
        this.photo = photo;
    }

    public void setIngredients(List<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }

    @Column(name = "category")
    @Enumerated(EnumType.STRING)
    private DishCategory category;

    @Column(name = "name")
    private String name;

    @Column(name = "weight")
    private Float weight;

    @Column(name = "price")
    private Float price;

    @Column(name = "photo")
    private String photo;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getWeight() {
        return weight;
    }

    public void setWeight(Float weight) {
        this.weight = weight;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public DishCategory getCategory() {
        return category;
    }

    public void setCategory(DishCategory category) {
        this.category = category;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Dish dish = (Dish) o;

        if (ingredients != null ? !ingredients.equals(dish.ingredients) : dish.ingredients != null) return false;
        if (category != dish.category) return false;
        if (name != null ? !name.equals(dish.name) : dish.name != null) return false;
        if (weight != null ? !weight.equals(dish.weight) : dish.weight != null) return false;
        if (price != null ? !price.equals(dish.price) : dish.price != null) return false;
        return photo != null ? photo.equals(dish.photo) : dish.photo == null;

    }

    @Override
    public int hashCode() {
        int result = ingredients != null ? ingredients.hashCode() : 0;
        result = 31 * result + (category != null ? category.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (weight != null ? weight.hashCode() : 0);
        result = 31 * result + (price != null ? price.hashCode() : 0);
        result = 31 * result + (photo != null ? photo.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Dish{" +
                "id = " + id +
                ", category=" + category +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                ", price=" + price +
                ", photo='" + photo + '\'' +
                '}';
    }
}
