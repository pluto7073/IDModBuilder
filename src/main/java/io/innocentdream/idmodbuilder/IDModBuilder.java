package io.innocentdream.idmodbuilder;

import org.gradle.api.Plugin;
import org.gradle.api.Project;
import org.gradle.internal.impldep.com.google.common.collect.ImmutableMap;

import java.util.Objects;

public class IDModBuilder implements Plugin<Project> {

    public static final String BUILDER_VERSION = Objects.requireNonNullElse(IDModBuilder.class.getPackage().getImplementationVersion(), "0.0-UNKNOWN");

    @Override
    public void apply(Project project) {
        project.getLogger().lifecycle("IDMBuilder: " + BUILDER_VERSION);

        project.apply(ImmutableMap.of("plugin", "java-library"));
        project.apply(ImmutableMap.of("plugin", "eclipse"));
        project.apply(ImmutableMap.of("plugin", "idea"));
    }
}
