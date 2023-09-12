package factorial

class FactorialIterativo {
  def factaux(cnt: Int, n: Int, result: Int) : Int = {
    if (cnt > n) result
    else factaux(cnt + 1, n, result * cnt)
  }

  def factorial(n: Int) : Int = factaux(1, n, 1)

}
