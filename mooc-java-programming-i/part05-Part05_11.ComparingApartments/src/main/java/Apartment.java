
public class Apartment {

    private int rooms;
    private int squares;
    private int princePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.princePerSquare = pricePerSquare;
    }
    
    public boolean largerThan(Apartment compared) {
        if (this.squares > compared.squares) {
            return true;
        } else {
            return false;
        }
    }
    
    public int priceDifference(Apartment compared) {
        int totalPrice1 = this.squares * this.princePerSquare;
        int totalPrice2 = compared.squares * compared.princePerSquare;
        
        return Math.abs(totalPrice1 - totalPrice2);
    }
    
    public boolean moreExpensiveThan(Apartment compared) {
        int totalPrice1 = this.squares * this.princePerSquare;
        int totalPrice2 = compared.squares * compared.princePerSquare;
        
        if (totalPrice1 > totalPrice2) {
            return true;
        } else {
            return false;
        }
    }

}
