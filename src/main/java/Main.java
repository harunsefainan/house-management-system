import factory.HouseFactory;
import model.House;
import service.HouseService;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        HouseService houseService = new HouseService();

        List<House> houses = HouseFactory.getHouseList();
        List<House> villas = HouseFactory.getVillaList();
        List<House> summerHouses = HouseFactory.getSummerHouseList();

        System.out.println("Total price of houses: " + houseService.getTotalPrice(houses));
        System.out.println("Total price of villas: " + houseService.getTotalPrice(villas));
        System.out.println("Total price of summer houses: " + houseService.getTotalPrice(summerHouses));
        System.out.println("Total price of all types: " + houseService.getTotalPriceOfAllTypes());

        System.out.println("Average square meter of houses: " + houseService.getAverageSquareMeter(houses));
        System.out.println("Average square meter of villas: " + houseService.getAverageSquareMeter(villas));
        System.out.println("Average square meter of summer houses: " + houseService.getAverageSquareMeter(summerHouses));
        System.out.println("Average square meter of all types: " + houseService.getAverageSquareMeterOfAllTypes());

        int rooms = 4;
        int livingRooms = 1;
        List<House> filteredHouses = houseService.filterHousesByRooms(houses, rooms, livingRooms);
        System.out.println("Filtered houses with " + rooms + " rooms and " + livingRooms + " living rooms: " + filteredHouses.size());
    }
}