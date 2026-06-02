package main

import "fmt"

func main() {

	var firstNumber int = 30
	var secondNumber int = 20

	fmt.Println(firstNumber + secondNumber)
	fmt.Println(firstNumber - secondNumber)
	fmt.Println(firstNumber / secondNumber)
	fmt.Println(firstNumber * secondNumber)

	var userName string = "Savidya Kolonne"
	fmt.Println(userName)

	var userScore float32 = 25.5
	var userBalance float64 = -25.523232

	fmt.Println(userBalance, userScore)

	fmt.Printf("Type: %T", userName)

	fmt.Println()

	var isUserFound bool = false
	fmt.Println(isUserFound)

	var firstN, secondN string = "Savidya", "Sasmitha"
	fmt.Println(firstN, secondN)

	// dont want to mention the type
	newUserName := "Savidya New"
	fmt.Println(newUserName)

	// it auto get the type of the variable
	fmt.Printf("%T", newUserName)

	//video 4 -------------------------------------------------------------------------------------

	//assign
	var userAge int = 24
	fmt.Println(userAge)

	//re-assign
	userAge = 25
	fmt.Println(userAge)

}
