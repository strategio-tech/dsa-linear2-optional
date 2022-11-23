# DSA Assignment: Linear Structures 2 (OPTIONAL)

This problem uses **linear data structures**. These include arrays but can also include hashmaps, stacks, and queues, depending on your implementation. **All of these problem sets are optional.**

Accepting the GitHub Assignment will create a repo with a challenge at `/src/main/java/tech.strategio` and its corresponding unit tests at `/src/test/java/tech.strategio`. Clone the repo generated for you by GitHub Classroom and use your Java IDE of choice.

The exercise contains a class with a method. Complete the method in an IDE such that the unit tests pass. You should run your unit tests often, either through your Java IDE or through the command line (`gradle test`).

To submit the exercise, push a commit to GitHub. Automated tests will run, and you’ll see a green checkbox if ALL unit tests pass.

## Assignment

### E01 - Reverse Vowels of a String

*Difficulty rating: 1*

Given a string s, reverse only all the vowels in the string and return it.

The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than once.

**Example 1:**

```
Input: s = "hello"
Output: "holle"
```

**Example 2:**

```
Input: s = "leetcode"
Output: "leotcede"
```

**Constraints:**

- `1 <= s.length <= 3 * 10^5`
- s consist of printable ASCII characters.

### E02 - Valid Parentheses

*Difficulty rating: 1*

Given a string s containing just the characters `(`, `)`, `{`, `}`, `[` and `]`, determine if the input string is valid.

An input string is valid if:

- Open brackets must be closed by the same type of brackets.
- Open brackets must be closed in the correct order.
- Every close bracket has a corresponding open bracket of the same type.

**Example 1:**

```
Input: s = "()"
Output: true
```

**Example 2:**

```
Input: s = "()[]{}"
Output: true
```

**Example 3:**

```
Input: s = "(]"
Output: false
```

**Constraints:**

- `1 <= s.length <= 10^4`
- s consists of parentheses only `'()[]{}'`.


### E03 - Valid Palindrome

*Difficulty rating: 1*

A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.

Given a string s, return `true` if it is a palindrome, or `false` otherwise.

It's possible to do this in O(n) time and O(1) space, where n is the length of the input string.

**Example 1:**

```
Input: s = "A man, a plan, a canal: Panama"
Output: true
Explanation: "amanaplanacanalpanama" is a palindrome.
```

**Example 2:**

```
Input: s = "race a car"
Output: false
Explanation: "raceacar" is not a palindrome.
```

**Example 3:**

```
Input: s = " "
Output: true
Explanation: s is an empty string "" after removing non-alphanumeric characters.
Since an empty string reads the same forward and backward, it is a palindrome.
```

**Constraints:**

- `1 <= s.length <= 2 * 105`
- `s` consists only of printable ASCII characters.

#### Hints

<details>
  <summary>Hint 1</summary>
  
   Start by building the input string in reverse order and comparing this newly built string to the input string. Can you do this without using string concatenations?
</details>

<details>
  <summary>Hint 2</summary>
  
   If you know recursion, can you optimize your algorithm by using it? What are the implications of recursion on an algorithm's space-time complexity analysis?
</details>

<details>
  <summary>Hint 3</summary>
  
   Go back to an iterative solution and try using pointers to solve this problem: start with a pointer at the first index of the string and a pointer at the final index of the string. What can you do from there?
</details>

### E04 - Longest Substring Without Repeating Characters

*Difficulty rating: 3/5*

Given a string s, find the length of the longest substring without repeating characters.

You should be able to do this in `O(n)` time & `O(min(n, a))` space, where `n` is the length of the input string and `a` is the length of the character alphabet represented in the input string

**Example 1:**

```
Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.

```

**Example 2:**

```
Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.
```

**Example 3:**

```
Input: s = "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
```

**Constraints:**

 - `0 <= s.length <= 5 * 104`
 - `s` consists of English letters, digits, symbols and spaces.

#### Hints

<details>
  <summary>Hint 1</summary>
  
   Try traversing the input string and storing the last position at which you see each character in a hash table. How can this help you solve the given problem?
</details>

<details>
  <summary>Hint 2</summary>
  
   As you traverse the input string, keep track of a starting index variable. This variable, as its name suggests, should represent the most recent index from which you could start a substring with no duplicate characters, ending at your current index. Use the hash table mentioned in Hint #1 to update this variable correctly, and update the longest substring as you go.
</details>

## Hints

- This problem has a corresponding LeetCode challenge. Google for it!
- Because there is a corresponding LeetCode challenge, there is a lot of material on how to solve this problem. Give the problem a try first before Googling content!

GOOD LUCK! :rocket:
