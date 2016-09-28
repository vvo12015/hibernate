package ua.goit.java.restaurant.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name = "ingredient")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class Ingredient {

    @Id
    @Column(name = "id")
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    private long id;

    @Column(name = "name")
    private String name;

    @Column(name = "measure")
    private String measure;

    public Ingredient(String name, String measure) {
        this.name = name;
        this.measure = measure;
    }

    public Ingredient() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Ingredient)) return false;

        Ingredient that = (Ingredient) o;

        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        return measure != null ? measure.equals(that.measure) : that.measure == null;

    }

    @Override
    public String toString() {
        return "Ingredient{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", measure='" + measure + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (measure != null ? measure.hashCode() : 0);
        return result;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMeasure() {
        return measure;
    }

    public void setMeasure(String measure) {
        this.measure = measure;
    }
}
