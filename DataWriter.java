import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class DataWriter {
    private DataConstants constants;

    public DataWriter() {
        constants = new DataConstants();
    }

    public void writeUsersRaw(String json) {
        writeFile(constants.USERS_FILE, json);
    }

    public void writeRoomsRaw(String json) {
        writeFile(constants.ROOMS_FILE, json);
    }

    private void writeFile(String filename, String content) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            writer.write(content);
        } catch (IOException e) {
            System.out.println("Error writing file: " + filename);
        }
    }
}
