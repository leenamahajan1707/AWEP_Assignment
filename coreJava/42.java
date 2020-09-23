// 42.	Create a class Tile to store the edge length of a square tile, and create another 
// class Floor to store length and width of a rectangular floor. Add method totalTiles(Tile t) in 
// Floor class with Tile as argument to calculate the whole number of tiles needed to cover the
//  floor completely.

class Tile{
     int len;
    Tile(int len){
        this.len = len;
    }
}
class Floor {
    private int rlen;
    private int rwid;
    private int totTiles;

    Floor(int rlen, int rwid){
        this.rlen=rlen;
        this.rwid=rwid;
    }
    
        
    void totalTiles(Tile t){
        int tarea = t.len * t.len;
        int rarea = rlen * rwid;
        
         totTiles = rarea / tarea;
    }
    
    void show(){
        System.out.println("total tiles = "+totTiles);
    }

    
}
class TileDemo{
    public static void main(String arg[])
    {
        Tile t = new Tile(2);
        Floor f = new Floor(15,5);
        f.totalTiles(t);
        f.show();
    }
}