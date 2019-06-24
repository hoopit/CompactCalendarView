package io.hoopit.calendar.comparators;


import java.util.Comparator;

import io.hoopit.calendar.domain.Event;

public class EventComparator implements Comparator<Event> {

    @Override
    public int compare(Event lhs, Event rhs) {
        return Long.compare(lhs.getTimeInMillis(), rhs.getTimeInMillis());
    }
}
