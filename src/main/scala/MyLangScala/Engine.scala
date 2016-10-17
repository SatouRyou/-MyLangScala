package MyLangScala

import MyLangScala.Expression.IExpression

/**
  * Created by teradashoutarou on 2016/10/01.
  */
class Engine {

    def eval( script:Any ) : Any = {
        getExpression( script ).eval( this )
    }

    def getExpression( script:Any ) : IExpression = {
        if ( script isInstanceOf Array ) {

        }
    }
}
