package org.testcompass.plugin.startup

import com.intellij.openapi.project.Project
import com.intellij.openapi.startup.ProjectActivity
import org.testcompass.plugin.coverage.AIInteractionLoggerService

class MyProjectActivity : ProjectActivity {

    override suspend fun execute(project: Project) {
        project.getService(AIInteractionLoggerService::class.java)?.requestSetupIfNeeded()
    }
}
