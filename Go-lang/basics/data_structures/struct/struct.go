// Structures

// we use the struct same to classes .
//  go has no classes , in go we using struct

package main

import "fmt"

// we define the struct out of the main func
// struct start with the capitla letter (same as the classes)

type Person struct {
	FirstName string
	LastName  string
	Age       int
}

func main() {

	savidya := Person{
		FirstName: "Savidya",
		LastName:  "Kolonne",
		Age:       23,
	}

	fmt.Println(savidya)
	fmt.Printf(savidya.LastName)

	// fmt.Printf("The last name of the person is: ", savidya.LastName)
	// we use the %+v access the structures

	fmt.Printf("The last name of the person is: %+v", savidya.LastName)

	fmt.Println()

	savidya.Age = 24
	fmt.Println(savidya)
}
