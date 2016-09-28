package ua.goit.java.restaurant.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name = "stock")
public class Stock {
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Ingredient getIngredient() {
        return ingredient;
    }

    public void setIngredient(Ingredient ingredient) {
        this.ingredient = ingredient;
    }

    public long getCount() {
        return count;
    }

    public void setCount(long count) {
        this.count = count;
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    private long id;

    @ManyToOne
    @JoinColumn(name = "ingredient_id")
    private Ingredient ingredient;

    @Column(name = "count")
    private long count;

    public Stock(Ingredient ingredient, long count) {
        this.ingredient = ingredient;
        this.count = count;
    }

    public Stock() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Stock)) return false;

        Stock stock = (Stock) o;

        if (count != stock.count) return false;
        return ingredient != null ? ingredient.equals(stock.ingredient) : stock.ingredient == null;

    }

    @Override
    public int hashCode() {
        int result = ingredient != null ? ingredient.hashCode() : 0;
        result = 31 * result + (int) (count ^ (count >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "Stock{" +
                "id=" + id +
                ", ingredient=" + ingredient +
                ", count=" + count +
                '}';
    }
}
