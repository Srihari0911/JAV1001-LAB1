fun main() {

    print("Enter a value: ")
    val number = readLine()!!.toFloat()

    print("Enter the unit of measurement you want to convert: ")
    val measurementUnit = readLine()
    
    var result = ""
    when (measurementUnit) {
        "km" -> result = "$number$measurementUnit = ${0.62*number}mi"
        "mi" -> result = "$number$measurementUnit = ${1.61*number}km"
        "cm" -> result = "$number$measurementUnit = ${0.39*number}in"
        "in" -> result = "$number$measurementUnit = ${2.54*number}cm"
