package org.lenny.structural.flyweight;

import java.util.Random;

/*
* Reduces memory usage by sharing common parts of objects instead of creating new ones for every instance.
*
* Examples:
* Document Editor – Shares character or font formatting objects across large documents to avoid duplication.
* UI Icon Rendering – Reuses the same icon or image objects in large lists or dashboards to save memory.
* Data Caching – Stores and reuses frequently accessed configuration or metadata objects across requests.
* Map Display Systems – Shares graphical representations of roads, markers, or tiles instead of creating new ones per view.
* Product Catalog – Reuses product data (e.g., name, description) across multiple views or sessions in e-commerce apps.
* */
public class Client {
    public static void main(String[] args) {
        int toDraw = 1000;
        Army army = new Army();
        FighterRank currentRank;
        Random random = new Random();

        for (int i = 0; i < toDraw; i++) {
            currentRank = switch (random.nextInt(3)) {
                case 0 -> FighterRank.PRIVATE;
                case 1 -> FighterRank.SERGEANT;
                default -> FighterRank.MAJOR;
            };
            army.spawnFighter(currentRank);
        }

        army.drawArmy();
    }
}
