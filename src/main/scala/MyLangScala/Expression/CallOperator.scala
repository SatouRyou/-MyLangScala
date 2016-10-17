package MyLangScala.Expression

import MyLangScala.Engine
import MyLangScala.Operator.IOperator

/**
  * Created by teradashoutarou on 2016/10/17.
  */
class CallOperator( operator: IOperator, args : Array[Any] ) extends IExpression {
  def eval( engine: Engine ) : Any = {
    operator.call( engine, args )
  }
}
