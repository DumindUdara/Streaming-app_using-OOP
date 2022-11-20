import java.util.ArrayList;
import java.util.List;

public class Documentaries {
    private String name; // atribtes , global variables
    private String description; // atribtes , global variables
    private String thumbnailImage; // atribtes , global variables
    private int year; // atribtes , global variables
    private int rating; // atribtes , global variables
    private String category; // atribtes , global variables
    private List<Actor> actors; // atribtes , global variables

    public void addActor(Actor a) {
        this.actors.add(a);
    }

    // Default constructor
    Documentaries() {
        this.name = "Order and Chaos";
        this.description = "Our world rotates in a constant state of chaos. ";
        this.thumbnailImage = "IMG - ORDER and ORDER";
        this.year = 2003;
        this.rating = 4;
        this.category = "SCIENCE";
        this.actors = new ArrayList<>();

    }

    // full arg constructor
    public Documentaries(String name, String description, String thumbnailImage, int year, int rating,
            String category) {
        this.name = name;
        this.description = description;
        this.thumbnailImage = thumbnailImage;
        this.year = year;
        this.rating = rating;
        this.category = category;
        this.actors = new ArrayList<>();
        // this.actors = actors;
    }

    // Same name Different Paramemeters
    public Documentaries(String name, String description, int year, int rating, String category) {
        this.name = name;
        this.description = description;
        this.year = year;
        this.rating = rating;
        this.category = category;
        this.actors = new ArrayList<>();

    }

    public void printDetails() {

        System.out.println("Name :" + " " + this.name);
        System.out.println("Description : " + " " + this.description);
        System.out.println("Image ; " + " " + this.thumbnailImage);
        System.out.println("Year : " + " " + this.year);
        System.out.println("Rating : " + " " + this.rating);
        System.out.println("Category : " + " " + this.category);
        System.out.println("Actors : " + " " + this.getActors());

    }

    public String getName() { // getters
        return name;
    }

    public void setName(String name) { // setters
        this.name = name;
    }

    public List<Actor> getActorList() {
        return this.actors;
    }

    public String getDescription() { // getters
        return description;
    }

    public void setDescription(String description) { // setters
        this.description = description;
    }

    public String getThumbnailImage() { // getters
        return thumbnailImage;
    }

    public void setThumbnailImage(String thumbnailImage) { // setters
        this.thumbnailImage = thumbnailImage;
    }

    public int getYear() { // getters
        return year;
    }

    public void setYear(int year) { // setters
        this.year = year;
    }

    public int getRating() { // getters
        return rating;
    }

    public void setRating(int rating) { // setters
        this.rating = rating;
    }

    public String getCategory() { // getters
        return category;
    }

    public void setCategory(String category) { // setters
        this.category = category;
    }

    public String getActors() { // getters
        return actors.toString();
    }

    public void setActors(List<Actor> actors) { // setters
        this.actors = actors;
    }

}
