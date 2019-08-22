package com.solerasoftware.decorator;

import java.util.ArrayList;
import java.util.List;

public class ApartmentRoom {
    private final int maxCapacity;
    private InteriorDesign interiorDesign;
    private String roomId;
    private List<DecorItem> decorItems = new ArrayList<>();

    public ApartmentRoom(String roomId, int maxCapacity, InteriorDesign interiorDesign) {
        this.interiorDesign = interiorDesign;
        this.maxCapacity = maxCapacity;
        this.roomId = roomId;
    }

    /**
     * TODO: finish implementation
     * add item to the room
     * @param decorItem
     * @return true if item was added; false - otherwise
     */
    public boolean addDecorItem(DecorItem decorItem) {
        if (!interiorDesign.doesMatchInterior(decorItem)) {
            return false;
        }

        decorItems.add(decorItem);
        return true;
    }

    /**
     * TODO: finish implementation
     * @param decorItem
     * @return true if item was in the room, false otherwise
     */
    public boolean removeDecorItem(DecorItem decorItem) {
        return decorItems.remove(decorItem);
    }

    /**
     * returns number of items in the room (current number of items, not max number)
     * @return
     */
    public int getNumberOfItems() {
        return decorItems.size();
    }
}
