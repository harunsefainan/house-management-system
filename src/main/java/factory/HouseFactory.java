package factory;

import model.House;
import model.SummerHouse;
import model.Villa;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class HouseFactory {

    public static List<House> getHouseList() {
        return Arrays.asList(
                new House(100000, 120, 3, 1),
                new House(150000, 140, 4, 1),
                new House(200000, 160, 5, 2)
        );
    }

    public static List<House> getVillaList() {
        return Arrays.asList(
                new Villa(300000, 300, 6, 2),
                new Villa(350000, 320, 7, 3),
                new Villa(400000, 350, 8, 3)
        ).stream().map(v -> (House) v).collect(Collectors.toList());
    }

    public static List<House> getSummerHouseList() {
        return Arrays.asList(
                new SummerHouse(250000, 200, 4, 1),
                new SummerHouse(270000, 220, 5, 2),
                new SummerHouse(290000, 240, 6, 2)
        ).stream().map(s -> (House) s).collect(Collectors.toList());
    }

}
