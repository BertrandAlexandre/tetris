package fr.alexandrebertrand.tetris.model.piece.type;

import fr.alexandrebertrand.tetris.model.piece.Piece;
import fr.alexandrebertrand.tetris.util.graphic.*;

import java.awt.Point;
import java.util.ArrayList;
import java.util.List;

/**
 * B piece type
 *
 * @author Alexandre Bertrand
 */
public class PieceB extends Piece {

    /*
     * Attributes
     */

    /** Rotations of the B piece type */
    private static List<List<Point>> rotationOperations;

    /** Initial position of the B piece type */
    private static List<Point> initialPoints;

    /*
     * Constructors
     */

    /**
     * Main constructor of the B piece type
     */
    public PieceB() {
        super(ColorType.BLUE);
    }

    /**
     * Initialize the B piece type
     */
    static {
        // Initialize rotation operations of the B piece type
        PieceB.rotationOperations = new ArrayList<>();
        final List<Point> a = new ArrayList<>();
        a.add(new Point(0, 2));
        a.add(new Point(1, 1));
        a.add(new Point(0, 0));
        a.add(new Point(-1, -1));

        final List<Point> b = new ArrayList<>();
        b.add(new Point(2, 0));
        b.add(new Point(1, -1));
        b.add(new Point(0, 0));
        b.add(new Point(-1, 1));

        PieceB.rotationOperations.add(a);
        PieceB.rotationOperations.add(b);
        PieceB.rotationOperations.add(Piece.getInversedPoint(a));
        PieceB.rotationOperations.add(Piece.getInversedPoint(b));

        // Initialize the initial position of the B piece type
        PieceB.initialPoints = new ArrayList<>();
        PieceB.initialPoints.add(new Point(0, 0));
        PieceB.initialPoints.add(new Point(0, 1));
        PieceB.initialPoints.add(new Point(1, 1));
        PieceB.initialPoints.add(new Point(2, 1));
    }

    /*
     * Getters & Setters
     */

    /**
     * Get rotation operations of the B piece type
     * 
     * @return Rotation operation
     */
    @Override
    protected List<List<Point>> getRotationOperations() {
        return PieceB.rotationOperations;
    }

    /**
     * Get the initial position of the B piece type
     * 
     * @return Initial position
     */
    @Override
    protected List<Point> getInitialPosition() {
        return PieceB.initialPoints;
    }

}
