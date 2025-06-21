import org.apache.spark.sql.SparkSession

object ExtractAdventure {
  def main(args: Array[String]): Unit = {
    val spark = SparkSession.builder
      .appName("AdventureWorks ETL")
      .master("local[*]")
      .getOrCreate()

    // JDBC configuration
    val jdbcUrl = "jdbc:sqlserver://host.docker.internal:1433;databaseName=AdventureWorks"
    val connectionProperties = new java.util.Properties()
    connectionProperties.put("user", "SA")
    connectionProperties.put("password", "password123?")
    connectionProperties.put("driver", "com.microsoft.sqlserver.jdbc.SQLServerDriver")

    // Lecture de la table Sales.Customer
    val customersDF = spark.read
      .jdbc(jdbcUrl, "Sales.Customer", connectionProperties)

    // Affichage
    println("Données extraites depuis AdventureWorks.Sales.Customer :")
    customersDF.show(10)

    spark.stop()
  }
}
