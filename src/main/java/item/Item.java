package item;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Items")
public class Item {

    @Id
    @GeneratedValue
    private String id;

    private String title;

    private String notes;

    private String picked;


    // getters and setters
    public String getId() { return id; }

    public void setId(String id) { this.id = id; }

    public String getTitle() { return title; }

    public void setTitle(String title) { this.title = title; }

    public String getNotes() { return notes; }

    public void setNotes(String notes) { this.notes = notes; }

    public String getPicked() { return picked; }

    public void setPicked(String picked) { this.picked = picked; }

}
