# Krish Mehta
# Lab 8

import random

number = random.randint(0, 9)

while True:
    guess = int(input("Guess a number between 0 and 9: "))

    if guess == number:
        print("You guessed the number! You win!")
        break

    elif guess < number:
        print("INCORRECT")
        print("guess is too low")

    else:
        print("INCORRECT")
        print("guess is too high")


for i in range(10):
    print("An i for an i makes the whole world blind")

count = 0

while count < 10:
    print("I love while loops")
    count += 1

