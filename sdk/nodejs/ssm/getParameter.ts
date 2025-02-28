// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Provides an SSM Parameter data source.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const foo = aws.ssm.getParameter({
 *     name: "foo",
 * });
 * ```
 *
 * > **Note:** The unencrypted value of a SecureString will be stored in the raw state as plain-text.
 */
export function getParameter(args: GetParameterArgs, opts?: pulumi.InvokeOptions): Promise<GetParameterResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("aws:ssm/getParameter:getParameter", {
        "name": args.name,
        "withDecryption": args.withDecryption,
    }, opts);
}

/**
 * A collection of arguments for invoking getParameter.
 */
export interface GetParameterArgs {
    /**
     * Name of the parameter.
     */
    name: string;
    /**
     * Whether to return decrypted `SecureString` value. Defaults to `true`.
     *
     * In addition to all arguments above, the following attributes are exported:
     */
    withDecryption?: boolean;
}

/**
 * A collection of values returned by getParameter.
 */
export interface GetParameterResult {
    readonly arn: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly insecureValue: string;
    readonly name: string;
    readonly type: string;
    readonly value: string;
    readonly version: number;
    readonly withDecryption?: boolean;
}
/**
 * Provides an SSM Parameter data source.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const foo = aws.ssm.getParameter({
 *     name: "foo",
 * });
 * ```
 *
 * > **Note:** The unencrypted value of a SecureString will be stored in the raw state as plain-text.
 */
export function getParameterOutput(args: GetParameterOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetParameterResult> {
    return pulumi.output(args).apply((a: any) => getParameter(a, opts))
}

/**
 * A collection of arguments for invoking getParameter.
 */
export interface GetParameterOutputArgs {
    /**
     * Name of the parameter.
     */
    name: pulumi.Input<string>;
    /**
     * Whether to return decrypted `SecureString` value. Defaults to `true`.
     *
     * In addition to all arguments above, the following attributes are exported:
     */
    withDecryption?: pulumi.Input<boolean>;
}
