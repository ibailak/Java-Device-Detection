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

package fiftyone.mobile.test.type.performance.enterprise;

import fiftyone.mobile.TestType;
import fiftyone.mobile.test.type.performance.MemoryBase;
import fiftyone.mobile.Filename;
import java.io.IOException;
import org.junit.Test;
import org.junit.experimental.categories.Category;

@Category(TestType.DataSetEnterprise.class)
public class V32EnterprisePerformanceMemoryTest extends MemoryBase {
    public V32EnterprisePerformanceMemoryTest() {
        super(Filename.ENTERPRISE_PATTERN_V32);
    }
    
    @Override
    protected int getMaxSetupTime() {
        return 16000;
    }
    
    @Test
    @Category(TestType.DataSetEnterprise.class)
    @Override
    public void initializeTime()
    {
        super.initializeTime();
    }

    @Test
    public void badUserAgentsMulti() throws IOException
    {
        super.badUserAgentsMulti(null, 2);
    }

    @Test
    public void badUserAgentsSingle() throws IOException
    {
        super.badUserAgentsSingle(null, 5);
    }

    @Test
    public void uniqueUserAgentsMulti() throws IOException
    {
        super.uniqueUserAgentsMulti(null, 1);
    }

    @Test
    public void uniqueUserAgentsSingle() throws IOException
    {
        super.uniqueUserAgentsSingle(null, 1);
    }

    @Test
    public void randomUserAgentsMulti() throws IOException
    {
        super.randomUserAgentsMulti(null, 1);
    }

    @Test
    public void randomUserAgentsSingle() throws IOException
    {
        super.randomUserAgentsSingle(null, 1);
    }

    @Test
    public void badUserAgentsMultiAll() throws IOException
    {
        super.badUserAgentsMulti(super.dataSet.properties, 2);
    }

    @Test
    public void badUserAgentsSingleAll() throws IOException
    {
        super.badUserAgentsSingle(super.dataSet.properties, 6);
    }

    @Test
    public void uniqueUserAgentsMultiAll() throws IOException
    {
        super.uniqueUserAgentsMulti(super.dataSet.properties, 1);
    }

    @Test
    public void uniqueUserAgentsSingleAll() throws IOException
    {
        super.uniqueUserAgentsSingle(super.dataSet.properties, 1);
    }

    @Test
    public void randomUserAgentsMultiAll() throws IOException
    {
        super.randomUserAgentsMulti(super.dataSet.properties, 1);
    }

    @Test
    public void randomUserAgentsSingleAll() throws IOException
    {
        super.randomUserAgentsSingle(super.dataSet.properties, 1);
    }
}