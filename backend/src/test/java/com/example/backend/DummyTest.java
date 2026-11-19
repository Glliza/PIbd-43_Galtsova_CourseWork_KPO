package com.example.backend;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class DummyTest {
    @Test
    void contextLoads() {
        BackendApplication app = new BackendApplication();
        assertNotNull(app);
    }
}