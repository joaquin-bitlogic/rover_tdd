package org.example;

import java.util.Objects;

public class MarsRover {

    private int x;
    private int y;
    private String direction;

    public MarsRover(int x, int y, String direction){
        this.y = y;
        this.x = x;
        this.direction = direction;
    }

    public long getXCoordinate() {
        return this.x;
    }

    public long getYCoordinate() {
        return this.y;
    }

    public String getDirection() {
        return direction;
    }

    public boolean isInPosition(int x, int y, String direction) {
        return this.x == x && this.y == y && Objects.equals(this.direction, direction);
    }

    public void move(String commands) {
        for(char command : commands.toCharArray())
            switch (command){
                case 'F':
                    this.y++;
                    break;
                case 'B':
                    this.y--;
                    break;
                case 'L':
                    this.direction = turnLeft(this.direction);
                    break;
                case 'R':
                    this.direction = turnRight(this.direction);
                    break;
            }
    }

    private String turnLeft(String origin){
        String destination = origin;
        switch (origin){
            case "N":
                destination = "W";
                break;
            case "S":
                destination = "E";
                break;
            case "E":
                destination = "N";
                break;
            case "W":
                destination = "S";
                break;
        }

        return destination;
    }

    private String turnRight(String origin){
        String destination = origin;
        switch (origin){
            case "N":
                destination = "E";
                break;
            case "S":
                destination = "W";
                break;
            case "E":
                destination = "S";
                break;
            case "W":
                destination = "N";
                break;
        }

        return destination;
    }
}
