public class BuddyInfo {

    public BuddyInfo(String name, String address, String phoneNumber) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    private String name;
    private String address;
    private String phoneNumber;


    public static void main(String[] args) {
        System.out.println("Hello world!");

        BuddyInfo buddy = new BuddyInfo("Homer", "15 Home Way", "6131111111");
        System.out.println("Hello " + buddy.getName());
    }
}
