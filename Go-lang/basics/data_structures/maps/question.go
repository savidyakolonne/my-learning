package main

import "fmt"

func main() {

	contacts := map[string]string{
		"Alice":   "123-456-7890",
		"Bob":     "987-654-3210",
		"Charlie": "555-555-5555",
	}

	// print the map
	fmt.Println(contacts)

	// add a new number
	fmt.Println("add a new contact: ")
	contacts["David"] = "111-222-3333"
	fmt.Println(contacts)

	// update exisitng  contact
	fmt.Println("upate the bob: ")
	contacts["Bob"] = "222-333-4444"
	fmt.Println(contacts)

	// remove contact from the map
	fmt.Println("delete the charlie contact: ")
	delete(contacts, "Charlie")
	fmt.Println(contacts)

}
