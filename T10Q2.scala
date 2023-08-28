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

