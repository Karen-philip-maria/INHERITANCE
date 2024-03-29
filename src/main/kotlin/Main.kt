fun main(){
  val message= Car("orange",23, "toyota","mazda")
   message.carry(40)
   message.identity()
    message.calculateParkingFees(23)
    var information= Bus("blue","isuzu","BMW",25.00)
    information.maxTripFare(30)
    information.newParkingFee(41)
}
//1. create a class Car with the following attributes:make, model,color,capacity. In the following three functions
 open class Car(var color:String, var capacity:Int, var make:String,var model:String) {
    // fun carry(people:Int): prints out "Carrying $people passengers"if the number of people is within its capacity else it rints out "Over capacity by $x people
    //wherex is the number of people exceeding its capacity
    fun carry(people: Int) {
        var x= people - capacity
        if (people <= capacity) {
            println("Carrying $people passengers")
        } else {
            println("Over capacity by $x people")
        }
    }
    // identify():Prints out the color, make and model inthe following format e.g :"I am a white subaru legacy"
    fun identity(){
        println("I have a $color $make $model")
    }
    // calculateParkingFees(hours:Int): calculate and returns the parking fes by multiplkying the hours by 20
open fun calculateParkingFees(hours:Int){
    var parkingFees= hours * 20
    println(parkingFees)

}
}
//2.
//calculate a class Bus with the same attributes and functions as the Car class.
// in addition, it has another method called maxTripFare(fare:Double) that calculates and returns the max amnt of fare that can be collected per trip.
// The bus' calculateTripFare method returns the product of hours and capacity of the bus

class Bus(var color: String, var make: String, var model: String, var capacity: Double){
    fun maxTripFare(fare:Int){
        var tripFare= fare * capacity
        println(tripFare)
    }
    fun newParkingFee(hours: Int){
        var TripFare= hours * capacity
        println(TripFare)
    }
}
