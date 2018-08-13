package com.localplatform.datafeed.settings

import com.typesafe.config.ConfigFactory
import com.localplatform.datafeed.utils.Logging

object Constants extends Logging {
  private val appConf = ConfigFactory.load().getConfig("app")

  val Application = appConf.getString("application")
  val Product = appConf.getString("product")
  val Version = appConf.getString("version")

  val UnitsInWave = 100000000L
  val TotalLocal = 100000000L

}
