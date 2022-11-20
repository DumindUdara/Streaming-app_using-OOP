public class Actor extends person {

    public Actor(String name, int age, String contact, int numberOfMovies, String gender) {
        super(name, age, contact, numberOfMovies, gender);

    }

    public void printActorsDetails() {
        System.out.println(name);
        System.out.println(age);
    }

    @Override
    public String toString() {
        return this.name;
    }

    public void showinfo() {
        System.out.println("Name:- " + this.name);
        System.out.println("Age:- " + this.age);
        System.out.println("Gender:- " + this.gender);
        System.out.println("Contact : - " + this.contact);
        System.out.println("Experiences (number of movies) : - " + this.numberOfMovies);

    }

}
