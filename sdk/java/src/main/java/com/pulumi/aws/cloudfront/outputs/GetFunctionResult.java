// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.cloudfront.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetFunctionResult {
    /**
     * @return ARN identifying your CloudFront Function.
     * 
     */
    private String arn;
    /**
     * @return Source code of the function
     * 
     */
    private String code;
    /**
     * @return Comment.
     * 
     */
    private String comment;
    /**
     * @return ETag hash of the function
     * 
     */
    private String etag;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return When this resource was last modified.
     * 
     */
    private String lastModifiedTime;
    private String name;
    /**
     * @return Identifier of the function&#39;s runtime.
     * 
     */
    private String runtime;
    private String stage;
    /**
     * @return Status of the function. Can be `UNPUBLISHED`, `UNASSOCIATED` or `ASSOCIATED`.
     * 
     */
    private String status;

    private GetFunctionResult() {}
    /**
     * @return ARN identifying your CloudFront Function.
     * 
     */
    public String arn() {
        return this.arn;
    }
    /**
     * @return Source code of the function
     * 
     */
    public String code() {
        return this.code;
    }
    /**
     * @return Comment.
     * 
     */
    public String comment() {
        return this.comment;
    }
    /**
     * @return ETag hash of the function
     * 
     */
    public String etag() {
        return this.etag;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return When this resource was last modified.
     * 
     */
    public String lastModifiedTime() {
        return this.lastModifiedTime;
    }
    public String name() {
        return this.name;
    }
    /**
     * @return Identifier of the function&#39;s runtime.
     * 
     */
    public String runtime() {
        return this.runtime;
    }
    public String stage() {
        return this.stage;
    }
    /**
     * @return Status of the function. Can be `UNPUBLISHED`, `UNASSOCIATED` or `ASSOCIATED`.
     * 
     */
    public String status() {
        return this.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetFunctionResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String arn;
        private String code;
        private String comment;
        private String etag;
        private String id;
        private String lastModifiedTime;
        private String name;
        private String runtime;
        private String stage;
        private String status;
        public Builder() {}
        public Builder(GetFunctionResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.code = defaults.code;
    	      this.comment = defaults.comment;
    	      this.etag = defaults.etag;
    	      this.id = defaults.id;
    	      this.lastModifiedTime = defaults.lastModifiedTime;
    	      this.name = defaults.name;
    	      this.runtime = defaults.runtime;
    	      this.stage = defaults.stage;
    	      this.status = defaults.status;
        }

        @CustomType.Setter
        public Builder arn(String arn) {
            if (arn == null) {
              throw new MissingRequiredPropertyException("GetFunctionResult", "arn");
            }
            this.arn = arn;
            return this;
        }
        @CustomType.Setter
        public Builder code(String code) {
            if (code == null) {
              throw new MissingRequiredPropertyException("GetFunctionResult", "code");
            }
            this.code = code;
            return this;
        }
        @CustomType.Setter
        public Builder comment(String comment) {
            if (comment == null) {
              throw new MissingRequiredPropertyException("GetFunctionResult", "comment");
            }
            this.comment = comment;
            return this;
        }
        @CustomType.Setter
        public Builder etag(String etag) {
            if (etag == null) {
              throw new MissingRequiredPropertyException("GetFunctionResult", "etag");
            }
            this.etag = etag;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetFunctionResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder lastModifiedTime(String lastModifiedTime) {
            if (lastModifiedTime == null) {
              throw new MissingRequiredPropertyException("GetFunctionResult", "lastModifiedTime");
            }
            this.lastModifiedTime = lastModifiedTime;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetFunctionResult", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder runtime(String runtime) {
            if (runtime == null) {
              throw new MissingRequiredPropertyException("GetFunctionResult", "runtime");
            }
            this.runtime = runtime;
            return this;
        }
        @CustomType.Setter
        public Builder stage(String stage) {
            if (stage == null) {
              throw new MissingRequiredPropertyException("GetFunctionResult", "stage");
            }
            this.stage = stage;
            return this;
        }
        @CustomType.Setter
        public Builder status(String status) {
            if (status == null) {
              throw new MissingRequiredPropertyException("GetFunctionResult", "status");
            }
            this.status = status;
            return this;
        }
        public GetFunctionResult build() {
            final var _resultValue = new GetFunctionResult();
            _resultValue.arn = arn;
            _resultValue.code = code;
            _resultValue.comment = comment;
            _resultValue.etag = etag;
            _resultValue.id = id;
            _resultValue.lastModifiedTime = lastModifiedTime;
            _resultValue.name = name;
            _resultValue.runtime = runtime;
            _resultValue.stage = stage;
            _resultValue.status = status;
            return _resultValue;
        }
    }
}
