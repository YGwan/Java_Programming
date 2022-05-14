package Fifth_2;

import java.util.*;

class Location {
    String city;
    double longitude;
    double latitude;

    public Location(String city, double longitude, double latitude) {
        this.city = city;
        this.longitude = longitude;
        this.latitude = latitude;
    }

    public String getCity() {
        return city;
    }
    public double getLongitude() {
        return longitude;
    }
    public double getLatitude() {
        return latitude;
    }
}

public class P7 {

    private final Scanner scanner = new Scanner(System.in);
    private final HashMap<String, Location> h = new HashMap<>();

    private void read() {
        System.out.println("Enter City name, latitude, longitude");
        for (int i = 0; i < 4; i++) {
            System.out.print(">> ");
            String text = scanner.nextLine();
            StringTokenizer st = new StringTokenizer(text, ",");
            String city = st.nextToken().trim();
            double logitude = Double.parseDouble(st.nextToken().trim());
            double latitude = Double.parseDouble(st.nextToken().trim());

            Location location = new Location(city, logitude, latitude);
            h.put(city, location);
        }
    }

    private void printAll() {
        Set<String> key = h.keySet();
        Iterator<String> it = key.iterator();
        System.out.println("---------------------------");
        while (it.hasNext()) {
            String city = it.next();
            Location loc = h.get(city);
            System.out.print(loc.getCity() + "\t");
            System.out.print(loc.getLongitude() + "\t");
            System.out.println(loc.getLatitude());
        }
        System.out.println("---------------------------");
    }

    private void processQuery() {
        while (true) {
            System.out.print("City name >> ");
            String city = scanner.nextLine(); // 도시 이름 입력
            if (city.equals("exit"))
                return; // 종료

            Location loc = h.get(city); // 해시맵에서 도시를 키로 검색
            if (loc == null) { // 도시가 해시맵에 없다면
                System.out.println("Location of " + city + " is unknown.");
            } else { // 해시맵에서 검색된  Student 객체
                System.out.print(loc.getCity() + "\t");
                System.out.print(loc.getLongitude() + "\t");
                System.out.println(loc.getLatitude());
            }
        }
    }

    public void run() {
        read();
        printAll();
        processQuery();
    }

    public static void main (String[] args) {
        P7 p7 = new P7();
        p7.run();
    }
}
