/*
 *  Copyright 2018 TWO SIGMA OPEN SOURCE, LLC
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package com.twosigma.beakerx.widget;

import org.apache.spark.SparkContext;
import org.apache.spark.sql.SparkSession;

public class SparkVariable {

  private static SparkContextManager manager = null;
  private static SparkContext sparkContext;
  private static SparkSession sparkSession;

  static void putSparkContextManager(SparkContextManager sparkContextManager) {
    manager = sparkContextManager;
  }

  public static SparkContextManager getSparkContextManager() {
    return manager;
  }

  static void putSparkContext(SparkContext sc) {
    sparkContext = sc;
  }

  public static SparkContext getSparkContext() {
    return sparkContext;
  }

  public static void cancelAllJobs() {
    manager.cancelAllJobs();
  }

  public static void putSparkSession(SparkSession sSession) {
    sparkSession = sSession;
  }

  public static SparkSession getSparkSession() {
    return sparkSession;
  }
}
