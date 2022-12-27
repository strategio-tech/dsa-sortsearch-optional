# DSA Assignment: Sorting & Searching (OPTIONAL)

Accepting the GitHub Assignment will create a repo with a series of challenges at `/src/main/java/tech.strategio` and its corresponding unit tests at `/src/test/java/tech.strategio`.

Each exercise contains a class with a method. Complete the methods in an IDE such that the unit tests pass. You should run your unit tests often, either through your Java IDE or through the command line (`gradle test`).

To submit the exercises, push a commit to GitHub. Automated tests will run, and you’ll see a green checkbox if ALL unit tests pass.

## Assignments

### E01 - Sort the array using the Bubble Sort Algorithm.

*OPTIONAL, Difficulty rating: Easy*

Write a function that takes in an array of integers and returns a sorted version of that array. Use the Bubble Sort algorithm to sort the array. 

If you're unfamiliar with Bubble Sort, we recommend [watching the video explanation](https://www.youtube.com/watch?v=xli_FI7CuzA) before starting to code.

- Optimal Space & Time Complexity

  - Best: O(n) time | O(1) space - where n is the length of the input array
  - Average: O(n^2) time | O(1) space - where n is the length of the input array
  - Worst: O(n^2) time | O(1) space - where n is the length of the input array

Sample Input
```
array = [141, 1, 17, -7, -17, -27]
```

Sample Output
```
[-27, -17, -7, 1, 17, 141]
```

#### Hints


<details>
  <summary>Hint</summary>
  
   Traverse the input array, swapping any two numbers that are out of order and keeping track of any swaps that you make. 
   
   Once you arrive at the end of the array, check if you have made any swaps; if not, the array is sorted and you are done; otherwise, repeat the steps laid out in this hint until the array is sorted.
</details>

### E02 - Sort the array using the Insertion Sort Algorithm.

*OPTIONAL, Difficulty rating: Easy*

Write a function that takes in an  array of integers and returns a sorted version of that array. Use the Insertion Sort algorithm to sort the array.

If you're unfamiliar with Insertion Sort, we recommend [watching the video explanation](https://www.youtube.com/watch?v=JU767SDMDvA) before starting to code.

- Optimal Space & Time Complexity

  - Best: O(n) time | O(1) space - where n is the length of the input array
  - Average: O(n^2) time | O(1) space - where n is the length of the input array
  - Worst: O(n^2) time | O(1) space - where n is the length of the input array

Sample Input
```
array = [141, 1, 17, -7, -17, -27]
```

Sample Output
```
[-27, -17, -7, 1, 17, 141]
```

#### Hints

<details>
  <summary>Hint</summary>
  Divide the input array into two subarrays in place. The first subarray should be sorted at all times and should start with a length of 1, while the second subarray should be unsorted. Iterate through the unsorted subarray, inserting all of its elements into the sorted subarray in the correct position by swapping them into place. Eventually, the entire array will be sorted.
</details>

### E03 - Sort the array using the Selection Sort Algorithm.

*OPTIONAL, Difficulty rating: Easy*

Write a function that takes in an  array of integers and returns a sorted version of that array. Use the Selection Sort algorithm to sort the array.

If you're unfamiliar with Selection Sort, we recommend [watching the video explanation](https://www.youtube.com/watch?v=g-PGLbMth_g) before starting to code.

- Optimal Space & Time Complexity

  - Best: O(n^2) time | O(1) space - where n is the length of the input array
  - Average: O(n^2) time | O(1) space - where n is the length of the input array
  - Worst: O(n^2) time | O(1) space - where n is the length of the input array

Sample Input
```
array = [141, 1, 17, -7, -17, -27]
```

Sample Output
```
[-27, -17, -7, 1, 17, 141]
```

#### Hints

<details>
  <summary>Hint</summary>
  Divide the input array into two subarrays in place. The first subarray should be sorted at all times and should start with a length of 0, while the second subarray should be unsorted. Find the smallest (or largest) element in the unsorted subarray and insert it into the sorted subarray with a swap. Repeat this process of finding the smallest (or largest) element in the unsorted subarray and inserting it in its correct position in the sorted subarray with a swap until the entire array is sorted.
</details>


- Many of these problems have corresponding LeetCode challenges or similar. Google is your friend, but try the problem first.

Good Luck! :rocket:
