implicit def Int2Time(i: Int) = new {
  def days = i * 24  * 60 * 60
}


2.days
