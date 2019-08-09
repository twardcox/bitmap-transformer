# Data Structures & Algorithms File Structure for Code 401: Java

This repo shows the expected file structure for Code 401: Java data structures & algorithms. The command `gradle init --type java-library` was run inside of the `code401challenges` directory, and that `code401challenges` directory is the root from which I open IntelliJ.

This root README is where the links to daily work live.

## Week 1 Challenges
## [Day 1: Reverse an Array](./code401challenges/src/main/java/code401challenges/ArrayReverse.java)  
  
## Paired Programming Partner
* Peter Lee

  ### Challenge Summary
  Write a function called reverseArray which takes an array as an argument. Without utilizing any of the built-in methods available to your language, return an array with elements in reversed order.
  
  #### Challenge Description
  Write a function called reverseArray which takes an array as an argument. Without utilizing any of the built-in methods available to your language, return an array with elements in reversed order.
  
  #### Approach & Efficiency
  We took the iterate through and replace approach. We have not covered Big O time yet.
  
  #### Solution
  ![Alt text](./assets/array_reverse.jpg?raw=true 'Reverse Array')
  
  
## [Day 2: Shift an Array](./code401challenges/src/main/java/code401challenges/ArraryShift.java)
  
## Paired Programming Partner
* Kevin Couture

  ### Challenge Summary
  Write a function called insertShiftArray which takes in an array and the value to be added. Without utilizing any of the built-in methods available to your language, return an array with the new value added at the middle index.
  
  #### Challenge Description
  Write a function called insertShiftArray which takes in an array and the value to be added. Without utilizing any of the built-in methods available to your language, return an array with the new value added at the middle index.
  
  #### Approach & Efficiency
  We chose to create a new array and iterate over old inserting into the new. We have not covered Big O time yet.
  
  #### Solution
  ![Alt text](./assets/array_shift.jpg?raw=true 'Shift Array')

  
## [Day 3: Binary Search](./code401challenges/src/main/java/code401challenges/BinarySearch.java)

## Paired Programming Partner
* Melfi Perez
  
  ### Challenge Summary
  Write a function called BinarySearch which takes in 2 parameters: a sorted array and the search key. Without utilizing any of the built-in methods available to your language, return the index of the array’s element that is equal to the search key, or -1 if the element does not exist.
  
  #### Challenge Description
  Write a function called BinarySearch which takes in 2 parameters: a sorted array and the search key. Without utilizing any of the built-in methods available to your language, return the index of the array’s element that is equal to the search key, or -1 if the element does not exist.
  
  #### Approach & Efficiency
  * First attempt used recursion but required the use of a built in function. 
  * we got close on the second attempt but needed to do some research online.
  * https://dzone.com/articles/binary-searching-in-java-without-recursion
  
  #### Solution
  ![Alt text](./assets/binary_search.jpg?raw=true 'Binary Search')


