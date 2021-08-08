package com.company;

import java.util.List;

public class PieceSet {
    private List<Piece> pieces;
    private PieceColor color;
    private PieceType type;

    public PieceSet(PieceColor color) {
        this.color = color;
        this.type = type;
        this.resetPieces();
    }

    public List<Piece> getPieces() {
        return pieces;
    }

    public PieceColor getColor() {
        return color;
    }

    private void resetPieces() {
        for (Piece piece : pieces) {
            piece.setDead(false);
        }
    }


}
