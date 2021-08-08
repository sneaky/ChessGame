package com.company;

/**
 * Represents a single square on the 8x8 grid
 * with an optional piece object.
 * @author Sean Kennedy
 */
public class Square {
    private Piece piece;
    private int x, y;

    /**
     * This method is the constructor for the {@link com.company.Square} class.
     * @param x x value of the squares coordinate
     * @param y y value of the squares coordinate
     * @param piece optional piece object
     */
    public Square(int x, int y, Piece piece) {
        this.setPiece(piece);
        this.setX(x);
        this.setY(y);
    }

    /**
     * This method gets the current piece occupying the square.
     * @return current piece or NULL if square is empty
     */
    public Piece getPiece() {
        if (this.piece == null) return null;
        return this.piece; }

    /**
     * This method sets the current piece occupying the square.
     * @param p piece that is being set to this square
     */
    public void setPiece(Piece p) { this.piece = p; }

    /**
     * This method gets the current X value of the squares coordinates.
     * @return x value of this squares coordinate.
     */
    public int getX() {
        return this.x;
    }

    /**
     * This method sets the current X value of the squares coordinates.
     * @param x integer value
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     * This method gets the current X value of the squares coordinates.
     * @return y value of this squares coordinate.
     */
    public int getY() {
        return this.y;
    }

    /**
     * This method sets the current X value of the squares coordinates.
     * @param y integer value
     */
    public void setY(int y) {
        this.y = y;
    }

    public PieceType getPieceType() { return this.piece.getType(); }

    public String getPieceIdentifier() {
        String identifier = "-";
        if (this.getPiece() == null) {
            return identifier;
        }
        if (this.getPieceType() == PieceType.PAWN) {
            identifier = "P";
        }
        if (this.getPieceType() == PieceType.ROOK) {
            identifier = "R";
        }
        if (this.getPieceType() == PieceType.BISHOP) {
            identifier = "B";
        }
        if (this.getPieceType() == PieceType.KNIGHT) {
            identifier = "N";
        }
        if (this.getPieceType() == PieceType.QUEEN) {
            identifier = "Q";
        }
        if (this.getPieceType() == PieceType.KING) {
            identifier = "K";
        }
        return identifier;
    }

}
