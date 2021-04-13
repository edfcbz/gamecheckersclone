package br.com.portfolio.tabuleiro.tabuleiro.classes;

import java.util.ArrayList;

import br.com.portfolio.tabuleiro.tabuleiro.classes.Quadro;
import br.com.portfolio.tabuleiro.tabuleiro.enumeration.Color;

public class Tabuleiro {

    private int axis_x;
    private int axis_y;

    private ArrayList<Quadro> quadroList = new ArrayList<>();

    public Tabuleiro() {
    }

    public Tabuleiro( int axis_x, int axis_y ) {
        setAxis_x( axis_x );
        setAxis_y( axis_y );
        createLinesAndRows( axis_x, axis_y );
    }

    public int getAxis_x() {
        return axis_x;
    }

    public void setAxis_x(int axis_x) {
        this.axis_x = axis_x;
    }

    public int getAxis_y() {
        return axis_y;
    }

    public void setAxis_y(int axis_y) {
        this.axis_y = axis_y;
    }

    public ArrayList<Quadro> getQuadroList() {
        return quadroList;
    }

    public void setQuadroList(ArrayList<Quadro> quadroList) {
        this.quadroList = quadroList;
    }

    public void createLinesAndRows(int axis_x, int axis_y){
        quadroList = new ArrayList<>();
        for( int x = 0; x < axis_x; x++ ){
            for( int y = 0; y < axis_y; y++ ){
                Position position = new Position(x,y);
                Quadro quadro = new Quadro(position, null);
                quadroList.add(quadro);
            }
        }
    }

    public void distribuirPecasNoTabuleiro(){
        quadroList.get(0).setPiece(new PieceGamer( Color.BLACK.hashCode() ));
        quadroList.get(2).setPiece(new PieceGamer( Color.BLACK.hashCode() ));
        quadroList.get(4).setPiece(new PieceGamer( Color.BLACK.hashCode() ));
        quadroList.get(6).setPiece(new PieceGamer( Color.BLACK.hashCode() ));
        quadroList.get(9).setPiece(new PieceGamer( Color.BLACK.hashCode() ));
        quadroList.get(11).setPiece(new PieceGamer( Color.BLACK.hashCode() ));
        quadroList.get(13).setPiece(new PieceGamer( Color.BLACK.hashCode() ));
        quadroList.get(15).setPiece(new PieceGamer( Color.BLACK.hashCode() ));
        quadroList.get(16).setPiece(new PieceGamer( Color.BLACK.hashCode() ));
        quadroList.get(18).setPiece(new PieceGamer( Color.BLACK.hashCode() ));
        quadroList.get(20).setPiece(new PieceGamer( Color.BLACK.hashCode() ));
        quadroList.get(22).setPiece(new PieceGamer( Color.BLACK.hashCode() ));

        quadroList.get(41).setPiece(new PieceGamer( Color.WHITE.hashCode() ));
        quadroList.get(43).setPiece(new PieceGamer( Color.WHITE.hashCode() ));
        quadroList.get(45).setPiece(new PieceGamer( Color.WHITE.hashCode() ));
        quadroList.get(47).setPiece(new PieceGamer( Color.WHITE.hashCode() ));
        quadroList.get(48).setPiece(new PieceGamer( Color.WHITE.hashCode() ));
        quadroList.get(50).setPiece(new PieceGamer( Color.WHITE.hashCode() ));
        quadroList.get(52).setPiece(new PieceGamer( Color.WHITE.hashCode() ));
        quadroList.get(54).setPiece(new PieceGamer( Color.WHITE.hashCode() ));
        quadroList.get(57).setPiece(new PieceGamer( Color.WHITE.hashCode() ));
        quadroList.get(59).setPiece(new PieceGamer( Color.WHITE.hashCode() ));
        quadroList.get(61).setPiece(new PieceGamer( Color.WHITE.hashCode() ));
        quadroList.get(63).setPiece(new PieceGamer( Color.WHITE.hashCode() ));
    }


}
