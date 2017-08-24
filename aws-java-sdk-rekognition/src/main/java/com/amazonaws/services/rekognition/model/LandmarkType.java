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
package com.amazonaws.services.rekognition.model;

import javax.annotation.Generated;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum LandmarkType {

    EyeLeft("eyeLeft"),
    EyeRight("eyeRight"),
    Nose("nose"),
    MouthLeft("mouthLeft"),
    MouthRight("mouthRight"),
    LeftEyeBrowLeft("leftEyeBrowLeft"),
    LeftEyeBrowRight("leftEyeBrowRight"),
    LeftEyeBrowUp("leftEyeBrowUp"),
    RightEyeBrowLeft("rightEyeBrowLeft"),
    RightEyeBrowRight("rightEyeBrowRight"),
    RightEyeBrowUp("rightEyeBrowUp"),
    LeftEyeLeft("leftEyeLeft"),
    LeftEyeRight("leftEyeRight"),
    LeftEyeUp("leftEyeUp"),
    LeftEyeDown("leftEyeDown"),
    RightEyeLeft("rightEyeLeft"),
    RightEyeRight("rightEyeRight"),
    RightEyeUp("rightEyeUp"),
    RightEyeDown("rightEyeDown"),
    NoseLeft("noseLeft"),
    NoseRight("noseRight"),
    MouthUp("mouthUp"),
    MouthDown("mouthDown"),
    LeftPupil("leftPupil"),
    RightPupil("rightPupil");

    private String value;

    private LandmarkType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value
     *        real value
     * @return LandmarkType corresponding to the value
     */
    public static LandmarkType fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (LandmarkType enumEntry : LandmarkType.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
