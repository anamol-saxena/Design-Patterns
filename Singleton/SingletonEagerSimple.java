

public class SingletonEagerSimple {

    public static void main(String[]args) {
        String[] ex = {"122.121.0.1,2016-11-03 11:41:19,Buy wool coats for your pets",
    "96.3.199.11,2016-10-15 20:18:31,2017 Pet Mittens",
    "122.121.0.250,2016-11-01 06:13:13,The Best Hollywood Coats",
    "82.1.106.8,2016-11-12 23:05:14,Buy wool coats for your pets",
    "92.130.6.144,2017-01-01 03:18:55,Buy wool coats for your pets",
    "92.130.6.145,2017-01-01 03:18:55,2017 Pet Mittens"};
        for (String sub : ex) {
            String ip = sub.split(" ",2)[0].split;
            System.out.println(ip);
        }
    }
}