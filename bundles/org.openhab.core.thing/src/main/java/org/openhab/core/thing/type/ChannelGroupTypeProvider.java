/*
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
package org.openhab.core.thing.type;

import java.util.Collection;
import java.util.Locale;

import org.eclipse.jdt.annotation.NonNullByDefault;
import org.eclipse.jdt.annotation.Nullable;

/**
 * The {@link ChannelGroupTypeProvider} is responsible for providing channel group types.
 *
 * @see ChannelGroupTypeRegistry
 *
 * @author Henning Treu - Initial contribution
 */
@NonNullByDefault
public interface ChannelGroupTypeProvider {

    /**
     * @see ChannelGroupTypeRegistry#getChannelGroupType(ChannelGroupTypeUID, Locale)
     */
    @Nullable
    ChannelGroupType getChannelGroupType(ChannelGroupTypeUID channelGroupTypeUID, @Nullable Locale locale);

    /**
     * @see ChannelGroupTypeRegistry#getChannelGroupTypes(Locale)
     */
    Collection<ChannelGroupType> getChannelGroupTypes(@Nullable Locale locale);
}
