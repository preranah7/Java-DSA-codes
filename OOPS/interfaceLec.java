package OOPS;

public class interfaceLec {
    //Interfaces are used to achieve total abstraction

    //Variables in the interface are final,public and static
    public static void main(String[] args) {
        Queen q = new Queen();
        q.moves();
    }
}

interface ChessPlayer{
    void moves(); //by default public,abstract
}

class Queen implements ChessPlayer{
    public void moves(){
        System.out.println("up, down, left,right, diagonal");
    }
}

class Rook implements ChessPlayer{
    public void moves(){
        System.out.println("up, down, left,right");
    }
}

class King implements ChessPlayer{
    public void moves(){
        System.out.println("up, down, left,right,diagonal (by 1 step)");
    }
}