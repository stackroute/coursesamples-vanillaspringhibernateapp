package com.vanilla.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Point {
    @Id
    private int pointId;
    private int pointX;
    private int pointY;

    public Point() {
    }

    public Point(int pointId, int pointX, int pointY) {
        this.pointId = pointId;
        this.pointX = pointX;
        this.pointY = pointY;
    }

    public int getPointId() {
        return pointId;
    }

    public void setPointId(int pointId) {
        this.pointId = pointId;
    }

    public int getPointX() {
        return pointX;
    }

    public void setPointX(int pointX) {
        this.pointX = pointX;
    }

    public int getPointY() {
        return pointY;
    }

    public void setPointY(int pointY) {
        this.pointY = pointY;
    }

    @Override
    public String toString() {
        return "Point{" +
                "pointId=" + pointId +
                ", pointX=" + pointX +
                ", pointY=" + pointY +
                '}';
    }
}
