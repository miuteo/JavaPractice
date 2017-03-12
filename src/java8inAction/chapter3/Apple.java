package java8inAction.chapter3;

/**
 * Created by Asus x556 on 12-Mar-17.
 */
public class Apple {
    public Apple(){
    }
    public Apple(int weight){
        this.weight=weight;
    }
    public Apple(String color,int weight){
        this.weight=weight;
        this.color=color;
    }
    public Apple(String color,int weight,int id){
        this.weight=weight;
        this.color=color;
        this.id=id;
    }
    private String color;
    private int weight;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private int id;
    public String toString(){
       return "[color="+color+",weight="+weight+",id="+id+"]";
    }
}
