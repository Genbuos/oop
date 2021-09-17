package animals;

public class dog {
    public String name;
    public String size;




    public dog(String name, String size){
        this.name = name;
        this.size = size;


    }
    public String speak(){
        String bark = "woof woof";
        return bark;
    }

    @Override
    public String toString() {
        return "dog{" +
                "name='" + name + '\'' +
                ", size='" + size + '\'' +
                '}';
    }

    public String siccEm(){

        return this.name + " is chasing you down the street";
    }
}
