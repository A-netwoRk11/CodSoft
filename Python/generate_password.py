import random

mainString = 'ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()_+-=}{[]|;:,.<>?'

def generate_password(length):
    password=''
    
    while length != 0 :
        password=password+random.choice(mainString)
        length=length-1
        
    print(password)
    
def main():
    try:
        length=input("Enter length of password : ")
        length=int(length)
        
        if length<=0:
            raise ValueError
        else:
            generate_password(length)
        
    except ValueError:
        print("Please enter a valid number")
    
if __name__=='__main__':
    main()