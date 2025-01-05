/**
 * Copyright (c) 2010-2025 Contributors to the openHAB project
 *
 * See the NOTICE file(s) distributed with this work for additional
 * information.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 *
 * SPDX-License-Identifier: EPL-2.0
 */
package org.openhab.core.items.events;

import org.eclipse.jdt.annotation.NonNullByDefault;
import org.eclipse.jdt.annotation.Nullable;
import org.openhab.core.types.TimeSeries;

/**
 * {@link GroupTimeSeriesUpdatedEvent}s can be used to deliver group item time series updates through the openHAB event
 * bus.
 * Time series events must be created with the {@link ItemEventFactory}.
 *
 * @author Jacob Laursen - Initial contribution
 */
@NonNullByDefault
public class GroupTimeSeriesUpdatedEvent extends ItemTimeSeriesUpdatedEvent {

    /**
     * The group item time series updated event type.
     */
    public static final String TYPE = GroupTimeSeriesUpdatedEvent.class.getSimpleName();

    private final String memberName;

    protected GroupTimeSeriesUpdatedEvent(String topic, String payload, String itemName, String memberName,
            TimeSeries timeSeries, @Nullable String source) {
        super(topic, payload, itemName, timeSeries, source);
        this.memberName = memberName;
    }

    /**
     * @return the name of the changed group member
     */
    public String getMemberName() {
        return this.memberName;
    }

    @Override
    public String getType() {
        return TYPE;
    }

    @Override
    public String toString() {
        return String.format("Group '%s' shall process time series %s through %s", itemName,
                timeSeries.getStates().toList(), memberName);
    }
}
