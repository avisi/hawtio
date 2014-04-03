package io.hawt.web.asquare;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

//Below statement means that class "Country.java" is the root-element of our example
@XmlRootElement(namespace = "org.arpit.javapostsforlearning.jaxb.User")
public class Connection {


    String connectionName;
    String scheme;
    String host;
    String path;
    int port;
    String userName;
    String password;
    boolean useProxy;

    public String getConnectionName() {
        return connectionName;
    }
    @XmlElement
    public void setConnectionName(String connectionName) {
        this.connectionName = connectionName;
    }

    public String getScheme() {
        return scheme;
    }
    @XmlElement
    public void setScheme(String scheme) {
        this.scheme = scheme;
    }

    public String getHost() {
        return host;
    }
    @XmlElement
    public void setHost(String host) {
        this.host = host;
    }

    public String getPath() {
        return path;
    }
    @XmlElement
    public void setPath(String path) {
        this.path = path;
    }

    public int getPort() {
        return port;
    }
    @XmlElement
    public void setPort(int port) {
        this.port = port;
    }

    public String getUserName() {
        return userName;
    }
    @XmlElement
    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }
    @XmlElement
    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isUseProxy() {
        return useProxy;
    }
    @XmlElement
    public void setUseProxy(boolean useProxy) {
        this.useProxy = useProxy;
    }

}

