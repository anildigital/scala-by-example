trait T1 {
  def foo = "foo"
}

trait T2 {
  def bar = "bar"
}

class A extends T1 with T2

val a = new A

a.foo
a.bar