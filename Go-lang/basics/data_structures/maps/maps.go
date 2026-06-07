package main

import "fmt"

func main() {

	// declare and initialize a map
	//  key and value (want to be unique)
	studentAges := map[string]int{
		"Alice":   20,
		"Charlie": 14,
	}

	studentAges["Savidya"] = 23
	studentAges["Tom"] = 12
	studentAges["Bob"] = 34

	fmt.Println(studentAges)

	// access the values
	fmt.Println(studentAges["Savidya"])

	// remove the values
	delete(studentAges, "Bob")
	fmt.Println(studentAges)

	// return the 0,  when print a not value in the map
	fmt.Println(studentAges["Kolonne"])
}
