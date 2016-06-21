import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaSparkContext;
import org.apache.spark.sql.DataFrame;
import org.apache.spark.sql.SQLContext;

/**
 * Created by didi on 16/6/21.
 */



public class test {
    public void main( String[] args){
        SparkConf conf=new SparkConf().setAppName("name01");
        JavaSparkContext sc=new JavaSparkContext(conf);
        SQLContext sqlContext = new SQLContext(sc);
        DataFrame df=sqlContext.sql(args[0].toString());
        df.repartition(1000);
        df.write();


    }

}
