package com.manifest.dao;

import com.manifest.PersistanceApplication;
import org.junit.runner.RunWith;
import org.springframework.boot.test.*;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.transaction.annotation.Transactional;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = PersistanceApplication.class)
@WebAppConfiguration
@IntegrationTest
@Transactional
@TestPropertySource(properties = { "server.port: 4242" } )
public class AbstractIntegrationTest {
}
