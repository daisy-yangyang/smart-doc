/*
 * smart-doc
 *
 * Copyright (C) 2018-2021 smart-doc
 *
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.power.doc.model;

import java.util.Objects;

/**
 * Description:
 * http request header info model
 *
 * @author yu 2018/06/18.
 */
public class ApiReqHeader {

    /**
     * Request header name
     */
    private String name;

    /**
     * Request header type
     */
    private String type;

    /**
     * request header defaultValue
     */
    private String value;

    /**
     * Request header description
     */
    private String desc;

    /**
     * required flag
     *
     * @since 1.7.0
     */
    private boolean required;

    /**
     * Starting version number
     *
     * @since 1.7.0
     */
    private String since = "-";

    /**
     * @since 2.2.2
     * Regular expression match request header
     */
    private String pathPatterns;

    /**
     * @since 2.2.2
     * Regular expression ignore request header
     */
    private String excludePathPatterns;

    public static ApiReqHeader builder() {
        return new ApiReqHeader();
    }

    public String getName() {
        return name;
    }

    public ApiReqHeader setName(String name) {
        this.name = name;
        return this;
    }

    public String getType() {
        return type;
    }

    public ApiReqHeader setType(String type) {
        this.type = type;
        return this;
    }

    public String getDesc() {
        return desc;
    }

    public ApiReqHeader setDesc(String desc) {
        this.desc = desc;
        return this;
    }

    public boolean isRequired() {
        return required;
    }

    public ApiReqHeader setRequired(boolean required) {
        this.required = required;
        return this;
    }

    public String getSince() {
        return since;
    }

    public ApiReqHeader setSince(String since) {
        this.since = since;
        return this;
    }

    public String getValue() {
        return value;
    }

    public ApiReqHeader setValue(String value) {
        this.value = value;
        return this;
    }

    public String getPathPatterns() {
        return pathPatterns;
    }

    public ApiReqHeader setPathPatterns(String pathPatterns) {
        this.pathPatterns = pathPatterns;
        return this;
    }

    public String getExcludePathPatterns() {
        return excludePathPatterns;
    }

    public ApiReqHeader setExcludePathPatterns(String excludePathPatterns) {
        this.excludePathPatterns = excludePathPatterns;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ApiReqHeader that = (ApiReqHeader) o;
        return Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{");
        sb.append("\"name\":\"")
                .append(name).append('\"');
        sb.append(",\"type\":\"")
                .append(type).append('\"');
        sb.append(",\"value\":\"")
                .append(value).append('\"');
        sb.append(",\"desc\":\"")
                .append(desc).append('\"');
        sb.append(",\"required\":")
                .append(required);
        sb.append(",\"since\":\"")
                .append(since).append('\"');
        sb.append(",\"pathPatterns\":\"")
                .append(pathPatterns).append('\"');
        sb.append(",\"excludePathPatterns\":\"")
                .append(excludePathPatterns).append('\"');
        sb.append('}');
        return sb.toString();
    }
}
