import java.util.ArrayList;

public class AddressBook {
    private ArrayList<BuddyInfo> BuddyList;

    public AddressBook(){
        BuddyList = new ArrayList<>();
    }

    public void addBuddy(BuddyInfo buddy){
        if (buddy != null) {
            BuddyList.add(buddy);
        }
    }

    public BuddyInfo removeBuddy(int index){
        if (index >= 0 && index < BuddyList.size()){
            return BuddyList.remove(index);
        }
        return null;
    }

    public static void main(String[] args) {
        System.out.println("This is a remote change.");
        BuddyInfo buddy = new BuddyInfo("Tom", "Carleton", "613");
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(buddy);
        addressBook.removeBuddy(0);
    }
}
