

public class Interfaces {
    public static void main(String[] args){
    Queen queen= new Queen();
    queen.moves();
    King king=new King();
    king.moves();
    Rook rook =new Rook();
    rook.moves();
    Bear bear= new Bear();
    bear.eat();
    }
}

interface Herbivore{
    void eat();
}
interface Carnivore{
    void eat();
}
class Bear implements Herbivore,Carnivore{
    public void eat(){
        System.out.println("BEAR EATS GRASS And Meat");
    }
}



interface ChessPlayer{
    void moves();
}

class Queen implements ChessPlayer{
    public void moves(){
        System.out.println("Queen moves-[UP,DOWN,LEFT,RIGHT,DIAGONALLY] IN ALL 4 DIRECTIONS");
    }
}

class Rook implements ChessPlayer{
    public void moves(){
        System.out.println("Queen moves-[UP,DOWN,LEFT,RIGHT]");
    }
}

class King implements ChessPlayer{
    public void moves(){
        System.out.println("Queen moves-[UP,DOWN,LEFT,RIGHT,DIAGONALLY]-1 step only");
    }
}