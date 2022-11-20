
import java.util.ArrayList;
import java.util.List;



public class TvSerias {
    private String name; // atribtes , global variables
    private String description; // atribtes , global variables
    private String thumbnailImage; // atribtes , global variables
    private int year; // atribtes , global variables
    private int rating; // atribtes , global variables
    private String category; // atribtes , global variables
    private List<Actor> actors; // atribtes , global variables

    /**
     * 
     */
    // Default constructor
    TvSerias() {
        this.name = " Mahabharat ";
        this.description = "When a dynastic struggle between the collateral ";
        this.thumbnailImage = "IMG - MAHABHARAT";
        this.year = 1988;
        this.rating = 5;
        this.category = "Adventure";
        
        this.actors = new ArrayList<Actor>();
    }

    // Same name Different Paramemeters
    public TvSerias(String name, String description, int year, int rating, String category) {
        this.name = name;
        this.description = description;
        this.year = year;
        this.rating = rating;
        this.category = category;
        this.actors = new ArrayList<Actor>();
       

    }

    // full arg constructor
    public TvSerias(String name, String description, String thumbnailImage, int year, int rating, String category) {
        this.name = name;
        this.description = description;
        this.thumbnailImage = thumbnailImage;
        this.year = year;
        this.rating = rating;
        this.category = category;
        this.actors = new ArrayList<Actor>();
        
        // this.actors = actors;
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

     public List<Actor> getActorList() {
        return this.actors;
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

    public void addActor(Actor a) {
        this.actors.add(a);
    }

    public List<Actor> getActors() { // getters
        return actors;
    }

    public void setActors(List<Actor> actors) { // setters
        this.actors = actors;
    }

    

}
