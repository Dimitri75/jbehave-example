package com.lunivore.gameoflife;

import org.jbehave.core.model.*;
import org.jbehave.core.reporters.StoryReporter;

import java.util.List;
import java.util.Map;

/**
 * Created by Dimitri on 14/04/2016.
 */
public class MyStoryReporter implements StoryReporter{


    public void storyNotAllowed(Story story, String filter) {

    }

    public void storyCancelled(Story story, StoryDuration storyDuration) {

    }

    public void beforeStory(Story story, boolean givenStory) {
    }

    public void afterStory(boolean givenOrRestartingStory) {
    }

    public void narrative(Narrative narrative) {

    }

    public void lifecyle(Lifecycle lifecycle) {

    }

    public void scenarioNotAllowed(Scenario scenario, String filter) {

    }

    public void beforeScenario(String scenarioTitle) {

    }

    public void scenarioMeta(Meta meta) {

    }

    public void afterScenario() {

    }

    public void givenStories(GivenStories givenStories) {

    }

    public void givenStories(List<String> storyPaths) {

    }

    public void beforeExamples(List<String> steps, ExamplesTable table) {

    }

    public void example(Map<String, String> tableRow) {

    }

    public void afterExamples() {

    }

    public void beforeStep(String step) {

    }

    public void successful(String step) {

    }

    public void ignorable(String step) {

    }

    public void pending(String step) {

    }

    public void notPerformed(String step) {

    }

    public void failed(String step, Throwable cause) {

    }

    public void failedOutcomes(String step, OutcomesTable table) {

    }

    public void restarted(String step, Throwable cause) {

    }

    public void restartedStory(Story story, Throwable cause) {

    }

    public void dryRun() {

    }

    public void pendingMethods(List<String> methods) {

    }
}