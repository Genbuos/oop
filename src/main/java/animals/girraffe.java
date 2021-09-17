package animals;

public class girraffe {
    public String name;
    public int legs = 4;
    public boolean bluTunge = true;

    @Override
    public String toString() {
        return "girraffe{" +
                "name='" + name + '\'' +
                ", legs=" + legs +
                ", bluTunge=" + bluTunge +
                '}';
    }

    public girraffe(String name, int legs, boolean bluTunge){
        this.name = name;
        this.legs =  legs;
        this.bluTunge = bluTunge;

    }
    public boolean isBluTunge(){
        return bluTunge;
    }
    public int howmanylegs(){
        return legs;
    }




}
