import random

def main():
    win=0
    loose=0
    tie=0
    
    play = "y"
    while play == "y":
        
        winKey = {
            "rock": "scissors",
            "paper": "rock",
            "scissors": "paper"
        }

        userChoice = input("\nEnter your choice (rock, paper, scissors): ")
        computerChoice = random.choice(["rock", "paper", "scissors"])
        
        print(f"You chose: {userChoice}")
        
        try:
            print(f"Computer chose: {computerChoice}")
            if userChoice == computerChoice:
                print("\nIt's a tie!")
                tie+=1
            elif winKey[userChoice] == computerChoice:
                print("\nYou win!")
                win+=1
            else:
                print("\nYou loose!")
                loose+=1

            print(f"Wins: {win}")
            print(f"Loses: {loose}")
            print(f"Ties: {tie}")

            play = input("\nWant to play again? (y/n) : ")
            
        except KeyError:
            print("\nInvalid choice. Please try again.")
            play=input("\nWant to play again? (y/n) : ")
        
if __name__ == "__main__":
    main()