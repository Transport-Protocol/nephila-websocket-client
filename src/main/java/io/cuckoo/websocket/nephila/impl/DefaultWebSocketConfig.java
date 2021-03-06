/**
 *
 * This file is part of the
 *
 *          Nephila WebSocket Client (https://github.com/justphil/nephila-websocket-client)
 *
 * Copyright 2012 Philipp Tarasiewicz <philipp.tarasiewicz@googlemail.com>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *          http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package io.cuckoo.websocket.nephila.impl;

import io.cuckoo.websocket.nephila.WebSocketConfig;

public class DefaultWebSocketConfig implements WebSocketConfig {

    /* ######################################################################## */
    /* ######################################################################## */
    /* ######################################################################## */

    public static final boolean DEBUG           = true;

    public static final String DATE_TIME_FORMAT = "yyyy-MM-dd HH:mm:ss.SSS";

    public static final int SOCKET_TIMEOUT      = 10000;

    public static final int OUTPUT_BUFFER_SIZE  = 8192;

    /* ######################################################################## */
    /* ######################################################################## */
    /* ######################################################################## */

    @Override
    public boolean isDebug() {
        return DEBUG;
    }

    @Override
    public String getDateTimeFormat() {
        return DATE_TIME_FORMAT;
    }

    @Override
    public int getSocketTimeout() {
        return SOCKET_TIMEOUT;
    }

    @Override
    public int getOutputBufferSize() {
        return OUTPUT_BUFFER_SIZE;
    }
}
