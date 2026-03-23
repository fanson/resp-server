/*
 * Copyright (c) 2015-2026, Antonio Gabriel Muñoz Conejo <me at tonivade dot es>
 * Distributed under the terms of the MIT License
 */
package com.github.tonivade.resp;

import org.slf4j.LoggerFactory;

import ch.qos.logback.classic.Level;
import ch.qos.logback.classic.Logger;
import ch.qos.logback.classic.LoggerContext;

public class Main {

  public static void main(String[] args) {
    setRootLogLevel(Level.INFO);
    RespServer.builder().build().start();
  }

  private static void setRootLogLevel(Level level) {
    LoggerContext context = (LoggerContext) LoggerFactory.getILoggerFactory();
    Logger rootLogger = context.getLogger(Logger.ROOT_LOGGER_NAME);
    rootLogger.setLevel(level);
  }
}
