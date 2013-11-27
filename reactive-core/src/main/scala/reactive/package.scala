package object reactive {
  implicit class ForeachableForwardable[V, S <: Foreachable[V]](_self: S with Foreachable[V]) extends Forwardable[V, S] {
    val self: S = _self
      
    def foreach(f: V => Unit)(implicit observing: Observing) = {
      _self.foreach(f)
      _self
    }
  }
}
