/**
 * Gagandeep
 * 12:51:35 am
 * 12-Apr-2020
 */
package com.gagan.annotation;

import org.springframework.context.annotation.ComponentScan;

import org.springframework.context.annotation.Configuration;

/**
 * @ComponentScan Will autodetec classes wtih @Component for dependency injection
 * @Configuration Declaring that this classes contains @Bean dependency
 *
 */
@Configuration
@ComponentScan("com.gagan")
public class AppConfig {

}
