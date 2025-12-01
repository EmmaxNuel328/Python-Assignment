package dsa;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TheMornarchsHotelTest {
    @Test
    public void testTheMornarchsHotelRoomsIsNotBooked_isEmptyEqualsTrue() {
        TheMornarchsHotel hotel = new TheMornarchsHotel();
        assertTrue(hotel.isEmpty());
    }

    @Test
    public void testTheMornarchsHotelRoomsIsBooked_isEmptyEqualsFalse() {
        TheMornarchsHotel hotel = new TheMornarchsHotel();
        assertTrue(hotel.isEmpty());

        hotel.setBooking("Emmanuel","sq","07066","Single");
        assertFalse(hotel.isEmpty());
    }
    @Test
    public void testTheMornarchsHotelRoomSetBookingXY_isEmptyEqualsFalse() {
        TheMornarchsHotel hotel = new TheMornarchsHotel();
        assertTrue(hotel.isEmpty());
        hotel.setBooking("Emmanuel","sq","07066","Single");
        hotel.setBooking("Cassy","es","07066","Single");
        assertFalse(hotel.isEmpty());
    }

    @Test
    public void testTheMornarchsHotelRoomRemoveBookingX_isEmptyEqualsTrue() {
        TheMornarchsHotel hotel = new TheMornarchsHotel();
        assertTrue(hotel.isEmpty());

        hotel.setBooking("Emmanuel","sq","07066","Single");
        hotel.removeBooking();
        assertTrue(hotel.isEmpty());
    }

    @Test
    public void testTheMornarchsHotelRoomRemoveBookingXY_isEmptyEqualsTrue() {
        TheMornarchsHotel hotel = new TheMornarchsHotel();
        assertTrue(hotel.isEmpty());

        hotel.setBooking("Emmanuel","sq","07066","Single");
        hotel.setBooking("Cassy","es","07066","Single");
        hotel.removeBooking();
        hotel.removeBooking();
        assertTrue(hotel.isEmpty());
    }

    @Test
    public void testViewAvailableRoom_returnsAvailableRoom() {
        TheMornarchsHotel  hotel = new TheMornarchsHotel();
        assertTrue(hotel.isEmpty());

        hotel.setBooking("Emmanuel","sq","07066","Single");
        hotel.setBooking("Cassy","es","07066","Single");
        hotel.w();
        hotel.w();
        hotel.viewAvailableRoom();
    }

}
