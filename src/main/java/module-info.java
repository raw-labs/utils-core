/*
 * Copyright 2023 RAW Labs S.A.
 *
 * Use of this software is governed by the Business Source License
 * included in the file licenses/BSL.txt.
 *
 * As of the Change Date specified in that file, in accordance with
 * the Business Source License, use of this software will be governed
 * by the Apache License, Version 2.0, included in the file
 * licenses/APL.txt.
 */

module raw.utils.core {
  requires scala.library;
  requires scala.logging;
  requires ch.qos.logback.classic;
  requires org.slf4j;
  requires jul.to.slf4j;
  requires typesafe.config;
  requires org.apache.commons.io;
  requires org.apache.commons.text;
  requires com.google.common;

  exports com.rawlabs.utils.core;

}
