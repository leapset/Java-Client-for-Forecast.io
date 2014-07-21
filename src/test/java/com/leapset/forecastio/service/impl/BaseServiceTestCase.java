package com.leapset.forecastio.service.impl;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Base service test case
 *
 * @author Chaminda Bandara <chaminda@leapset.com/>
 * @version 1.0
 * @since Forecast-IO Client v1.0
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext-test.xml"})
public abstract class BaseServiceTestCase {
}
