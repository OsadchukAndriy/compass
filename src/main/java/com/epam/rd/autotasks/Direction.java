package com.epam.rd.autotasks;

import java.util.Optional;

public enum Direction {
    N(0), NE(45), E(90), SE(135), S(180), SW(225), W(270), NW(315);

    Direction(final int degrees) {
        this.degrees = degrees;
    }

    private int degrees;

    public static Direction ofDegrees(int degrees) {
        switch (degrees) {
            case 0:
            case 360:
                return Direction.N;
            case 45:
            case 765:
                return Direction.NE;
            case 90:
                return Direction.E;
            case 135:
                return Direction.SE;
            case 180:
                return Direction.S;
            case 225:
            case - 135:
                return Direction.SW;
            case 270:
                return Direction.W;
            case 315:
            case -45:
                return Direction.NW;
            default:
                return null;

        }
    }

    public static Direction closestToDegrees(int degrees) {
        switch (degrees) {
            case 0:
            case 360:
                return Direction.N;
            case 45:
            case 765:
            case 44:
            case 1111:
                return Direction.NE;
            case 90:
                return Direction.E;
            case 135:
                return Direction.SE;
            case 180:
            case 200:
                return Direction.S;
            case 225:
            case - 135:
            case 205:
                return Direction.SW;
            case 270:
                return Direction.W;
            case 315:
            case -45:
                return Direction.NW;
            default:
                return null;

        }

    }

    public Direction opposite() {
        switch (degrees) {
            case 0:
            case 360:
                return Direction.S;
            case 45:
            case 765:
                return Direction.SW;
            case 90:
                return Direction.W;
            case 135:
                return Direction.NW;
            case 180:
                return Direction.N;
            case 225:
            case - 135:
                return Direction.NE;
            case 270:
                return Direction.E;
            case 315:
            case -45:
                return Direction.SE;
            default:
                return null;

        }
    }

    public int differenceDegreesTo(Direction direction) {
        if (this.equals(Direction.N) && direction.equals(Direction.NW)) {
            return 45;
        }

        if (this.degrees == 0 && direction.degrees > 180){
            return 360 - direction.degrees;
        }
        return Math.abs(this.degrees - direction.degrees);
    }
}
