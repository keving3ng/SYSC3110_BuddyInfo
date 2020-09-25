import java.util.List;

public class AddressBook {
    private List<BuddyInfo> BuddyList;

    public boolean addBuddy(BuddyInfo buddy){
        return BuddyList.add(buddy);
    }

    public void removeBuddy(BuddyInfo buddy){
        BuddyList.remove(buddy);
    }

    public static void main(String[] args) {
        System.out.println("AddressBook");
    }
}
