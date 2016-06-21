import org.apache.spark.sql.{DataFrame, SQLContext}
import org.apache.spark.{SparkConf, SparkContext}

/**
  * Created by didi on 16/6/21.
  */
object test02 {
  def main(args: Array[String]) {
    val conf: SparkConf = new SparkConf().setAppName("name01").setMaster("yarn-client")
    val sc = new SparkContext(conf)
    val sqlContext: SQLContext = new SQLContext(sc)
    val df: DataFrame = sqlContext.sql(args(0).toString)
    df.repartition(1000)
    df.write
  }

}
