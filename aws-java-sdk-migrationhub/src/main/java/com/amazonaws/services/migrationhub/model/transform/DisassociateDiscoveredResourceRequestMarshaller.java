/*
 * Copyright 2012-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.migrationhub.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.migrationhub.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * DisassociateDiscoveredResourceRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class DisassociateDiscoveredResourceRequestMarshaller {

    private static final MarshallingInfo<String> PROGRESSUPDATESTREAM_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ProgressUpdateStream").build();
    private static final MarshallingInfo<String> MIGRATIONTASKNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MigrationTaskName").build();
    private static final MarshallingInfo<String> CONFIGURATIONID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ConfigurationId").build();
    private static final MarshallingInfo<Boolean> DRYRUN_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("DryRun").build();

    private static final DisassociateDiscoveredResourceRequestMarshaller instance = new DisassociateDiscoveredResourceRequestMarshaller();

    public static DisassociateDiscoveredResourceRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(DisassociateDiscoveredResourceRequest disassociateDiscoveredResourceRequest, ProtocolMarshaller protocolMarshaller) {

        if (disassociateDiscoveredResourceRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(disassociateDiscoveredResourceRequest.getProgressUpdateStream(), PROGRESSUPDATESTREAM_BINDING);
            protocolMarshaller.marshall(disassociateDiscoveredResourceRequest.getMigrationTaskName(), MIGRATIONTASKNAME_BINDING);
            protocolMarshaller.marshall(disassociateDiscoveredResourceRequest.getConfigurationId(), CONFIGURATIONID_BINDING);
            protocolMarshaller.marshall(disassociateDiscoveredResourceRequest.getDryRun(), DRYRUN_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}