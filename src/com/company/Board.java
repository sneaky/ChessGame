package com.company;

public class Board {
    private Square[][] squares;
    private PieceSet[] pieceSets;

    public Board(int x, int y) {
        this.squares = new Square[x][y];
        this.newBoard();
    }

    public Board() throws Exception {
        this.newBoard();
    }

    public Square getSquare(int x, int y) throws Exception {
        if (x < 0 || x > 7 || y < 0 || y > 7) {
            throw new Exception("Index out of bound.");
        }
        return squares[x][y];
    }

    public void printCurrentBoardState() throws Exception {
        System.out.println("\nCurrent Board State:");
        System.out.println(" _ _ _ _ _ _ _ _ _ _ _ _ _");
        for (int i = 0; i < 8; i++) {
            System.out.print("|");
            for (int j = 0; j < 8; j++)
                if (this.squares[i][j].getPieceIdentifier() == null) {
                    System.out.print(" - ");
                } else {
                    System.out.print(" " + squares[i][j].getPieceIdentifier() + " ");
                }
            System.out.println("|");
        }
        System.out.println(" _ _ _ _ _ _ _ _ _ _ _ _ _");
    }


    private void newBoard() {
        // init white squares
        squares[0][0] = new Square(0, 0, new Piece(PieceColor.WHITE, PieceType.ROOK));
        squares[0][1] = new Square(0, 1, new Piece(PieceColor.WHITE, PieceType.KNIGHT));
        squares[0][2] = new Square(0, 2, new Piece(PieceColor.WHITE, PieceType.BISHOP));
        squares[0][3] = new Square(0, 3, new Piece(PieceColor.WHITE, PieceType.QUEEN));
        squares[0][4] = new Square(0, 4, new Piece(PieceColor.WHITE, PieceType.KING));
        squares[0][5] = new Square(0, 5, new Piece(PieceColor.WHITE, PieceType.BISHOP));
        squares[0][6] = new Square(0, 6, new Piece(PieceColor.WHITE, PieceType.KNIGHT));
        squares[0][7] = new Square(0, 7, new Piece(PieceColor.WHITE, PieceType.ROOK));
        // white pawns
        for (int i = 0; i < 8; i++) {
            squares[1][i] = new Square(1, i, new Piece(PieceColor.WHITE, PieceType.PAWN));
        }

        // init remaining empty squares
        for (int i = 2; i < 6; i++) {
            for (int j = 0; j < 8; j++) {
                squares[i][j] = new Square(i, j, null);
            }
        }

        //init black squares
        squares[7][0] = new Square(0, 0, new Piece(PieceColor.WHITE, PieceType.ROOK));
        squares[7][1] = new Square(0, 1, new Piece(PieceColor.WHITE, PieceType.KNIGHT));
        squares[7][2] = new Square(0, 2, new Piece(PieceColor.WHITE, PieceType.BISHOP));
        squares[7][3] = new Square(0, 3, new Piece(PieceColor.WHITE, PieceType.QUEEN));
        squares[7][4] = new Square(0, 4, new Piece(PieceColor.WHITE, PieceType.KING));
        squares[7][5] = new Square(0, 5, new Piece(PieceColor.WHITE, PieceType.BISHOP));
        squares[7][6] = new Square(0, 6, new Piece(PieceColor.WHITE, PieceType.KNIGHT));
        squares[7][7] = new Square(0, 7, new Piece(PieceColor.WHITE, PieceType.ROOK));
        // black pawns
        for (int i = 0; i < 8; i++) {
            squares[6][i] = new Square(6, i, new Piece(PieceColor.BLACK, PieceType.PAWN));
        }
    }
}
