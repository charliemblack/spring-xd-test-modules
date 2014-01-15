/*
 * Copyright 2014 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.gopivotal.test.gemfire;

import java.io.Serializable;

/**
 * @author Charlie Black
 *         on 1/13/14.
 */
public class SampleData implements Serializable{
    private Object oldPayload;
    private String machineNmae;

    public SampleData() {
    }

    public SampleData(Object oldPayload, String machineNmae) {
        this.oldPayload = oldPayload;
        this.machineNmae = machineNmae;
    }

    public Object getOldPayload() {
        return oldPayload;
    }

    public void setOldPayload(Object oldPayload) {
        this.oldPayload = oldPayload;
    }

    public String getMachineNmae() {
        return machineNmae;
    }

    public void setMachineNmae(String machineNmae) {
        this.machineNmae = machineNmae;
    }

    @Override
    public String toString() {
        return "SampleData{" +
                "oldPayload=" + oldPayload +
                ", machineNmae='" + machineNmae + '\'' +
                '}';
    }
}
