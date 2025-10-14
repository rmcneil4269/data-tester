public class DataLoaderTest {
    public static void main(String[] args) {
        DataLoader loader = new DataLoader();

        String users = loader.loadUsersRaw();
        String rooms = loader.loadRoomsRaw();

        System.out.println("✅ DataLoaderTest: Loaded Users JSON:");
        System.out.println(users);
        System.out.println("\n✅ DataLoaderTest: Loaded Rooms JSON:");
        System.out.println(rooms);
    }
}
