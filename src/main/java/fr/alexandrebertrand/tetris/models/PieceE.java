package fr.alexandrebertrand.tetris.models;

import fr.alexandrebertrand.tetris.models.abstracts.Piece;

import java.awt.Point;
import java.util.ArrayList;
import java.util.List;

/**
 * E piece type
 *
 * @author Alexandre Bertrand
 */
public class PieceE extends Piece {

    /*
     * Attributes
     */

    /** Rotations of the E piece type */
    private static List<List<Point>> rotationOperations;

    /** Initial position of the E piece type */
    private static List<Point> initialPoints;

    /*
     * Constructor
     */

    /**
     * Main constructor of the E piece type
     * @param xCases Width of the grid (number of cases on the x axe)
     * @param yCases Height of the grid (number of cases on the y axe)
     */
    public PieceE(int xCases, int yCases) {
        super(xCases, yCases);
        this.colorValue = 5;
    }

    /*
     * Methods
     */

    /**
     * Initialize rotation operations of the F piece type
     */
    public static void initRotationOperations() {
        PieceE.rotationOperations = new ArrayList<>();
        final List<Point> a = new ArrayList<>();
        a.add(new Point(0, 2));
        a.add(new Point(-1, 1));
        a.add(new Point(0, 0));
        a.add(new Point(-1, -1));

        final List<Point> b = new ArrayList<>();
        b.add(new Point(2, 0));
        b.add(new Point(1, 1));
        b.add(new Point(0, 0));
        b.add(new Point(-1, 1));

        PieceE.rotationOperations.add(a);
        PieceE.rotationOperations.add(b);
        PieceE.rotationOperations.add(Piece.getInversedPoint(a));
        PieceE.rotationOperations.add(Piece.getInversedPoint(b));
    }

    /**
     * Initialize the initial position of the F piece type
     */
    public static void initInitialPosition() {
        PieceE.initialPoints = new ArrayList<>();
        PieceE.initialPoints.add(new Point(0, 0));
        PieceE.initialPoints.add(new Point(1, 0));
        PieceE.initialPoints.add(new Point(1, 1));
        PieceE.initialPoints.add(new Point(2, 1));
    }

    /*
     * Getters
     */

    /**
     * Get rotation operations of the F piece type
     * @return Rotation operation
     */
    @Override
    protected List<List<Point>> getRotationOperations() {
        return PieceE.rotationOperations;
    }

    /**
     * Get the initial position of the F piece type
     * @return Initial position
     */
    @Override
    protected List<Point> getInitialPosition() {
        return PieceE.initialPoints;
    }

}
