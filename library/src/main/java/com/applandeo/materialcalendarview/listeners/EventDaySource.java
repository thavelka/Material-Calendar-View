package com.applandeo.materialcalendarview.listeners;

import com.applandeo.materialcalendarview.EventDay;

import java.util.Calendar;
import java.util.List;

/**
 * Callback used to provide a list of EventDays for each month page.
 * Set with {@link com.applandeo.materialcalendarview.CalendarView#setEventSource(EventDaySource)}
 */
public interface EventDaySource {
    /**
     * Gets the list of event days for the time span specified by start and end. This will be
     * called each time a new calendar page is instantiated. Note that the end parameter is set to
     * start of day and may need to be set to midnight to get the proper end time for the data.
     * @param start First visible day on the page.
     * @param end Last visible day on the page. See note above.
     * @return A list of EventDays to display on the page.
     */
    List<EventDay> onLoadMonth(Calendar start, Calendar end);
}
