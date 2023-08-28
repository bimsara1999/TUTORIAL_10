package First

object T10Q2 {
  
  
      def main(args: Array[String]): Unit = {
        
        def countLetterOccurrences(words: List[String]): Int = {
            val wordLengths = words.map(_.length) // Using map to transform words into their lengths
            val totalLetterCount = wordLengths.reduce(_ + _) // Using reduce to calculate the total count
            
            return totalLetterCount
          }
          
          val inputWords = List("apple", "banana", "cherry", "date")
          val totalOccurrences = countLetterOccurrences(inputWords)
          println(s"Total count of letter occurrences: $totalOccurrences")

        
        
        
        
      }
  
}
/*This function is defined to calculate the total count of letter occurrences in a list of words. Inside the function:

The map function is used to transform each word in the input list of words into its length (number of letters). 
* The _.length is a shorthand for a function that takes a string and returns its length. This results in a list of
*  integers representing the lengths of the words.


The reduce function is then used to calculate the sum of all the word lengths in the list. The _ + _ syntax represents 
a function that takes two arguments and returns their sum.

The calculated total count of letter occurrences is returned from the function.
* The countLetterOccurrences function is called with the inputWords list as an argument. The resulting total count 
* of letter occurrences is stored in the variable totalOccurrences*/
