object Main {
  def decompressRLElist(nums: Array[Int]): Array[Int] = {
    (for (i <- Range(0,nums.length / 2); j <- 1 to nums(i * 2)) yield nums(i*2+1)).toArray
  }
  def test1(): Unit = {
    val nums=Array(1,2,3,4)
    print(decompressRLElist(nums))
  }
  def test2(): Unit = {
    val nums=Array(1,1,2,3)
    print(decompressRLElist(nums))
  }
}
