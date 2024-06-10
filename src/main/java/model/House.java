package model;

public class House {
    private double price;
    private double squareMeter;
    private int numberOfRooms;
    private int numberOfLivingRooms;

    public House(double price, double squareMeter, int numberOfRooms, int numberOfLivingRooms) {
        this.price = price;
        this.squareMeter = squareMeter;
        this.numberOfRooms = numberOfRooms;
        this.numberOfLivingRooms = numberOfLivingRooms;
    }

    public double getPrice() {
        return price;
    }

    public double getSquareMeter() {
        return squareMeter;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public int getNumberOfLivingRooms() {
        return numberOfLivingRooms;
    }

    @Override
    public String toString() {
        return "House{" +
                "price=" + price +
                ", squareMeter=" + squareMeter +
                ", numberOfRooms=" + numberOfRooms +
                ", numberOfLivingRooms=" + numberOfLivingRooms +
                '}';
    }
}
