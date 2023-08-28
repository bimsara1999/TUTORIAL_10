package First

object T10Q1 {
  
    def main(args: Array[String]): Unit = {
            
            
def calculateAverage(temperatures: List[Int]): Double = {
  val fahrenheitTemperatures = temperatures.map(celsius => (celsius * 9/5) + 32)
  val sumOfTemperatures = fahrenheitTemperatures.reduce(_ + _)
  val averageTemperature = sumOfTemperatures / temperatures.length
  
  return averageTemperature
}

val inputTemperatures = List(0, 10, 20, 30)
val averageFahrenheit = calculateAverage(inputTemperatures)
println(s"Average Fahrenheit temperature: $averageFahrenheit")

            
            
            
            
          
  
    }
  
  
}

