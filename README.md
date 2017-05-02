# Intern challenge for White Whale

**Code Challenge: Gibberish Algorithm**
---------------------------------------

Challenge Overview
------------------

We are exticed taht you are intsereted in joiinng Wihte Wahle for the smumer.  Weoclme to yuor fsrit prommarging chanellge.  Yuor chnellage is to courtsnct a prrgoam taht tekas an Enilgsh txet snirtg as iupnt and rerutns rebadale giirebbsh lkie tihs.  It dseno’t mtaetr in waht oerdr the ltteres in a wrod are, but an iproamtnt tihng is taht the frsit and lsat ltteer be in the rghit pclae. The rset can be a taotl mses and you can sitll raed it whotuit a pboerlm.  Tihs is bcuseae the huamn mnid deos not raed ervey lteter by istlef, but the wrod as a wlohe.

**The Basics:**
  
  - You may use *almost any* programming language... it's your choice.  See the supported options [here](http://ideone.com/).
  - Your program should leave the first and last letter of each word in place and scramble the rest.
  - Your program should not scamble punctuation (.,-'...etc.), numbers, or upper-case abbreviations.
  - See the [/text_files] folder for sample text files. 

**Input/Output:**
 
  - Name your program as follows: `gibgen.xx` (where xx is variable based on the language you choose)
  - Your program should be able to read text input from a string passed into STDIN
      - `gibgen.xx "This is a String"`
      - `cat mystringfile.txt | gibgen.xx`
  - Your program should output to the console.

_Note: This challenge is based on a popular word gibberish meme. You can improve the readability by looking at a [researcher's take](http://www.mrc-cbu.cam.ac.uk/people/matt.davis/cmabridge/) on the truths/myths of this meme, but this is not required._

What to do
----------
1. [Download](http://git-scm.com/downloads) & install Git on your machine

2. <a href="https://github.com/trentgillham/whitewhaleintern#fork-destination-box" class="btn grouped" data-method="POST" rel="nofollow" title="Fork">Fork</a> this project - Go [here](https://github.com/trentgillham/whitewhaleintern) and click the "Fork" button (located on the upper-right side of the screen)

2. Clone your new fork'd repository to your local machine - `git clone https://github.com/trentgillham/whitewhaleintern.git`
3. Complete the code challenge and fill out the Quick Start & Questions in the the README (see below)
4. `git add` and `git commit` your local repository as you go
4. Push your code and README back to Github occasionally - `git push origin master`
5. Email [gillham@whitewhaleanalytics.com](mailto:gillham@whitewhaleanalytics.com) with the Commit URL to your fork'd repository that you want reviewed. It should include at least 2 files: (1) your updated README with Coding Questions answered, and (2) your program (gibgen.xx)
   - Copy and paste the URL into the email along with your name... it should look something like this:
       - https://github.com/YOUR_USERNAME_HERE/whitewhaleintern.git

_Note: If you have any questions, email [gillham@whitewhaleanalytics.com](mailto:gillham@whitewhaleanalytics.com)._

Judging Criteria
----------------

Your responses to the **Coding Questions** at the bottom of this README are the *Most Important* part of this challenge. A working, fully fault-tolerant program that we just can't break, albeit awesome, is the least important.  Why is that?  Remember, we don't expect you to be expert programmers (just yet)... We want to see how you think through a problem.  


For completion by applicant
===========================

Quick Start
-----------

* To execute the program compile and then run the Gibgen.java file with the text file 
* that you would like converted in the the root directory of the java file. 
* The programming language used is Java


Coding Questions
----------------

Question 1: "How did you approach the problem?" (500 words or less)

My approach to this problem was to first grab a sheet of paper and a pencil break down the problem down into smaller and smaller sub-problems until I have detailed and methodical basic instructions. 

These basic instructions gave me a good initial development plan that lead me to determine that I would first need to do some exception handling for file input. Next I determined from the development plan that I needed to delimit the captured text to an array. Next from my development plan I determined that the best course of action was to use a selection statement to break down whether a word had a length of 4 characters, 5 characters, or more, since these would require different types of shuffles. I then created methods to deal with each of these situations. 

Throughout this whole process I did research on how to do certain things and what shuffle algorithm to use by googling questions, and confirming possible implementations with a few Java textbooks.  

Question 2: "What was the most difficult aspect of the solution?" (500 words or less)

The most difficult aspect of the solution was figuring out what was the best data structure to actually solve the problem. Should I use an arraylist, perhaps a simple array, or would a deque be more appropriate. I settled on a simple array because it checked all the boxes I needed and was the least amount of hassle. Also as is the case with all programs, naming things can be tough. Variables names and method names should be meaningful and reveal intention. This is always more difficult to do than you originally think it will be.