package fr.alexandrebertrand.tetris.models;

import fr.alexandrebertrand.tetris.models.abstracts.Piece;

import java.awt.Point;
import java.util.ArrayList;
import java.util.List;

/**
 * C piece type
 *
 * @author Alexandre Bertrand
 */
public class PieceC extends Piece {

    /*
     * Attributes
     */

    /** Rotations of the C piece type */
    private static List<List<Point>> rotationOperations;

    /** Initial position of the C piece type */
    private static List<Point> initialPoints;

    /*
     * Constructor
     */

    /**
     * Main constructor of the C piece type
     * 
     * @param xCases Width of the grid (number of cases on the x axe)
     * @param yCases Height of the grid (number of cases on the y axe)
     */
    public PieceC(int xCases, int yCases) {
        super(xCases, yCases);
        this.colorValue = 3;
    }

    /*
     * Methods
     */

    /**
     * Initialize rotation operations of the C piece type
     */
    public static void initRotationOperations() {
        PieceC.rotationOperations = new ArrayList<>();
        final List<Point> a = new ArrayList<>();
        a.add(new Point(1, 1));
        a.add(new Point(0, 0));
        a.add(new Point(-1, -1));
        a.add(new Point(-2, 0));

        final List<Point> b = new ArrayList<>();
        b.add(new Point(1, -1));
        b.add(new Point(0, 0));
        b.add(new Point(-1, 1));
        b.add(new Point(0, 2));

        PieceC.rotationOperations.add(a);
        PieceC.rotationOperations.add(b);
        PieceC.rotationOperations.add(Piece.getInversedPoint(a));
        PieceC.rotationOperations.add(Piece.getInversedPoint(b));
    }

    /**
     * Initialize the initial position of the C piece type
     */
    public static void initInitialPosition() {
        PieceC.initialPoints = new ArrayList<>();
        PieceC.initialPoints.add(new Point(0, 1));
        PieceC.initialPoints.add(new Point(1, 1));
        PieceC.initialPoints.add(new Point(2, 1));
        PieceC.initialPoints.add(new Point(2, 0));
    }

    /*
     * Getters
     */

    /**
     * Get rotation operations of the C piece type
     * 
     * @return Rotation operation
     */
    @Override
    protected List<List<Point>> getRotationOperations() {
        return PieceC.rotationOperations;
    }

    /**
     * Get the initial position of the C piece type
     * 
     * @return Initial position
     */
    @Override
    protected List<Point> getInitialPosition() {
        return PieceC.initialPoints;
    }

}
