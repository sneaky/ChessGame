package com.company;

public class Piece {
    private PieceColor color;
    private Square currentSquare;
    private boolean isDead = false;
    private final PieceType type;

    public Piece(PieceColor color, PieceType type) {
        this.color = setColor(color);
        this.type = setType(type);
    }

    public PieceType getType() {
        return this.type;
    }

    private PieceType setType(PieceType type) { return type; }

    public PieceColor getColor() {
        return this.color;
    }

    private Square getCurrentSquare(Piece p) {
        return this.currentSquare;
    }

    private PieceColor setColor(PieceColor color) {
        return color;
    }

    public boolean isDead() {
        return this.isDead;
    }

    public void setDead(boolean isDead) {
        this.isDead = isDead;
    }

    public boolean canMove(Board board, Square start, Square end) {
        /*
         TODO: Implement this method.
         */
        return true;
    }
}
