/*
 * Copyright 2013-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.sagemaker.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.sagemaker.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CreatePresignedNotebookInstanceUrlRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CreatePresignedNotebookInstanceUrlRequestMarshaller {

    private static final MarshallingInfo<String> NOTEBOOKINSTANCENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("NotebookInstanceName").build();
    private static final MarshallingInfo<Integer> SESSIONEXPIRATIONDURATIONINSECONDS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SessionExpirationDurationInSeconds").build();

    private static final CreatePresignedNotebookInstanceUrlRequestMarshaller instance = new CreatePresignedNotebookInstanceUrlRequestMarshaller();

    public static CreatePresignedNotebookInstanceUrlRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CreatePresignedNotebookInstanceUrlRequest createPresignedNotebookInstanceUrlRequest, ProtocolMarshaller protocolMarshaller) {

        if (createPresignedNotebookInstanceUrlRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(createPresignedNotebookInstanceUrlRequest.getNotebookInstanceName(), NOTEBOOKINSTANCENAME_BINDING);
            protocolMarshaller.marshall(createPresignedNotebookInstanceUrlRequest.getSessionExpirationDurationInSeconds(),
                    SESSIONEXPIRATIONDURATIONINSECONDS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
