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
package org.openhab.core.voice;

import java.util.Locale;

import org.eclipse.jdt.annotation.NonNullByDefault;

/**
 * This is the interface that a text-to-speech voice has to implement.
 *
 * @author Kelly Davis - Initial contribution
 */
@NonNullByDefault
public interface Voice {

    /**
     * Globally unique identifier of the voice, must have the format
     * "prefix:voicename", where "prefix" is the id of the related TTS service.
     *
     * @return A String uniquely identifying the voice.
     */
    String getUID();

    /**
     * The voice label, usually used for GUIs
     *
     * @return The voice label, may not be globally unique
     */
    String getLabel();

    /**
     * Locale of the voice
     *
     * @return Locale of the voice
     */
    Locale getLocale();
}
