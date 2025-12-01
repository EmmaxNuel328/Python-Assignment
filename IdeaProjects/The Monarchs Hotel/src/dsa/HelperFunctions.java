package dsa;
import java.util.Arrays;
public class HelperFunctions {
    public void removeOccupiedRooms(String[] roomNumbers, String[] occupiedRoom) {
        for (int index = 0; index < roomNumbers.length; index++) {
            for(int index2 = 0; index2 < occupiedRoom.length; index2++) {
                if(roomNumbers[index] == occupiedRoom[index2]) {
                    String[] availableRooms = {roomNumbers[index]};
                }
            }
        }

    }
}
