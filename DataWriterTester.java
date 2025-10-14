public class DataWriterTest {
    public static void main(String[] args) {
        DataWriter writer = new DataWriter();

        String userJson = "{\n" +
                "  \"title\": \"User Game Flow\",\n" +
                "  \"users\": [\n" +
                "    {\n" +
                "      \"username\": \"user_001\",\n" +
                "      \"email\": \"player1@example.com\",\n" +
                "      \"saves\": [\n" +
                "        {\n" +
                "          \"saveId\": \"a1b2c3d4-e5f6-7890-abcd-1234567890ef\",\n" +
                "          \"timestamp\": \"2025-10-07T13:30:00Z\",\n" +
                "          \"score\": 1500,\n" +
                "          \"timeUsed\": 300,\n" +
                "          \"hintsUsed\": 2,\n" +
                "          \"strikes\": 1\n" +
                "        },\n" +
                "        {\n" +
                "          \"saveId\": \"b2c3d4e5-f6a7-8901-bcde-2345678901fa\",\n" +
                "          \"timestamp\": \"2025-10-06T17:45:00Z\",\n" +
                "          \"score\": 950,\n" +
                "          \"timeUsed\": 300,\n" +
                "          \"hintsUsed\": 1,\n" +
                "          \"strikes\": 1\n" +
                "        }\n" +
                "      ]\n" +
                "    },\n" +
                "    {\n" +
                "      \"username\": \"guestUser\",\n" +
                "      \"email\": \"\",\n" +
                "      \"saves\": []\n" +
                "    }\n" +
                "  ]\n" +
                "}";

        String roomJson = "{\n" +
                "  \"title\": \"Room System Flow\",\n" +
                "  \"rooms\": [\n" +
                "    {\n" +
                "      \"roomId\": \"room_001\",\n" +
                "      \"isVisited\": true,\n" +
                "      \"puzzlesSolved\": [true, false, false],\n" +
                "      \"itemsTaken\": [\"key\", \"map\"],\n" +
                "      \"personalTracker\": 2\n" +
                "    },\n" +
                "    {\n" +
                "      \"roomId\": \"room_002\",\n" +
                "      \"isVisited\": false,\n" +
                "      \"puzzlesSolved\": [false, false],\n" +
                "      \"itemsTaken\": [],\n" +
                "      \"personalTracker\": 0\n" +
                "    },\n" +
                "    {\n" +
                "      \"roomId\": \"room_003\",\n" +
                "      \"isVisited\": true,\n" +
                "      \"puzzlesSolved\": [true, true],\n" +
                "      \"itemsTaken\": [\"flashlight\"],\n" +
                "      \"personalTracker\": 1\n" +
                "    }\n" +
                "  ]\n" +
                "}";

        writer.writeUsersRaw(userJson);
        writer.writeRoomsRaw(roomJson);

        System.out.println("✅ DataWriterTest: JSON files written successfully.");
    }
}
