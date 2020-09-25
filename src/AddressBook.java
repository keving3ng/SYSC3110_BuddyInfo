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
        BuddyInfo buddy = new BuddyInfo("Tom", "Carleton", "613");
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(buddy);
        addressBook.removeBuddy(buddy);
    }
}
