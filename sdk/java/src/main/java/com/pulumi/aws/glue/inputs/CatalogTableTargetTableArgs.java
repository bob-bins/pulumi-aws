// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.glue.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class CatalogTableTargetTableArgs extends com.pulumi.resources.ResourceArgs {

    public static final CatalogTableTargetTableArgs Empty = new CatalogTableTargetTableArgs();

    /**
     * ID of the Data Catalog in which the table resides.
     * 
     */
    @Import(name="catalogId", required=true)
    private Output<String> catalogId;

    /**
     * @return ID of the Data Catalog in which the table resides.
     * 
     */
    public Output<String> catalogId() {
        return this.catalogId;
    }

    /**
     * Name of the catalog database that contains the target table.
     * 
     */
    @Import(name="databaseName", required=true)
    private Output<String> databaseName;

    /**
     * @return Name of the catalog database that contains the target table.
     * 
     */
    public Output<String> databaseName() {
        return this.databaseName;
    }

    /**
     * Name of the target table.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return Name of the target table.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    private CatalogTableTargetTableArgs() {}

    private CatalogTableTargetTableArgs(CatalogTableTargetTableArgs $) {
        this.catalogId = $.catalogId;
        this.databaseName = $.databaseName;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CatalogTableTargetTableArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CatalogTableTargetTableArgs $;

        public Builder() {
            $ = new CatalogTableTargetTableArgs();
        }

        public Builder(CatalogTableTargetTableArgs defaults) {
            $ = new CatalogTableTargetTableArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param catalogId ID of the Data Catalog in which the table resides.
         * 
         * @return builder
         * 
         */
        public Builder catalogId(Output<String> catalogId) {
            $.catalogId = catalogId;
            return this;
        }

        /**
         * @param catalogId ID of the Data Catalog in which the table resides.
         * 
         * @return builder
         * 
         */
        public Builder catalogId(String catalogId) {
            return catalogId(Output.of(catalogId));
        }

        /**
         * @param databaseName Name of the catalog database that contains the target table.
         * 
         * @return builder
         * 
         */
        public Builder databaseName(Output<String> databaseName) {
            $.databaseName = databaseName;
            return this;
        }

        /**
         * @param databaseName Name of the catalog database that contains the target table.
         * 
         * @return builder
         * 
         */
        public Builder databaseName(String databaseName) {
            return databaseName(Output.of(databaseName));
        }

        /**
         * @param name Name of the target table.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the target table.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public CatalogTableTargetTableArgs build() {
            if ($.catalogId == null) {
                throw new MissingRequiredPropertyException("CatalogTableTargetTableArgs", "catalogId");
            }
            if ($.databaseName == null) {
                throw new MissingRequiredPropertyException("CatalogTableTargetTableArgs", "databaseName");
            }
            if ($.name == null) {
                throw new MissingRequiredPropertyException("CatalogTableTargetTableArgs", "name");
            }
            return $;
        }
    }

}
