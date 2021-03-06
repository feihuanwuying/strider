package engine.core.sparkexpr.executor


import engine.core.sparkexpr.expr.SparkExpr
import org.apache.spark.sql.functions.udf

/**
  * Created by xiangnanren on 25/05/2017.
  */
object ExprUDF {

  /**
    * Boolean-type UDF
    *
    */
  def BooleanTypeUDF(orderedColumnNames: Vector[String],
                     expr: SparkExpr) = udf(
    (arg: String) => {
      val res = SparkExprExecutor(orderedColumnNames).execute(expr)
      res match {
        case _res: Boolean => _res
      }
    })

  /**
    * Double-type UDF for the evaluation of arithmetic expression,
    * requires a single input column
    */
  def doubleArithmeticUDF_1(orderedColumnNames: Vector[String],
                            expr: SparkExpr) = udf(
    (arg0: String) => {
      val res = SparkExprExecutor(orderedColumnNames, arg0).execute(expr)
      res match {
        case _res: Double => _res
      }
    })

  /**
    * Double-type UDF for the evaluation of arithmetic expression,
    * requires two input columns
    */
  def doubleArithmeticUDF_2(orderedColumnNames: Vector[String],
                            expr: SparkExpr) = udf(
    (arg0: String, arg1: String) => {
      val res = SparkExprExecutor(orderedColumnNames, arg0, arg1).execute(expr)
      res match {
        case _res: Double => _res
      }
    })


  /**
    * Double-type UDF for the evaluation of arithmetic expression,
    * requires three input columns
    */
  def doubleArithmeticUDF_3(orderedColumnNames: Vector[String],
                            expr: SparkExpr) = udf(
    (arg0: String, arg1: String, arg2: String) => {
      val res = SparkExprExecutor(orderedColumnNames, arg0, arg1, arg2).execute(expr)
      res match {
        case _res: Double => _res
      }
    })

  /**
    * Float-type UDF for the evaluation of arithmetic expression,
    * requires a single input column
    */
  def floatArithmeticUDF_1(orderedColumnNames: Vector[String],
                           expr: SparkExpr) = udf(
    (arg0: String) => {
      val res = SparkExprExecutor(orderedColumnNames, arg0).execute(expr)
      res match {
        case _res: Float => _res
      }
    })

  /**
    * Float-type UDF for the evaluation of arithmetic expression,
    * requires two input columns
    */
  def floatArithmeticUDF_2(orderedColumnNames: Vector[String],
                           expr: SparkExpr) = udf(
    (arg0: String, arg1: String) => {
      val res = SparkExprExecutor(orderedColumnNames, arg0, arg1).execute(expr)
      res match {
        case _res: Float => _res
      }
    })

  /**
    * Float-type UDF for the evaluation of arithmetic expression,
    * requires three input columns
    */
  def floatArithmeticUDF_3(orderedColumnNames: Vector[String],
                           expr: SparkExpr) = udf(
    (arg0: String, arg1: String, arg2: String) => {
      val res = SparkExprExecutor(orderedColumnNames, arg0, arg1, arg2).execute(expr)
      res match {
        case _res: Float => _res
      }
    })

}
