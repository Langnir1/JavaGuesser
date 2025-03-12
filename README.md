# JavaGuesser
Summary, This code brings up a menu where if the user inputs 0, the code ends, 1, the human guesses a random number between 1-100, 2, The computer guesses what number the user thinks of.

<ins>main</ins>
- main will call menu

<ins>menu</ins>
- This will be a while loop that closes on "quit"
- Provide user three options: 0, 1, 2 (quit, humanGuesser, computerGuesser)
- Ask user for response
- User response leads to designated option

<ins>humanGuesser</ins>
- variable number = random int(1-100)
- Start while loop (keepGoing = true) until guess == number
- variable count = 0; this will keep track of the number of guesses
- ask user for guess
- if user guess > number{
	print("Too high!");
	count++;
}
- if user guess < number{
	print("Too low!");
	count++;
}
- if user guess == number{
	print("Correct, good Job! You got it in " + count + " tries!);
}

<ins>computerGuesser</ins>
