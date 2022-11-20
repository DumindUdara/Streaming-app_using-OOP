public abstract class person {
    protected String name;
    protected int age;
    protected String contact;
    protected int numberOfMovies;
    protected String gender;

    public person(String name, int age, String contact, int numberOfMovies, String gender) {
        this.name = name;
        this.age = age;
        this.contact = contact;
        this.numberOfMovies = numberOfMovies;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public int getNumberOfMovies() {
        return numberOfMovies;
    }

    public void setNumberOfMovies(int numberOfMovies) {
        this.numberOfMovies = numberOfMovies;
    }

    public String getgender() {
        return gender;
    }

    public void setgender(String gender) {
        this.gender = gender;
    }

}
