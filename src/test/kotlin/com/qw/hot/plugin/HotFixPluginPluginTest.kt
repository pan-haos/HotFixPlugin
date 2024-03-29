/*
 * This Kotlin source file was generated by the Gradle 'init' task.
 */
package com.qw.hot.plugin

import org.gradle.testfixtures.ProjectBuilder
import kotlin.test.Test
import kotlin.test.assertNotNull

/**
 * A simple unit test for the 'com.qw.hot.plugin.greeting' plugin.
 */
class HotFixPluginPluginTest {
    @Test fun `plugin registers task`() {
        // Create a test project and apply the plugin
        val project = ProjectBuilder.builder().build()
        project.plugins.apply("com.qw.hot.plugin.greeting")

        // Verify the result
        assertNotNull(project.tasks.findByName("greeting"))
    }
}
