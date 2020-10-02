import java.util.ArrayList;

public class AddressBook {

    private ArrayList<BuddyInfo> myBuddies;
    public AddressBook(){
        myBuddies = new ArrayList<>() ;
    }

    public void AddBuddy(BuddyInfo aBuddy) {
        if(aBuddy != null){
            myBuddies.add(aBuddy) ;
        }
    }

    public BuddyInfo RemoveBuddy( int index ){
        if(index >= 0 && index<myBuddies.size()){
            return myBuddies.remove(index) ;
        }
        return null ;
    }

    public static void main(String[] args) {
        BuddyInfo buddy = new BuddyInfo( "Tom",  "Carleton",613) ;
        AddressBook addressBook = new AddressBook();
        addressBook.AddBuddy(buddy);
        addressBook.RemoveBuddy(0 ) ;
    }
}

/* hello world its ahmad again */

