package de.janphkre.class_relations.idea_plugin.presentation

import com.intellij.openapi.project.Project
import com.intellij.openapi.wm.ToolWindow
import com.intellij.openapi.wm.ToolWindowFactory
import de.janphkre.class_relations.idea_plugin.domain.ClassRelationsProjectService

class ClassRelationsToolWindowFactory: ToolWindowFactory {
    override fun createToolWindowContent(project: Project, toolWindow: ToolWindow) {
        val content = ClassRelationsToolWindowContent(ClassRelationsProjectService.getInstance(toolWindow.project))
        val updater = ClassRelationsToolWindowContentUpdater(content, toolWindow)
        updater.initialize()
    }

    override fun shouldBeAvailable(project: Project) = true
}