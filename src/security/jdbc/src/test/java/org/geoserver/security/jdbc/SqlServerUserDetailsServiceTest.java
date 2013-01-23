/* Copyright (c) 2001 - 2013 OpenPlans - www.openplans.org. All rights reserved.
 * This code is licensed under the GPL 2.0 license, available at the root
 * application directory.
 */

package org.geoserver.security.jdbc;


public class SqlServerUserDetailsServiceTest extends JDBCUserDetailsServiceTest {

    
    @Override
    protected String getFixtureId() {
        return "oracle";
    }
        
}
