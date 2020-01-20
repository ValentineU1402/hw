package com.valentinushych.example_code.url_builder.model;

public class MyURL {
    private String protocol = "";
    private String domain = "";
    private String port = "";
    private String path = "";
    private String parameter = "";

    private MyURL() {
    }

    private MyURL(String protocol, String domain, String port, String path, String parameter) {
        this.protocol = protocol;
        this.domain = domain;
        this.port = port;
        this.path = path;
        this.parameter = parameter;
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

    public String getParameter() {
        return parameter;
    }

    @Override
    public String toString() {
        return getProtocol() + getDomain() + getPort() + getPath() + getParameter();
    }

    public static class Builder {
        private MyURL url;

        public Builder() {
            url = new MyURL();
        }

        public Builder(String protocol, String domain, String port, String path, String parameter) {
            url = new MyURL(protocol, domain, port, path, parameter);
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
            url.path = path.startsWith("/") ? path : "/" + path;
            return this;
        }

        public Builder withParameter(String parameter) {
            url.parameter += url.parameter.startsWith("?") ? parameter + "&" : "?" + parameter + "&";
            return this;
        }

        public Builder withParameters(String key, String value) {
            String param = key + "=" + value;
            url.parameter += url.parameter.startsWith("?") ? param + "&" : "?" + param + "&";
            return this;
        }

        public MyURL build() {
            return new MyURL(url.getProtocol(), url.getDomain(), url.getPort(), url.getPath(), url.getParameter());
        }
    }
}
