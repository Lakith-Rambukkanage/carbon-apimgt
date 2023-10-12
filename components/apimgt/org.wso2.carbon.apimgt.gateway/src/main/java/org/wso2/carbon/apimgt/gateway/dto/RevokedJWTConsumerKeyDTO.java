
/*
 * Copyright (c) 2023, WSO2 LLC. (http://www.wso2.org) All Rights Reserved.
 *
 * WSO2 LLC. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.wso2.carbon.apimgt.gateway.dto;

import com.google.gson.annotations.*;

/**
 * DTO of revoked JWT Consumer key event
 */
public class RevokedJWTConsumerKeyDTO {

    @SerializedName("consumer_key")
    private String consumerKey;
    @SerializedName("is_revoke_app_only")
    private boolean isRevokedAppOnly;
    @SerializedName("revocation_time")
    private Long revocationTime;

    public void setRevocationTime(Long revocationTime) {
        this.revocationTime = revocationTime;
    }

    public Long getRevocationTime() {
        return revocationTime;
    }

    public String getConsumerKey() {
        return consumerKey;
    }

    public void setConsumerKey(String consumerKey) {
        this.consumerKey = consumerKey;
    }

    public boolean isRevokedAppOnly() {
        return isRevokedAppOnly;
    }

    public void setRevokedAppOnly(boolean revokedAppOnly) {
        isRevokedAppOnly = revokedAppOnly;
    }
}
