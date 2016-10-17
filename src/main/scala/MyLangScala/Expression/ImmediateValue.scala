package MyLangScala.Expression
import MyLangScala.Engine

/**
  * Created by teradashoutarou on 2016/10/17.
  */
class ImmediateValue( value : Any ) extends IExpression {

  override def eval(engine: Engine): Any = {
    value
  }
}
