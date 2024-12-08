package com.stanislav.labwork3;

import java.util.Arrays;
import java.util.Comparator;

public class SeaBoatDemo {
    public static void main(String[] args) {
        SeaBoat[] boats = new SeaBoat[5];

        boats[0] = new SeaBoat("Альбатрос", "Яхта", 25.5, 10, 30.0);
        boats[1] = new SeaBoat("Моряк", "Катер", 15.0, 6, 25.0);
        boats[2] = new SeaBoat("Нептун", "Круїзний Лайнер", 200.0, 3000, 20.0);
        boats[3] = new SeaBoat("Дельфін", "Яхта", 25.5, 8, 35.0);
        boats[4] = new SeaBoat("Вітерець", "Катер", 15.0, 5, 28.0);

        /*
         сортуємо за length та maxSpeed, якщо що...
         так як в умові вказано "за одним з полів...", "а за іншим..."...
         тобто можна було обрати будь-які два...
         */
        Comparator<SeaBoat> boatComparator = new Comparator<SeaBoat>() {
            @Override
            public int compare(SeaBoat b1, SeaBoat b2) {
                int lengthCompare = Double.compare(b1.getLength(), b2.getLength());
                if (lengthCompare != 0) {
                    return lengthCompare;
                } else {
                    return Double.compare(b2.getMaxSpeed(), b1.getMaxSpeed());
                }
            }
        };

        Arrays.sort(boats, boatComparator);

        System.out.println("Відсортований масив човнів:");
        for (SeaBoat boat : boats) {
            System.out.println(boat);
        }

        SeaBoat targetBoat = new SeaBoat("Альбатрос", "Яхта", 25.5, 10, 30.0);

        boolean found = false;
        for (SeaBoat b : boats) {
            if (b.equals(targetBoat)) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Цільовий човен " + targetBoat.getName() + " знайдено у масиві.");
        } else {
            System.out.println("Цільовий човен " + targetBoat.getName() + " не знайдено у масиві.");
        }
    }
}