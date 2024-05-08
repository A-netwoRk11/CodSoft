class Contact:
    
    def __init__(self,name,phone,email,address):
        self.name = name
        self.phone = phone
        self.email = email
        self.address = address
            
class ContactBook:
    
    def __init__(self):
        self.contacts = []
    
    def add_contact(self,name,phone,email,address):
        if name is None or phone is None:
            print("Error; Name and Phone number are required.")
            return
        for contact in self.contacts:
            if(name == contact.name or phone == contact.phone):
                print("\nContact already exists.")
                return
            
        contact = Contact(name,phone,email,address)
        self.contacts.append(contact)
        print("\nContact added successfully.")
        
    def view_contacts(self):
        flag=0
        if flag == 0:
            print("\nContact list is empty.")
            return
        for  contact in self.contacts:
            flag = 1
            print("-------------------------")
            print("Name:", contact.name)
            print("Phone:", contact.phone)
            print("Email:", contact.email)
            print("Address:", contact.address)
        
        print("-------------------------")
        return
                 
    def search_contacts(self,name):
        for contact in self.contacts:
            if (contact.name == name):
                print("-------------------------")
                print("Name:", contact.name)
                print("Phone:", contact.phone)
                print("Email:", contact.email)
                print("Address:", contact.address)
                return
        print("\nContact not found.")
        
        print("-------------------------")
            
    def update_contact(self,name,phone):
        for contact in self.contacts:
            if(contact.name == name and contact.phone == phone):
                contact.name = input("Enter new name: ")
                contact.phone = input("Enter new phone: ")
                contact.email = input("Enter new email: ")
                contact.address = input("Enter new address: ")
                print("Contact updated successfully.")
                return
        print("\nContact not found.")
        print("Enter the valid name and phone.")
            
    def delete_contact(self,name,email):
        for contact in self.contacts:
            if (contact.name == name and contact.email == email):
                self.contacts.remove(contact)
                print("Contact deleted successfully.")
                return
        print("\nEnter the valid name and email.")
    
def main():
    
    contactBook = ContactBook()
    
    while True:
        print("\nContact Management System")
        print("1. Add Contact")
        print("2. View Contacts")
        print("3. Search Contact")
        print("4. Update Contact")
        print("5. Delete Contact")
        print("6. Exit")
        
        choice = input("\nEnter your choice (1-6) : ")
        
        if choice == "1":
            print("\nAdd Contact")
            name=input("Enter name: ")
            phone=input("Enter phone: ")
            email=input("Enter email: ")
            address=input("Enter address: ")
            contactBook.add_contact(name,phone,email,address)
            
        elif choice == "2":
            print("\nView Contacts")
            contactBook.view_contacts()
            
        elif choice == "3":
            print("\nSearch Contact")
            name = input("Enter name want to search : ")
            contactBook.search_contacts(name)
            
        elif choice == "4":
            print("\nUpdate Contact")
            name = input("Enter name want to update : ")
            phone = input("Enter phone want to update : ")
            contactBook.update_contact(name,phone)
            
        elif choice == "5":
            print("\nDelete Contact")
            name = input("Enter name want to delete : ")
            email = input("Enter email want to delete : ")
            contactBook.delete_contact(name,email)
            
        elif choice == "6":
            break
        
        else:
            print("\nInvalid choice. Please try again.")
        
if __name__ == '__main__':
    main()