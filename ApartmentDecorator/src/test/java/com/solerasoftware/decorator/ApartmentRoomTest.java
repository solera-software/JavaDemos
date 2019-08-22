package com.solerasoftware.decorator;

import com.solerasoftware.decorator.enums.Size;
import com.solerasoftware.decorator.enums.Style;
import org.junit.Test;

import static org.junit.Assert.*;

public class ApartmentRoomTest {

    @Test
    public void canAddDecorItem() {
        // Given
        // Use a lambda, in place of another implementation of InteriorDesign to keep
        // The test concise.
        ApartmentRoom room = new ApartmentRoom("dining", 8, decorItem -> true);

        // When
        boolean result = room.addDecorItem(new DummyDecorItem());

        // Then
        assertTrue(result);
    }

    @Test
    public void cannotAddDecorItem() {
        // Given
        ApartmentRoom room = new ApartmentRoom("dining", 8, decorItem -> false);

        // When
        boolean result = room.addDecorItem(new DummyDecorItem());

        // Then
        assertFalse(result);
    }

    @Test
    public void addingDecorItemIncreasesCountByOne() {
        ApartmentRoom room = new ApartmentRoom("dining", 8, decorItem -> true);
        int initialCount = room.getNumberOfItems();

        // When
        room.addDecorItem(new DummyDecorItem());

        // Then
        assertEquals(initialCount + 1, room.getNumberOfItems());
    }

    @Test
    public void removeExistingDecorItem() {
        // Given
        DecorItem item = new DummyDecorItem();
        ApartmentRoom room = new ApartmentRoom("dining", 8, decorItem -> true);
        room.addDecorItem(item);

        // When
        boolean wasRemoved = room.removeDecorItem(item);

        // Then
        assertTrue(wasRemoved);
    }

    @Test
    public void removeExistingDecorItemReducesItemCount() {
        // Given
        DecorItem item = new DummyDecorItem();
        ApartmentRoom room = new ApartmentRoom("dining", 8, decorItem -> true);
        room.addDecorItem(item);
        int initialCount = room.getNumberOfItems();

        // When
        room.removeDecorItem(item);

        // Then
        assertEquals(initialCount - 1, room.getNumberOfItems());
    }

    @Test
    public void cannotRemoveNotExistentDecorItem() {
        // Given
        ApartmentRoom room = new ApartmentRoom("dining", 8, decorItem -> true);
        DecorItem item = new DummyDecorItem();

        // When
        boolean wasRemoved = room.removeDecorItem(item);

        // Then
        assertFalse(wasRemoved);
    }

    // Do nothing decor item to used in tests above
    // A lambda does not make sense here since DecorItem has two methods.
    // This dummy implementation also is used in two places so an
    // actual, reusable class makes a little more sense.
    private class DummyDecorItem implements DecorItem {

        @Override
        public Size getItemSize() {
            return null;
        }

        @Override
        public Style getItemStyle() {
            return null;
        }
    }
}
