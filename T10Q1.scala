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
/*This is a function named calculateAverage that takes a list of integers (List[Int]) representing Celsius temperatures as its parameter. Inside the function:

It uses the map function to convert each Celsius temperature to Fahrenheit. For each temperature celsius, it applies the formula (celsius * 9/5) + 32 
to convert it to Fahrenheit. The resulting Fahrenheit temperatures are stored in the fahrenheitTemperatures list.

The reduce function is then used to calculate the sum of the Fahrenheit temperatures. The _ + _ syntax is a shorthand for a function that 
takes two arguments and returns their sum.

The average Fahrenheit temperature is calculated by dividing the sum of Fahrenheit temperatures by the number of temperatures in the
input list (temperatures.length).

The calculated average temperature is returned from the function
* The calculateAverage function is called with the inputTemperatures list as an argument. The resulting average
*  Fahrenheit temperature is stored in the variable averageFahrenheit.*/
