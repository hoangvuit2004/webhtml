package project7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class ContactModel {
private LinkedList<Contact> listContact;
public ContactModel() {
	listContact = new LinkedList<>();
	creListContact();
}
public void addContact(Contact contact) {
	listContact.add(contact);
}
public void creListContact() {
	Contact contact1 = new Contact("Nguyen Bui Hoang Vu", "0868032463", "vufit2004@icloud.com");
	Contact contact2 = new Contact("Nguyen Bui Hoang Dung", "0907440304", "vufit2@icloud.com");
	Contact contact3 = new Contact("Nguyen Si Bach Tien", "0907053618", "vufit204@icloud.com");
	Contact contact4 = new Contact("Nguyen Bui Vu Vu", "0779773740", "vufit200@icloud.com");
	Contact contact5 = new Contact("Nguyen Thi Truc Trinh", "0123456789", "vufit004@icloud.com");
	Contact contact6 = new Contact("Nguyen Viet Minh Quan", "0987655678", "vufit04@icloud.com");
  addContact(contact1);
  addContact(contact2);
  addContact(contact3);
  addContact(contact4);
  addContact(contact5);
  addContact(contact6);
}
public LinkedList<Contact> getContact(){
	return listContact;
}
public void sortContact() {
	Collections.sort(listContact,new Comparator<Contact>() {

		@Override
		public int compare(Contact o1, Contact o2) {
			// TODO Auto-generated method stub
			return o1.getName().compareTo(o2.getName());
		}
		
	});
}
public Contact searchContact(String name, String phone){
	Contact contactSearch = null;
	for (Contact contact : listContact) {
		if(contact.getName().equals(name) && contact.getPhone().equals(phone)) {
			contactSearch = contact;
			break;
		}
	}
	return contactSearch;
	
	
}
}
