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
package fiftyone.mobile.detection.cache;

/**
 * Contains everything needed to build a cache.
 * Currently, an {@link ICacheBuilder} and an integer size parameter.
 */
public class CacheOptions implements ICacheOptions {
    private int size;
    private ICacheBuilder builder;

    public CacheOptions(int size, ICacheBuilder builder){
        this.size = size;
        this.builder = builder;
    }

    public int getSize() {
        return size;
    }

    public ICacheBuilder getBuilder(){
        return builder;
    }

    public void setBuilder(ICacheBuilder builder){
        this.builder = builder;
    }
    public void setSize(int cacheSize){
        this.size = cacheSize;
    }
}
