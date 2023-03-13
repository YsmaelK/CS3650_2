import java.util.List;

//5D
public class Dog {
    private String breed;
    private String name;
    private List<Paw> listplayer;

    public Dog() {
        // no-arg constructor
    }

    public Dog(String breed, String name) {
        this.breed = breed;
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
