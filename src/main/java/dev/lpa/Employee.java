package dev.lpa;

import dev.lpa.util.QueryItem;

public record Employee(String name) implements QueryItem {
    @Override
    public boolean matchFieldValue(String fieldName, String value) {
        return false;
    }
}
