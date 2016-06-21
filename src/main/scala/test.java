import jdk.nashorn.internal.runtime.ArgumentSetter;

/**
 * Created by didi on 16/6/21.
 */

import java.sql.{Date, Timestamp}

import scala.collection.JavaConverters._

import org.apache.spark.sql._
import org.apache.spark.sql.catalyst.{TableIdentifier, DefaultParserDialect}
import org.apache.spark.sql.catalyst.analysis.{FunctionRegistry, EliminateSubQueries}
import org.apache.spark.sql.catalyst.errors.DialectException
import org.apache.spark.sql.execution.datasources.LogicalRelation
import org.apache.spark.sql.hive.test.TestHiveSingleton
import org.apache.spark.sql.hive.{HiveContext, HiveQLDialect, MetastoreRelation}
import org.apache.spark.sql.execution.datasources.parquet.ParquetRelation
import org.apache.spark.sql.test.SQLTestUtils
import org.apache.spark.sql.types._
import org.apache.spark.unsafe.types.CalendarInterval

public class test {
    public void main(ArgumentSetter)

}
