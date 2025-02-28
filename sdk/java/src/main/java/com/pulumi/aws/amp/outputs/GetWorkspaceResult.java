// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.amp.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetWorkspaceResult {
    /**
     * @return Prometheus workspace alias.
     * 
     */
    private String alias;
    /**
     * @return ARN of the Prometheus workspace.
     * 
     */
    private String arn;
    /**
     * @return Creation date of the Prometheus workspace.
     * 
     */
    private String createdDate;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return Endpoint of the Prometheus workspace.
     * 
     */
    private String prometheusEndpoint;
    /**
     * @return Status of the Prometheus workspace.
     * 
     */
    private String status;
    /**
     * @return Tags assigned to the resource.
     * 
     */
    private Map<String,String> tags;
    private String workspaceId;

    private GetWorkspaceResult() {}
    /**
     * @return Prometheus workspace alias.
     * 
     */
    public String alias() {
        return this.alias;
    }
    /**
     * @return ARN of the Prometheus workspace.
     * 
     */
    public String arn() {
        return this.arn;
    }
    /**
     * @return Creation date of the Prometheus workspace.
     * 
     */
    public String createdDate() {
        return this.createdDate;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Endpoint of the Prometheus workspace.
     * 
     */
    public String prometheusEndpoint() {
        return this.prometheusEndpoint;
    }
    /**
     * @return Status of the Prometheus workspace.
     * 
     */
    public String status() {
        return this.status;
    }
    /**
     * @return Tags assigned to the resource.
     * 
     */
    public Map<String,String> tags() {
        return this.tags;
    }
    public String workspaceId() {
        return this.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetWorkspaceResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String alias;
        private String arn;
        private String createdDate;
        private String id;
        private String prometheusEndpoint;
        private String status;
        private Map<String,String> tags;
        private String workspaceId;
        public Builder() {}
        public Builder(GetWorkspaceResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.alias = defaults.alias;
    	      this.arn = defaults.arn;
    	      this.createdDate = defaults.createdDate;
    	      this.id = defaults.id;
    	      this.prometheusEndpoint = defaults.prometheusEndpoint;
    	      this.status = defaults.status;
    	      this.tags = defaults.tags;
    	      this.workspaceId = defaults.workspaceId;
        }

        @CustomType.Setter
        public Builder alias(String alias) {
            if (alias == null) {
              throw new MissingRequiredPropertyException("GetWorkspaceResult", "alias");
            }
            this.alias = alias;
            return this;
        }
        @CustomType.Setter
        public Builder arn(String arn) {
            if (arn == null) {
              throw new MissingRequiredPropertyException("GetWorkspaceResult", "arn");
            }
            this.arn = arn;
            return this;
        }
        @CustomType.Setter
        public Builder createdDate(String createdDate) {
            if (createdDate == null) {
              throw new MissingRequiredPropertyException("GetWorkspaceResult", "createdDate");
            }
            this.createdDate = createdDate;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetWorkspaceResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder prometheusEndpoint(String prometheusEndpoint) {
            if (prometheusEndpoint == null) {
              throw new MissingRequiredPropertyException("GetWorkspaceResult", "prometheusEndpoint");
            }
            this.prometheusEndpoint = prometheusEndpoint;
            return this;
        }
        @CustomType.Setter
        public Builder status(String status) {
            if (status == null) {
              throw new MissingRequiredPropertyException("GetWorkspaceResult", "status");
            }
            this.status = status;
            return this;
        }
        @CustomType.Setter
        public Builder tags(Map<String,String> tags) {
            if (tags == null) {
              throw new MissingRequiredPropertyException("GetWorkspaceResult", "tags");
            }
            this.tags = tags;
            return this;
        }
        @CustomType.Setter
        public Builder workspaceId(String workspaceId) {
            if (workspaceId == null) {
              throw new MissingRequiredPropertyException("GetWorkspaceResult", "workspaceId");
            }
            this.workspaceId = workspaceId;
            return this;
        }
        public GetWorkspaceResult build() {
            final var _resultValue = new GetWorkspaceResult();
            _resultValue.alias = alias;
            _resultValue.arn = arn;
            _resultValue.createdDate = createdDate;
            _resultValue.id = id;
            _resultValue.prometheusEndpoint = prometheusEndpoint;
            _resultValue.status = status;
            _resultValue.tags = tags;
            _resultValue.workspaceId = workspaceId;
            return _resultValue;
        }
    }
}
