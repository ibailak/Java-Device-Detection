/* *********************************************************************
 * This Source Code Form is copyright of 51Degrees Mobile Experts Limited. 
 * Copyright © 2017 51Degrees Mobile Experts Limited, 5 Charlotte Close,
 * Caversham, Reading, Berkshire, United Kingdom RG4 7BY
 * 
 * This Source Code Form is the subject of the following patent 
 * applications, owned by 51Degrees Mobile Experts Limited of 5 Charlotte
 * Close, Caversham, Reading, Berkshire, United Kingdom RG4 7BY: 
 * European Patent Application No. 13192291.6; and 
 * United States Patent Application Nos. 14/085,223 and 14/085,301.
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0.
 * 
 * If a copy of the MPL was not distributed with this file, You can obtain
 * one at http://mozilla.org/MPL/2.0/.
 * 
 * This Source Code Form is "Incompatible With Secondary Licenses", as
 * defined by the Mozilla Public License, v. 2.0.
 * ********************************************************************* */
package fiftyone.mobile.detection.headers;

import fiftyone.mobile.detection.readers.BinaryReader;

/**
 * Every list contains a standard initial header. This class provides the basic
 * properties needed to access lists irrespective of the storage implementation.
 * Header includes information like the number of items in the list or the 
 * length of the list.
 * <p>
 * Objects of this class should not be created directly as they are part of the 
 * internal logic.
 */
public class Header {

    /**
     * Constructs a new instance of Header
     *
     * @param reader Reader connected to the source data structure and
     * positioned to start reading.
     */
    public Header(BinaryReader reader) {
        startPosition = reader.readInt32();
        length = reader.readInt32();
        count = reader.readInt32();
    }

    /**
     * @return The number of items contained in the collection.
     */
    public int getCount() {
        return count;
    }
    private final int count;

    /**
     * @return The position in the file where the data structure starts.
     */
    public int getStartPosition() {
        return startPosition;
    }
    private final int startPosition;

    /**
     * @return The number of bytes consumed by the data structure.
     */
    public int getLength() {
        return length;
    }
    private final int length;
}
