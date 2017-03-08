package com.awsuggib.thirdparties.twitter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 *  Copyright 2017 AWS User Group Gibraltar
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *
 * @author sbbailey
 *
 */
@EnableAutoConfiguration
@ComponentScan("com.awsuggib.thirdparties.twitter")
public class TwitterClient {

    private static Logger logger = LoggerFactory.getLogger("applicationLog");

    public static void main(String[] args) {
        ConfigurableApplicationContext appCxt = SpringApplication.run(TwitterClient.class, args);
        appCxt.registerShutdownHook();
    }


}
