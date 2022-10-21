/**
 * 
 */
package com.niterre.microservice;

import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author river
 *
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = NiterreApplication.class)
@Transactional
public class BaseTest {

}
