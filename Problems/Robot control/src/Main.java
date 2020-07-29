import java.util.Scanner;

class Move {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int x = scanner.nextInt();
//        int y = scanner.nextInt();
//        Direction direction = Direction.UP;
//        Robot robot = new Robot(x, y, direction);
//
//        int toX = scanner.nextInt();
//        int toY = scanner.nextInt();
//        moveRobot(robot, toX, toY);
//    }
    public static void moveRobot(Robot robot, int toX, int toY) {
        int top = toY - robot.getY();
        //System.out.println("top=" + top);
        switch (robot.getDirection()) {
            case RIGHT:
                robot.turnLeft();
                break;
            case LEFT:
                robot.turnRight();
                break;
            case DOWN:
                robot.turnRight();
                robot.turnRight();
                break;
        }
        
        if (top < 0) {
            robot.turnRight();
            robot.turnRight();
            top = -top;
        }
        
        for (int i = 0; i < top; i++) {
            robot.stepForward();
            //System.out.println(robot.getX() + " " + robot.getY() + " " + robot.getDirection());
        }
        
        int right = toX - robot.getX();
        //System.out.println("right=" + right);
        if (right > 0 && robot.getDirection().equals(Direction.UP) 
            || right < 0 && robot.getDirection().equals(Direction.DOWN)) {
            robot.turnRight();
        } else {
            robot.turnLeft();
        }
        if (right < 0) {
            right = -right;
        }
        
        for (int i = 0; i < right; i++) {
            robot.stepForward();
            //System.out.println(robot.getX() + " " + robot.getY() + " " + robot.getDirection());
        }
        
    }
}

//Don't change code below

enum Direction {
    UP(0, 1),
    DOWN(0, -1),
    LEFT(-1, 0),
    RIGHT(1, 0);

    private final int dx;
    private final int dy;

    Direction(int dx, int dy) {
        this.dx = dx;
        this.dy = dy;
    }

    public Direction turnLeft() {
        switch (this) {
            case UP:
                return LEFT;
            case DOWN:
                return RIGHT;
            case LEFT:
                return DOWN;
            case RIGHT:
                return UP;
            default:
                throw new IllegalStateException();
        }
    }

    public Direction turnRight() {
        switch (this) {
            case UP:
                return RIGHT;
            case DOWN:
                return LEFT;
            case LEFT:
                return UP;
            case RIGHT:
                return DOWN;
            default:
                throw new IllegalStateException();
        }
    }

    public int dx() {
        return dx;
    }

    public int dy() {
        return dy;
    }
}

class Robot {
    private int x;
    private int y;
    private Direction direction;

    public Robot(int x, int y, Direction direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    public void turnLeft() {
        direction = direction.turnLeft();
    }

    public void turnRight() {
        direction = direction.turnRight();
    }

    public void stepForward() {
        x += direction.dx();
        y += direction.dy();
    }

    public Direction getDirection() {
        return direction;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
