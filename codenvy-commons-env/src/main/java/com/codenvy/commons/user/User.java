/*
 * CODENVY CONFIDENTIAL
 * __________________
 * 
 *  [2012] - [2013] Codenvy, S.A. 
 *  All Rights Reserved.
 * 
 * NOTICE:  All information contained herein is, and remains
 * the property of Codenvy S.A. and its suppliers,
 * if any.  The intellectual and technical concepts contained
 * herein are proprietary to Codenvy S.A.
 * and its suppliers and may be covered by U.S. and Foreign Patents,
 * patents in process, and are protected by trade secret or copyright law.
 * Dissemination of this information or reproduction of this material
 * is strictly forbidden unless prior written permission is obtained
 * from Codenvy S.A..
 */
package com.codenvy.commons.user;

/** @author andrew00x */
public interface User {
    /** Unidentified user */
    User ANONYMOUS = new User() {
        @Override
        public String getName() {
            return "Anonymous";
        }

        @Override
        public boolean isMemberOf(String role) {
            return false;
        }

        @Override
        public String getToken() {
            return null;
        }

        @Override
        public String getId() {
            return "0000-00-0000";
        }
    };

    /** Get user name. */
    String getName();

    /**
     * Check is user in specified {@code role}.
     *
     * @param role
     *         role name to check
     * @return {@code true} if user in role and {@code false} otherwise
     */
    boolean isMemberOf(String role);

    /**
     * Get user auth token to be able to execute request as user
     *
     * @return - user token
     */
    String getToken();

    /**
     * Get user unique identifier of user.
     * In comparison with name id never changes for the given user.
     *
     * @return - unique identifier of user.
     */
    String getId();
}
