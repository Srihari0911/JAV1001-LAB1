//Sri Hari Sreenivasan, A00272180 and Mobile Application Development
fun main() {

    print("Enter the unit of measurement you want to convert: ")
    val measurementUnit = readLine()
    
     print("Enter a value: ")
    val number = readLine()!!.toFloat()
    
    var result = ""
    when (measurementUnit) {
        "km" -> result = "$number$measurementUnit = ${0.62*number}mi"
        "mi" -> result = "$number$measurementUnit = ${1.61*number}km"
        "cm" -> result = "$number$measurementUnit = ${0.39*number}in"
        "in" -> result = "$number$measurementUnit = ${2.54*number}cm"
        "kg" -> result = "$number$measurementUnit = ${2.2*number}lb"
        "lb" -> result = "$number$measurementUnit = ${0.45*number}kg"
        "g"  -> result = "$number$measurementUnit = ${0.04*number}oz"
        "oz" -> result = "$number$measurementUnit = ${28.35*number}g"
        "C to F" -> result = "$number$measurementUnit = ${number*1.80+32}F" //Converted 9/5 to decimal
        "C to K" -> result = "$number$measurementUnit = ${number+273.15}K"
        "F to C" -> result = "$number$measurementUnit = ${(number-32)*0.556}C" //Converted 5/9 to decimal
        "F to K" -> result = "$number$measurementUnit = ${(number-32)*0.556+273.15}K" //Converted 5/9 to decimal

        else -> println("Unable to convert")
    }
    println(result)
}
