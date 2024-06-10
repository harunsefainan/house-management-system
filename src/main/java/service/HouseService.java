package service;

import model.House;
import factory.HouseFactory;

import java.util.List;

public class HouseService {

    public double getTotalPrice(List<? extends House> houses) {
        return houses.stream().mapToDouble(House::getPrice).sum();
    }

    public double getAverageSquareMeter(List<? extends House> houses) {
        return houses.stream().mapToDouble(House::getSquareMeter).average().orElse(0);
    }

    public List<House> filterHousesByRooms(List<? extends House> houses, int rooms, int livingRooms) {
        return (List<House>) houses.stream()
                .filter(h -> h.getNumberOfRooms() == rooms && h.getNumberOfLivingRooms() == livingRooms)
                .toList();
    }

    public double getTotalPriceOfAllTypes() {
        double total = 0;
        total += getTotalPrice(HouseFactory.getHouseList());
        total += getTotalPrice(HouseFactory.getVillaList());
        total += getTotalPrice(HouseFactory.getSummerHouseList());
        return total;
    }

    public double getAverageSquareMeterOfAllTypes() {
        double totalSquareMeters = 0;
        int count = 0;

        List<List<House>> allHouses = List.of(
                HouseFactory.getHouseList(),
                HouseFactory.getVillaList(),
                HouseFactory.getSummerHouseList()
        );

        for (List<House> houseList : allHouses) {
            totalSquareMeters += houseList.stream().mapToDouble(House::getSquareMeter).sum();
            count += houseList.size();
        }

        return totalSquareMeters / count;
    }
}
