package MyLangScala.Expression

import MyLangScala.Engine

/**
  * Created by teradashoutarou on 2016/10/17.
  */
trait IExpression {
  def eval( engine:Engine ) : Any
}
