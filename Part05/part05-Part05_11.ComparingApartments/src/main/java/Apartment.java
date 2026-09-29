
public class Apartment {

    private int rooms;
    private int squares;
    private int pricePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.pricePerSquare = pricePerSquare;
    }

    public int getSquares() {
        return this.squares;
    }

    public int getRooms() {
        return this.rooms;
    }

    public int getPricePerSquare() {
        return this.pricePerSquare;
    }

    public boolean largerThan(Apartment compared) {

        if (this.squares > compared.getSquares()) {
            return true;

        }
        return false;

    }

    public int priceDifference(Apartment compared) {
        int ownPrice = this.squares * this.pricePerSquare;
        int comparedPrice = compared.getSquares() * compared.getPricePerSquare();

        if (ownPrice > comparedPrice) {
            return ownPrice - comparedPrice;
        }

        return comparedPrice - ownPrice;

    }

    public boolean moreExpensiveThan(Apartment compared) {
        int ownPrice = this.squares * this.pricePerSquare;
        int comparedPrice = compared.getSquares() * compared.getPricePerSquare();

        if (ownPrice > comparedPrice) {
            return true;

        }
        return false;

    }

}
