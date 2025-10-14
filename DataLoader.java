import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class DataLoader {
    private DataConstants constants;

    public DataLoader() {
        constants = new DataConstants();
    }

    public String loadUsersRaw() {
        return readFile(constants.USERS_FILE);
    }

    public String loadRoomsRaw() {
        return readFile(constants.ROOMS_FILE);
    }

    private String readFile(String filename) {
        StringBuilder sb = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                sb.append(line.trim());
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + filename);
        }
        return sb.toString();
    }
}
