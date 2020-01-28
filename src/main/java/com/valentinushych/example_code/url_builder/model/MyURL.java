package com.valentinushych.example_code.url_builder.model;

import java.util.HashMap;
import java.util.Map;

public class MyURL {
    private String protocol = "";
    private String domain = "";
    private String port = "";
    private String path = "";
    private Map<String, String> parameters = new HashMap<>();

    private MyURL() {
    }

    private MyURL(String protocol, String domain, String port, String path, Map<String, String> parameter) {
        this.protocol = protocol;
        this.domain = domain;
        this.port = port;
        this.path = path;
        this.parameters.putAll(parameter);
    }

    public String getProtocol() {
        return protocol;
    }

    public String getDomain() {
        return domain;
    }

    public String getPort() {
        return port;
    }

    public String getPath() {
        return path;
    }

    public Map<String, String> getParameter() {
        return parameters;
    }

    @Override
    public String toString() {
        StringBuilder param = new StringBuilder();
        getParameter().entrySet().forEach(entry -> param.append(entry));
        return getProtocol() + getDomain() + getPort() + getPath() + param;
    }

    public static class Builder {
        private MyURL url;

        public Builder() {
            url = new MyURL();
        }

        public Builder withProtocol(String protocol) {
            url.protocol = protocol.isEmpty() ? "" : protocol + "://";
            return this;
        }

        public Builder withDomain(String domain) {
            url.domain = domain;
            return this;
        }

        public Builder withPort(Integer port) {
            url.port = ":" + port.toString();
            return this;
        }

        public Builder withPath(String path) {
            url.path = path.startsWith("/") ? path + "?" : "/" + path + "?";
            return this;
        }

        public Builder withParameter(String parameter) {
            url.parameters.put(parameter, "&");
            return this;
        }

        public Builder withParameters(String key, String value) {
            url.parameters.put(key, value + "&");
            return this;
        }

        public Builder withParameters(Map<String, String> parameters) {
            parameters.forEach((k, v) -> url.parameters.put(k, v + "&"));
            return this;
        }

        public MyURL build() {
            return new MyURL(url.getProtocol(), url.getDomain(), url.getPort(), url.getPath(), url.getParameter());
        }
    }
}
