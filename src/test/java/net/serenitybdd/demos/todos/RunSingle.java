package net.serenitybdd.demos.todos;

import net.serenitybdd.jbehave.SerenityStories;

public class RunSingle extends SerenityStories {
    public RunSingle() {
        String story = "new_scenario.story";
        findStoriesCalled(story);
    }
}
