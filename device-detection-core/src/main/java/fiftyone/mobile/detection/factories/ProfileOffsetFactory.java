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
package fiftyone.mobile.detection.factories;

import fiftyone.mobile.detection.Dataset;
import fiftyone.mobile.detection.entities.ProfileOffset;
import fiftyone.mobile.detection.readers.BinaryReader;

/**
 * Creates new instances of a ProfileOffset entity.
 * <p>
 * Objects of this class should not be created directly as they are part of the 
 * internal logic.
 */
public class ProfileOffsetFactory extends BaseEntityFactory<ProfileOffset> {

    /**
     * Creates a new instance of profile offset from the reader
     *
     * @param dataSet related to the data file
     * @param index index of the profile offset to return
     * @param reader reader connected to the source data
     * @return a new profile offset
     */
    @Override
    public ProfileOffset create(Dataset dataSet, int index,
            BinaryReader reader) {
        return new ProfileOffset(dataSet, index, reader);
    }
    
    /**
     * @return length of the Profile record.
     */
    @Override
    public int getLength() {
        return ProfileOffset.RECORD_LENGTH;
    }
}
