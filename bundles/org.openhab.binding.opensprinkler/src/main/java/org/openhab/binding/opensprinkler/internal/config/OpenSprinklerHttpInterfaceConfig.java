/**
 * Copyright (c) 2010-2020 Contributors to the openHAB project
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
package org.openhab.binding.opensprinkler.internal.config;

import static org.openhab.binding.opensprinkler.internal.OpenSprinklerBindingConstants.DEFAULT_REFRESH_RATE;
import static org.openhab.binding.opensprinkler.internal.api.OpenSprinklerApiConstants.*;

/**
 * The {@link OpenSprinklerHttpInterfaceConfig} class defines the configuration options
 * for the OpenSprinkler Thing.
 *
 * @author Chris Graham - Initial contribution
 */
public class OpenSprinklerHttpInterfaceConfig {
    /**
     * Hostname of the OpenSprinkler API.
     */
    public String hostname = null;

    /**
     * The port the OpenSprinkler API is listening on.
     */
    public int port = DEFAULT_API_PORT;

    /**
     * The password to connect to the OpenSprinkler API.
     */
    public String password = DEFAULT_ADMIN_PASSWORD;

    /**
     * Number of seconds in between refreshes from the OpenSprinkler device.
     */
    public int refresh = DEFAULT_REFRESH_RATE;
    /**
     * The basic auth username to use when the OpenSprinkler device is behind a reverse proxy with basic auth enabled.
     */
    public String basicUsername = null;
    /**
     * The basic auth password to use when the OpenSprinkler device is behind a reverse proxy with basic auth enabled.
     */
    public String basicPassword = null;
}
