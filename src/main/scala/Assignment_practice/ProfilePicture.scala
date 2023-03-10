package Assignment_practice

import scala.io.StdIn

object ProfilePicture extends App{

  println("Enter the Minimum Dimension")
  private val pictureLength : Int  = StdIn.readInt()
  println("Enter the Width and Height")
  private val pictureWidth :  Int  =  StdIn.readInt()
  private val pictureHeight : Int  = StdIn.readInt()

  //exceptional handling
  try {
    if (pictureWidth  == pictureLength && pictureLength == pictureHeight) {
        print("ACCEPTED")
      } else
    if (pictureWidth > pictureLength && pictureHeight > pictureLength) {
        print("CROP IT")
      }else
        print("UPLOAD ANOTHER ONE")
     } catch {
       case e: Exception =>
       println("An error occurred: " + e.getMessage)
    }

}


