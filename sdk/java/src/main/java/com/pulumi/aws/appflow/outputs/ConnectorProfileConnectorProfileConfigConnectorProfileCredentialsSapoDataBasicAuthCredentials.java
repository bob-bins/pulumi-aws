// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appflow.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsSapoDataBasicAuthCredentials {
    /**
     * @return The password to use to connect to a resource.
     * 
     */
    private String password;
    /**
     * @return The username to use to connect to a resource.
     * 
     */
    private String username;

    private ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsSapoDataBasicAuthCredentials() {}
    /**
     * @return The password to use to connect to a resource.
     * 
     */
    public String password() {
        return this.password;
    }
    /**
     * @return The username to use to connect to a resource.
     * 
     */
    public String username() {
        return this.username;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsSapoDataBasicAuthCredentials defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String password;
        private String username;
        public Builder() {}
        public Builder(ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsSapoDataBasicAuthCredentials defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.password = defaults.password;
    	      this.username = defaults.username;
        }

        @CustomType.Setter
        public Builder password(String password) {
            if (password == null) {
              throw new MissingRequiredPropertyException("ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsSapoDataBasicAuthCredentials", "password");
            }
            this.password = password;
            return this;
        }
        @CustomType.Setter
        public Builder username(String username) {
            if (username == null) {
              throw new MissingRequiredPropertyException("ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsSapoDataBasicAuthCredentials", "username");
            }
            this.username = username;
            return this;
        }
        public ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsSapoDataBasicAuthCredentials build() {
            final var _resultValue = new ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsSapoDataBasicAuthCredentials();
            _resultValue.password = password;
            _resultValue.username = username;
            return _resultValue;
        }
    }
}
