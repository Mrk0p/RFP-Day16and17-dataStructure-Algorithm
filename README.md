# RFP-Day16and17-dataStructure-Algorithm
Data structure and Algorithms question 

Algorithm Programs

1. Write static functions to return all permutations of a String using iterative method and
Recursion method. Check if the arrays returned by two string functions are equal.

2. **Binary Search the Word from Word List**
a. Desc -> Read in a list of words from File. Then prompt the user to enter a word to
search the list. The program reports if the search word is found in the list.
b. I/P -> read in the list words comma separated from a File and then enter the word
to be searched
c. Logic -> Use Arrays to sort the word list and then do the binary search
d. O/P -> Print the result if the word is found or not


3. Insertion Sort**
a. Desc -> Reads in strings and prints them in sorted order using insertion sort.
b. I/P -> read in the list words
c. Logic -> Use Insertion Sort to sort the words in the String array
d. O/P -> Print the Sorted List


4. Bubble Sort
a. Desc -> Reads in integers prints them in sorted order using Bubble Sort
b. I/P -> read in the list ints
c. O/P -> Print the Sorted List


5. Merge Sort - Write a program to do Merge Sort of list of Strings.
a. Logic -> To Merge Sort an array, we divide it into two halves, sort the two halves
independently, and then merge the results to sort the full array. To sort a[lo, hi),
we use the following recursive strategy:
b. Base case: If the subarray length is 0 or 1, it is already sorted.
c. Reduction step: Otherwise, compute mid = lo + (hi - lo) / 2, recursively sort the
two subarrays a[lo, mid) and a[mid, hi), and merge them to produce a sorted
result.


6. An Anagram Detection Example
a. Desc -> One string is an anagram of another if the second is simply a
rearrangement of the first. For example, 'heart' and 'earth' are anagrams...
b. I/P -> Take 2 Strings as Input such abcd and dcba and Check for Anagrams
c. O/P -> The Two Strings are Anagram or not....


7. Take a range of 0 - 1000 Numbers and find the Prime numbers in that range.

  
8. Extend the above program to find the prime numbers that are Anagram and
Palindrome


9. Rewrite Use Generics for Search and Sort Algorithms
    
10. Question to find your number
a. Desc -> takes a command-line argument N, asks you to think of a number
between 0 and N-1, where N = 2^n, and always guesses the answer with n
questions.
b. I/P -> the Number N and then recursively ask true/false if the number is between
a high and low value
c. Logic -> Use Binary Search to find the number
d. O/P -> Print the intermediary number and the final answer


11. You have a long list of tasks that you need to do today. To accomplish task you need M
minutes, and the deadline for this task is D . You need not complete a task at a stretch.
You can complete a part of it, switch to another task, and then switch back.You've
realized that it might not be possible to complete all the tasks by their deadline. So you
decide to do them in such a manner that the maximum amount by which a task's
completion time overshoots its deadline is minimized.
Input Format - The first line contains the number of tasks, . Each of the next
lines contains two integers,D and M .
Output Format - Output T lines. The ith line contains the value of the maximum
amount by which a task's completion time overshoots its deadline, when the first
tasks on your list are scheduled optimally.


12. Customize Message Demonstration using String Function and RegEx
a. Desc -> Read in the following message: Hello <<name>>, We have your full
name as <<full name>> in our system. your contact number is 91-xxxxxxxxxx.
Please,let us know in case of any clarification Thank you BridgeLabz 01/01/2016.
Use Regex to replace name, full name, Mobile#, and Date with proper value.
b. I/P -> read in the Message
c. Logic -> Use Regex to do the following
i. Replace <<name>> by first name of the user ( assume you are the user)
ii. replace <<full name>> by user full name.
iii. replace any occurance of mobile number that should be in format
91-xxxxxxxxxx by your contact number.
