package lecture.chapter6;

public abstract class Animal {

    private float size;
    private String description;
    private float weight;

    public Animal(float size, String description, float weight) {
        setSize(size);
        setDescription(description);
        setWeight(weight);
    }

    public void eat(){
        System.out.println("Das Tier "+ description +" isst.");
    }

    public abstract void breath();

    public final void move(){
        System.out.println("Das Tier "+ description +" bewegt sich.");
    }

    public float getSize() {
        return size;
    }

    public void setSize(float size) {
        this.size = size;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public String toString() {
        return super.toString() + " - Beschreibung: " + getDescription()
                + "; Größe: " + getSize() + "; Gewicht: " + getWeight();
    }
}
