package com.mycompany

import org.apache.spark.sql.SparkSession

package object utils {
  val spark: SparkSession = SparkSession.builder().appName("Parser").getOrCreate()
}
