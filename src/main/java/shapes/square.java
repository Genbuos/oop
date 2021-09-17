package shapes;

public class square {
    public int side;


    public square(int side){
        this.side = side;

    }
    public int calcArea(){
        return this.side * this.side;


    }

    public int calcPerimeter(){
        return  this.side * 4;
    }
}
