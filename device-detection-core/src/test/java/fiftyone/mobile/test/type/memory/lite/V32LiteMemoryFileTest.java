/*
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
 */

package fiftyone.mobile.test.type.memory.lite;

import fiftyone.mobile.detection.Dataset;
import fiftyone.mobile.Filename;
import fiftyone.mobile.TestType;
import fiftyone.mobile.test.common.UserAgentGenerator;
import fiftyone.mobile.test.type.memory.MemoryBase;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import java.io.IOException;
import org.junit.After;

@Category({TestType.DataSetLite.class, TestType.TypeMemory.class})
public class V32LiteMemoryFileTest extends MemoryBase {

    private static final String filename = Filename.LITE_PATTERN_V32;
    private static Dataset dataset;

    @BeforeClass
    public static void setUp() throws IOException {
        if (fileExists(filename)) {
            dataset = getInitialisedDataset(filename, false, 20, null, false);
        }
    }

    @Before
    public void checkFileExists() {
        assumeFileExists(filename);
    }
    
    @After
    public void resetCache() {
        if (dataset != null) {
            dataset.resetCache();
            System.gc();
        }
    }

    @AfterClass
    public static void tearDown() throws IOException {
        if (dataset != null) dataset.close();
        dataset = null;
    }
    
    @Test
    public void badUserAgentsSingle() throws IOException {
        super.userAgentsSingle(UserAgentGenerator.getBadUserAgents(), 60);
    }
    
    @Test
    public void badUserAgentsMulti() throws IOException {
        super.userAgentsMulti(UserAgentGenerator.getBadUserAgents(), 60);
    }
    
    @Test
    public void randomUserAgentsSingle() throws IOException {
        super.userAgentsSingle(UserAgentGenerator.getRandomUserAgents(), 33);
    }
    
    @Test
    public void randomUserAgentsMulti() throws IOException {
        super.userAgentsMulti(UserAgentGenerator.getRandomUserAgents(), 57);
    }

    @Test
    public void uniqueUserAgentsSingle() throws IOException {
        super.userAgentsSingle(UserAgentGenerator.getUniqueUserAgents(), 34);
    }

    @Test
    @Category({TestType.DataSetLite.class, TestType.TypeMemory.class})
    public void uniqueUserAgentsMulti() throws IOException {
        super.userAgentsMulti(UserAgentGenerator.getUniqueUserAgents(), 57);
    }
    
    @Override
    protected Dataset getDataset() {
        return dataset;
    }
}
