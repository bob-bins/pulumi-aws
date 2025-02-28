// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.msk.inputs;

import com.pulumi.aws.msk.inputs.ServerlessClusterClientAuthenticationSaslIamArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.util.Objects;


public final class ServerlessClusterClientAuthenticationSaslArgs extends com.pulumi.resources.ResourceArgs {

    public static final ServerlessClusterClientAuthenticationSaslArgs Empty = new ServerlessClusterClientAuthenticationSaslArgs();

    /**
     * Details for client authentication using IAM. See below.
     * 
     */
    @Import(name="iam", required=true)
    private Output<ServerlessClusterClientAuthenticationSaslIamArgs> iam;

    /**
     * @return Details for client authentication using IAM. See below.
     * 
     */
    public Output<ServerlessClusterClientAuthenticationSaslIamArgs> iam() {
        return this.iam;
    }

    private ServerlessClusterClientAuthenticationSaslArgs() {}

    private ServerlessClusterClientAuthenticationSaslArgs(ServerlessClusterClientAuthenticationSaslArgs $) {
        this.iam = $.iam;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServerlessClusterClientAuthenticationSaslArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServerlessClusterClientAuthenticationSaslArgs $;

        public Builder() {
            $ = new ServerlessClusterClientAuthenticationSaslArgs();
        }

        public Builder(ServerlessClusterClientAuthenticationSaslArgs defaults) {
            $ = new ServerlessClusterClientAuthenticationSaslArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param iam Details for client authentication using IAM. See below.
         * 
         * @return builder
         * 
         */
        public Builder iam(Output<ServerlessClusterClientAuthenticationSaslIamArgs> iam) {
            $.iam = iam;
            return this;
        }

        /**
         * @param iam Details for client authentication using IAM. See below.
         * 
         * @return builder
         * 
         */
        public Builder iam(ServerlessClusterClientAuthenticationSaslIamArgs iam) {
            return iam(Output.of(iam));
        }

        public ServerlessClusterClientAuthenticationSaslArgs build() {
            if ($.iam == null) {
                throw new MissingRequiredPropertyException("ServerlessClusterClientAuthenticationSaslArgs", "iam");
            }
            return $;
        }
    }

}
