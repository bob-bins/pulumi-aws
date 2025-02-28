// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.redshiftserverless.outputs;

import com.pulumi.aws.redshiftserverless.outputs.WorkgroupEndpointVpcEndpoint;
import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class WorkgroupEndpoint {
    /**
     * @return The DNS address of the VPC endpoint.
     * 
     */
    private @Nullable String address;
    /**
     * @return The port that Amazon Redshift Serverless listens on.
     * 
     */
    private @Nullable Integer port;
    /**
     * @return The VPC endpoint or the Redshift Serverless workgroup. See `VPC Endpoint` below.
     * 
     */
    private @Nullable List<WorkgroupEndpointVpcEndpoint> vpcEndpoints;

    private WorkgroupEndpoint() {}
    /**
     * @return The DNS address of the VPC endpoint.
     * 
     */
    public Optional<String> address() {
        return Optional.ofNullable(this.address);
    }
    /**
     * @return The port that Amazon Redshift Serverless listens on.
     * 
     */
    public Optional<Integer> port() {
        return Optional.ofNullable(this.port);
    }
    /**
     * @return The VPC endpoint or the Redshift Serverless workgroup. See `VPC Endpoint` below.
     * 
     */
    public List<WorkgroupEndpointVpcEndpoint> vpcEndpoints() {
        return this.vpcEndpoints == null ? List.of() : this.vpcEndpoints;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkgroupEndpoint defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String address;
        private @Nullable Integer port;
        private @Nullable List<WorkgroupEndpointVpcEndpoint> vpcEndpoints;
        public Builder() {}
        public Builder(WorkgroupEndpoint defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.address = defaults.address;
    	      this.port = defaults.port;
    	      this.vpcEndpoints = defaults.vpcEndpoints;
        }

        @CustomType.Setter
        public Builder address(@Nullable String address) {

            this.address = address;
            return this;
        }
        @CustomType.Setter
        public Builder port(@Nullable Integer port) {

            this.port = port;
            return this;
        }
        @CustomType.Setter
        public Builder vpcEndpoints(@Nullable List<WorkgroupEndpointVpcEndpoint> vpcEndpoints) {

            this.vpcEndpoints = vpcEndpoints;
            return this;
        }
        public Builder vpcEndpoints(WorkgroupEndpointVpcEndpoint... vpcEndpoints) {
            return vpcEndpoints(List.of(vpcEndpoints));
        }
        public WorkgroupEndpoint build() {
            final var _resultValue = new WorkgroupEndpoint();
            _resultValue.address = address;
            _resultValue.port = port;
            _resultValue.vpcEndpoints = vpcEndpoints;
            return _resultValue;
        }
    }
}
