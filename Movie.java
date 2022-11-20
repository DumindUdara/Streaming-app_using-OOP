import java.util.ArrayList;
import java.util.List;

public class Movie {
    private String name;
    private String description;
    private String thumbnailImage;
    private int year;
    private int rating;
    private String category;
    private List<Actor> actors;

    /**
     * 
     */
    // Default constructor
    Movie() {
        this.name = " Featured today";
        this.description = "A visual knockout elevated by Emily ";
        this.thumbnailImage = "IMAGE - FEATURED";
        this.year = 1985;
        this.rating = 3;
        this.category = "Action";
        this.actors = new ArrayList<>();
    }

    // full arg constructor
    public Movie(String name, String description, String thumbnailImage, int year, int rating, String category) {
        this.name = name;
        this.description = description;
        this.thumbnailImage = thumbnailImage;
        this.year = year;
        this.rating = rating;
        this.category = category;
        this.actors = new ArrayList<>();
    }

    /**
     * @param name
     * @param description
     * @param year
     * @param rating
     * @param category
     */
    Movie(String name, String description, int year, int rating, String category) {
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

    /**
     * 
     */
    public void newPrinter() {
        System.out.println("Name " + " " + this.name);
        System.out.println("Description : " + " " + this.description);
        System.out.println("Year : " + " " + this.year);
        System.out.println("Rating : " + " " + this.rating);
        System.out.println("Category : " + " " + this.category);
    }

    public String getActors() { // getters
        return this.actors.toString();
    }

    public void addActor(Actor actors) { // setters
        this.actors.add(actors);

    }

    public String getName() { // getters
        return name;
    }

    public void setName(String name) { // setters
        this.name = name;
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

    public List<Actor> getActorList() {
        return this.actors;
    }

}
