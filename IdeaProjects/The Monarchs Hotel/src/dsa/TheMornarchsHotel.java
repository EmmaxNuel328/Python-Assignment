package dsa;
import java.util.Arrays;
public class TheMornarchsHotel {
    HelperFunctions helper = new HelperFunctions();
    private String room;
    private String guestName;
    private String guestEmail;
    private String guestPhoneNumber;
    private String roomType;
    private String[] guestNames = new String[3];
    private String[] guestEmails = new String[3];
    private String[] guestPhoneNumbers = new String[3];
    private String[] roomTypes = new String[3];
    private String[] roomNumbers = {"102","233","222"};
    private String[] occupiedRooms = new String[roomNumbers.length];
    private String[] guestDetails  = new String[3];
    private int count;
    private int index = 0;
    private int secondIndex = 0;
    public boolean isEmpty() {
        if(count == 0){
            return true;
        };
        return false;
    }

    void setBooking(String guestName, String guestEmail, String guestPhoneNumber, String roomType) {
        this.guestName = guestName;
        this.guestEmail = guestEmail;
        this.guestPhoneNumber = guestPhoneNumber;
        this.roomType = roomType;
        guestNames[count] = this.guestName;
        guestEmails[count] = this.guestEmail;
        guestPhoneNumbers[count] = this.guestPhoneNumber;
        roomTypes[count] = this.roomType;
        count++;
    }


    void removeBooking(){
        guestNames[count] = null;
        guestEmails[count] = null;
        guestPhoneNumbers[count] = null;
        roomTypes[count] = null;
        --count;
    }
    void w(){
        String room = roomNumbers[index++];
        System.out.println("Room Number: " + room);
        occupiedRooms[secondIndex] = room;
        System.out.println(Arrays.toString(occupiedRooms));
        secondIndex++;
    }

    public void viewAvailableRoom() {
        for (int index = 0; index < roomNumbers.length; index++) {
            for(int index2 = 0; index2 < occupiedRooms.length; index2++) {
                if(roomNumbers[index] != occupiedRooms[index2]) {
                    String[] availableRooms = {roomNumbers[index]};
                    System.out.println(Arrays.toString(availableRooms));
                }
            }
        }

    }
}
