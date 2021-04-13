package br.com.portfolio.tabuleiro.tabuleiro.classes;

public class Quadro {
    private Position position;
    private PieceGamer piece;

    public Quadro() {
    }

    public Quadro(Position position, PieceGamer piece) {
        setPosition(position);
        setPiece(piece);
    }

    public Position getPosition() {
        return position;
    }

    public PieceGamer getPiece() {
        return piece;
    }

    public void setPiece(PieceGamer piece) {
        this.piece = piece;
    }

    public void setPosition(Position position) {
        this.position = position;
    }


}
