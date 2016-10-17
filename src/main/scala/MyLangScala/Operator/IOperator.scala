package MyLangScala.Operator

import MyLangScala.Engine

/**
  * Created by teradashoutarou on 2016/10/01.
  */
trait IOperator {

  def call( engine: Engine, args: Array[Any] ) : Any
}
