
import scala.io.StdIn
object Product_of_array {

    def main(arguments: Array[String]): Unit = {

    println("Enter the size of array ")
    val size_of_array = StdIn.readInt()

    val array_elements = new Array[Int](size_of_array)

//taking the array inputs
    println(s"Enter the values:")
    for (index <- 0 until size_of_array) {
      array_elements(index) = StdIn.readInt()
    }

    //calling get_product method to find the product of elements
    val result = get_product(array_elements)
    println(s"The product of array elements is = $result")

  }


  //method to get the product of array elements
  def get_product(array: Array[Int]): Int = {
    var product = 1
    for (values <- array) {
      product *= values
    }
    product
  }


}